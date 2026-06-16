const express = require("express");
const cors = require("cors");
const helmet = require("helmet");
const morgan = require("morgan");
const rateLimit = require("express-rate-limit");
const jwt = require("jsonwebtoken");
const bcrypt = require("bcryptjs");
const Joi = require("joi");
const xml2js = require("xml2js");

const app = express();
const PORT = 5000;
const JWT_SECRET = "practice_secret_key";

// Middleware
app.use(cors());
app.use(helmet());
app.use(morgan("dev"));
app.use(express.json());
app.use(express.text({ type: "application/xml" }));

// Rate Limit
app.use(
  rateLimit({
    windowMs: 60 * 1000,
    limit: 20,
    message: {
      status: 429,
      statusText: "Too Many Requests",
      message: "Rate limit exceeded. Try again later."
    }
  })
);

// Fake DB
let users = [
  {
    id: 1,
    name: "Admin",
    email: "admin@test.com",
    password: bcrypt.hashSync("admin123", 10),
    role: "admin"
  }
];

let products = [
  { id: 1, name: "Laptop", price: 50000, stock: 10 },
  { id: 2, name: "Mouse", price: 500, stock: 100 }
];

// Standard response
function success(res, statusCode, message, data = null) {
  return res.status(statusCode).json({
    status: statusCode,
    statusText: "Success",
    message,
    data
  });
}

function error(res, statusCode, message, suggestion = null) {
  return res.status(statusCode).json({
    status: statusCode,
    statusText: "Error",
    message,
    suggestion
  });
}

// JWT Authentication Middleware
function authenticate(req, res, next) {
  const authHeader = req.headers.authorization;

  if (!authHeader) {
    return error(res, 401, "Authorization token missing", "Send Bearer token in Authorization header");
  }

  const token = authHeader.split(" ")[1];

  try {
    const decoded = jwt.verify(token, JWT_SECRET);
    req.user = decoded;
    next();
  } catch {
    return error(res, 401, "Invalid or expired token", "Login again and use a valid token");
  }
}

// Role Authorization Middleware
function authorize(role) {
  return (req, res, next) => {
    if (req.user.role !== role) {
      return error(res, 403, "Access denied", "Only admin users can access this API");
    }
    next();
  };
}

// Basic API
app.get("/", (req, res) => {
  success(res, 200, "API Testing Practice Server is running", {
    version: "v1",
    docs: "/api/health"
  });
});

app.get("/api/health", (req, res) => {
  success(res, 200, "Server health is good", {
    uptime: process.uptime()
  });
});

// Register
app.post("/api/auth/register", (req, res) => {
  const schema = Joi.object({
    name: Joi.string().min(3).required(),
    email: Joi.string().email().required(),
    password: Joi.string().min(6).required(),
    role: Joi.string().valid("user", "admin").default("user")
  });

  const { error: validationError } = schema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send valid JSON body");
  }

  const existingUser = users.find(u => u.email === req.body.email);

  if (existingUser) {
    return error(res, 409, "Email already exists", "Use a different email address");
  }

  const newUser = {
    id: users.length + 1,
    name: req.body.name,
    email: req.body.email,
    password: bcrypt.hashSync(req.body.password, 10),
    role: req.body.role
  };

  users.push(newUser);

  success(res, 201, "User registered successfully", {
    id: newUser.id,
    name: newUser.name,
    email: newUser.email,
    role: newUser.role
  });
});

// Login
app.post("/api/auth/login", (req, res) => {
  const { email, password } = req.body;

  const user = users.find(u => u.email === email);

  if (!user) {
    return error(res, 404, "User not found", "Register first before login");
  }

  const isPasswordValid = bcrypt.compareSync(password, user.password);

  if (!isPasswordValid) {
    return error(res, 401, "Invalid password", "Check your password and try again");
  }

  const token = jwt.sign(
    { id: user.id, email: user.email, role: user.role },
    JWT_SECRET,
    { expiresIn: "1h" }
  );

  success(res, 200, "Login successful", {
    token,
    tokenType: "Bearer"
  });
});

app.get("/api/users", authenticate, authorize("admin"), (req, res) => {

    success(
        res,
        200,
        "Users fetched successfully",
        users.map(user => ({
            id: user.id,
            name: user.name,
            email: user.email,
            role: user.role
        }))
    );
});

app.get("/api/users/:id", authenticate, authorize("admin"), (req, res) => {

  const userId = Number(req.params.id);

  const user = users.find(u => u.id === userId);

  if (!user) {
    return error(res, 404, "User not found", "Use a valid user ID");
  }

  success(res, 200, "User fetched successfully", {
    id: user.id,
    name: user.name,
    email: user.email,
    role: user.role
  });
});

