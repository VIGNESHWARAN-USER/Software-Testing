const express = require("express");
const router = express.Router();

const jwt = require("jsonwebtoken");
const bcrypt = require("bcryptjs");

const users = require("../data/users");
const { success, error } = require("../utils/response");
const { authenticate } = require("../middleware/auth.middleware");
const { registerSchema } = require("../validations/user.schema");

const JWT_SECRET = "practice_secret_key";

// Register
router.post("/register", (req, res) => {
  const { error: validationError } = registerSchema.validate(req.body);

  if (validationError) {
    return error(res, 400, validationError.details[0].message, "Send valid JSON body");
  }

  const existingUser = users.find(u => u.email === req.body.email);

  if (existingUser) {
    return error(res, 409, "Email already exists", "Use a different email address");
  }

  const newUser = {
    id: users.length ? users[users.length - 1].id + 1 : 1,
    name: req.body.name,
    email: req.body.email,
    password: bcrypt.hashSync(req.body.password, 10),
    role: req.body.role || "user"
  };

  users.push(newUser);

  success(res, 201, "User registered successfully", {
    id: newUser.id,
    name: newUser.name,
    email: newUser.email,
    role: newUser.role
  });
});

// Delete Registration (Requested feature: "register i need create and delete it")
router.delete("/register/:email", (req, res) => {
  const index = users.findIndex(u => u.email === req.params.email);
  if (index === -1) {
    return error(res, 404, "User not found", "Provide a valid email to delete");
  }
  users.splice(index, 1);
  success(res, 200, "User registration deleted successfully");
});

// Login
router.post("/login", (req, res) => {
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

// /me CRUD - GET
router.get("/me", authenticate, (req, res) => {
  const user = users.find(u => u.id === req.user.id);
  if (!user) return error(res, 404, "User not found");
  
  success(res, 200, "Current user fetched successfully", {
    id: user.id, name: user.name, email: user.email, role: user.role
  });
});

// /me CRUD - DELETE
router.delete("/me", authenticate, (req, res) => {
  const index = users.findIndex(u => u.id === req.user.id);
  if (index === -1) return error(res, 404, "User not found");
  
  users.splice(index, 1);
  success(res, 200, "Current user deleted successfully");
});

module.exports = router;
