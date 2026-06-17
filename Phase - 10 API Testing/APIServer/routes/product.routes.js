// routes/product.routes.js

const express = require("express");
const router = express.Router();

const products = require("../data/products");
const { success, error } = require("../utils/response");
const { authenticate, authorize } = require("../middleware/auth.middleware");
const { productSchema, productPatchSchema } = require("../validations/product.schema");

// GET products with pagination and search
router.get("/", (req, res) => {
  let { page = 1, limit = 10, search, minPrice, maxPrice } = req.query;

  page = Number(page);
  limit = Number(limit);

  let filteredProducts = [...products];

  if (search) {
    filteredProducts = filteredProducts.filter(product =>
      product.name.toLowerCase().includes(search.toLowerCase())
    );
  }

  if (minPrice) {
    filteredProducts = filteredProducts.filter(product =>
      product.price >= Number(minPrice)
    );
  }

  if (maxPrice) {
    filteredProducts = filteredProducts.filter(product =>
      product.price <= Number(maxPrice)
    );
  }

  const startIndex = (page - 1) * limit;
  const endIndex = page * limit;

  const paginatedProducts = filteredProducts.slice(startIndex, endIndex);

  success(res, 200, "Products fetched successfully", {
    page,
    limit,
    totalProducts: filteredProducts.length,
    totalPages: Math.ceil(filteredProducts.length / limit),
    products: paginatedProducts
  });
});

// GET product by ID
router.get("/:id", (req, res) => {
  const product = products.find(p => p.id === Number(req.params.id));

  if (!product) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  success(res, 200, "Product fetched successfully", product);
});

// POST product
router.post("/", authenticate, authorize("admin"), (req, res) => {
  const { error: validationError } = productSchema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send valid product data");
  }

  const newProduct = {
    id: products.length + 1,
    name: req.body.name,
    price: req.body.price,
    stock: req.body.stock
  };

  products.push(newProduct);

  success(res, 201, "Product created successfully", newProduct);
});

// PUT product
router.put("/:id", authenticate, authorize("admin"), (req, res) => {
  const product = products.find(p => p.id === Number(req.params.id));

  if (!product) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  const { error: validationError } = productSchema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send valid product data");
  }

  product.name = req.body.name;
  product.price = req.body.price;
  product.stock = req.body.stock;

  success(res, 200, "Product fully updated successfully", product);
});

// PATCH product
router.patch("/:id", authenticate, authorize("admin"), (req, res) => {
  const product = products.find(p => p.id === Number(req.params.id));

  if (!product) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  const { error: validationError } = productPatchSchema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send valid fields");
  }

  if (req.body.name !== undefined) product.name = req.body.name;
  if (req.body.price !== undefined) product.price = req.body.price;
  if (req.body.stock !== undefined) product.stock = req.body.stock;

  success(res, 200, "Product partially updated successfully", product);
});

// DELETE product
router.delete("/:id", authenticate, authorize("admin"), (req, res) => {
  const index = products.findIndex(p => p.id === Number(req.params.id));

  if (index === -1) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  products.splice(index, 1);

  success(res, 200, "Product deleted successfully");
});

module.exports = router;