app.put("/api/users/:id", authenticate, authorize("admin"), (req, res) => {
  const userId = Number(req.params.id);

  const user = users.find(u => u.id === userId);

  if (!user) {
    return error(res, 404, "User not found", "Use a valid user ID");
  }

  const schema = Joi.object({
    name: Joi.string().min(3).required(),
    email: Joi.string().email().required(),
    password: Joi.string().min(6).required(),
    role: Joi.string().valid("user", "admin").required()
  });

  const { error: validationError } = schema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send valid name, email, password, and role");
  }

  user.name = req.body.name;
  user.email = req.body.email;
  user.password = bcrypt.hashSync(req.body.password, 10);
  user.role = req.body.role;

  success(res, 200, "User fully updated successfully", {
    id: user.id,
    name: user.name,
    email: user.email,
    role: user.role
  });
});

app.patch("/api/users/:id", authenticate, authorize("admin"), (req, res) => {
  const userId = Number(req.params.id);

  const user = users.find(u => u.id === userId);

  if (!user) {
    return error(res, 404, "User not found", "Use a valid user ID");
  }

  const schema = Joi.object({
    name: Joi.string().min(3),
    email: Joi.string().email(),
    password: Joi.string().min(6),
    role: Joi.string().valid("user", "admin")
  });

  const { error: validationError } = schema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send valid fields for update");
  }

  if (req.body.name !== undefined) user.name = req.body.name;
  if (req.body.email !== undefined) user.email = req.body.email;
  if (req.body.password !== undefined) user.password = bcrypt.hashSync(req.body.password, 10);
  if (req.body.role !== undefined) user.role = req.body.role;

  success(res, 200, "User partially updated successfully", {
    id: user.id,
    name: user.name,
    email: user.email,
    role: user.role
  });
});

app.delete("/api/users/:id", authenticate, authorize("admin"), (req, res) => {
  const userId = Number(req.params.id);

  const index = users.findIndex(u => u.id === userId);

  if (index === -1) {
    return error(res, 404, "User not found", "Use a valid user ID");
  }

  users.splice(index, 1);

  success(res, 200, "User deleted successfully");
});


// GET all products
app.get("/api/products", (req, res) => {
  success(res, 200, "Products fetched successfully", products);
});

// GET product by ID
app.get("/api/products/:id", (req, res) => {
  const product = products.find(p => p.id === Number(req.params.id));

  if (!product) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  success(res, 200, "Product fetched successfully", product);
});

// POST create product
app.post("/api/products", authenticate, authorize("admin"), (req, res) => {
  const schema = Joi.object({
    name: Joi.string().min(2).required(),
    price: Joi.number().positive().required(),
    stock: Joi.number().integer().min(0).required()
  });

  const { error: validationError } = schema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send name, price, and stock correctly");
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

// PUT full update
app.put("/api/products/:id", authenticate, authorize("admin"), (req, res) => {
  const product = products.find(p => p.id === Number(req.params.id));

  if (!product) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  product.name = req.body.name;
  product.price = req.body.price;
  product.stock = req.body.stock;

  success(res, 200, "Product fully updated successfully", product);
});

// PATCH partial update
app.patch("/api/products/:id", authenticate, authorize("admin"), (req, res) => {
  const product = products.find(p => p.id === Number(req.params.id));

  if (!product) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  if (req.body.name !== undefined) product.name = req.body.name;
  if (req.body.price !== undefined) product.price = req.body.price;
  if (req.body.stock !== undefined) product.stock = req.body.stock;

  success(res, 200, "Product partially updated successfully", product);
});

// DELETE
app.delete("/api/products/:id", authenticate, authorize("admin"), (req, res) => {
  const index = products.findIndex(p => p.id === Number(req.params.id));

  if (index === -1) {
    return error(res, 404, "Product not found", "Use a valid product ID");
  }

  products.splice(index, 1);

  success(res, 200, "Product deleted successfully");
});

// XML input testing
app.post("/api/xml/product", async (req, res) => {
  try {
    const parsedXml = await xml2js.parseStringPromise(req.body);
    success(res, 200, "XML received successfully", parsedXml);
  } catch {
    error(res, 400, "Invalid XML format", "Send proper XML data");
    suggestion("Give correct XML format not JSon")
  }
});

// SQL Injection practice protection
app.post("/api/search", (req, res) => {
  const { keyword } = req.body;

  const blockedPatterns = ["'", "--", ";", "DROP", "DELETE", "INSERT", "UPDATE", " OR ", "1=1"];

  const isSuspicious = blockedPatterns.some(pattern =>
    keyword?.toUpperCase().includes(pattern.toUpperCase())
  );

  if (isSuspicious) {
    return error(res, 400, "Suspicious input blocked", "Avoid SQL injection patterns");
  }

  success(res, 200, "Search completed safely", {
    keyword
  });
});

// 404
app.use((req, res) => {
  error(res, 404, "API endpoint not found", "Check API URL and HTTP method");
});

app.listen(PORT, () => {
  console.log(`API Testing Practice Server running on http://localhost:${PORT}`);
});