const bcrypt = require("bcryptjs");

module.exports = [
  {
    id: 1,
    name: "Admin",
    email: "admin@test.com",
    password: bcrypt.hashSync("admin123", 10),
    role: "admin"
  }
];