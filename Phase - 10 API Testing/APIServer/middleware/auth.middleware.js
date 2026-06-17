const jwt = require("jsonwebtoken");
const { error } = require("../utils/response");

const JWT_SECRET = "practice_secret_key";

function authenticate(req, res, next) {

  const authHeader = req.headers.authorization;

  if (!authHeader) {
    return error(
      res,
      401,
      "Authorization token missing"
    );
  }

  const token = authHeader.split(" ")[1];

  try {

    req.user = jwt.verify(
      token,
      JWT_SECRET
    );

    next();

  } catch {

    return error(
      res,
      401,
      "Invalid or expired token"
    );
  }
}

function authorize(role) {

  return (req, res, next) => {

    if (req.user.role !== role) {

      return error(
        res,
        403,
        "Access denied"
      );
    }

    next();
  };
}

module.exports = {
  authenticate,
  authorize
};