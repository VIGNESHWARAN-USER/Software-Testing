const express = require("express");
const router = express.Router();
const Joi = require("joi");
const bcrypt = require("bcryptjs");

const users = require("../data/users");
const { success, error } = require("../utils/response");
const { authenticate, authorize } = require("../middleware/auth.middleware");

// GET all users (with pagination)
router.get("/", authenticate, authorize("admin"), (req, res) => {
  let { page = 1, limit = 10, search, role } = req.query;
  page = Number(page);
  limit = Number(limit);

  let filteredUsers = [...users];

  if (search) {
    filteredUsers = filteredUsers.filter(u => u.name.toLowerCase().includes(search.toLowerCase()) || u.email.toLowerCase().includes(search.toLowerCase()));
  }

  if (role) {
    filteredUsers = filteredUsers.filter(u => u.role === role);
  }

  const startIndex = (page - 1) * limit;
  const endIndex = page * limit;
  const paginatedUsers = filteredUsers.slice(startIndex, endIndex);

  success(res, 200, "Users fetched successfully", {
    page,
    limit,
    totalUsers: filteredUsers.length,
    totalPages: Math.ceil(filteredUsers.length / limit),
    users: paginatedUsers.map(user => ({ id: user.id, name: user.name, email: user.email, role: user.role }))
  });
});

// GET user by ID
router.get("/:id", authenticate, authorize("admin"), (req, res) => {
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

// PUT full update
router.put("/:id", authenticate, authorize("admin"), (req, res) => {
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

// PATCH partial update
router.patch("/:id", authenticate, authorize("admin"), (req, res) => {
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

// DELETE user
router.delete("/:id", authenticate, authorize("admin"), (req, res) => {
  const userId = Number(req.params.id);
  const index = users.findIndex(u => u.id === userId);

  if (index === -1) {
    return error(res, 404, "User not found", "Use a valid user ID");
  }

  users.splice(index, 1);
  success(res, 200, "User deleted successfully");
});

module.exports = router;
