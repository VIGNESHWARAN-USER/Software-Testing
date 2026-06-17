const { error } =
require("../utils/response");

module.exports =
(req, res) => {

  error(
    res,
    404,
    "API endpoint not found",
    "Check URL and HTTP method"
  );

};