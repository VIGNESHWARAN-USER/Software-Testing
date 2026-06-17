const rateLimit =
require("express-rate-limit");

module.exports = rateLimit({

  windowMs: 60 * 1000,

  limit: 20,

  message: {

    status: 429,

    statusText:
      "Too Many Requests",

    message:
      "Rate limit exceeded"

  }

});