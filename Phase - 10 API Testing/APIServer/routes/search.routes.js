const express = require("express");
const router = express.Router();
const { success, error } = require("../utils/response");

router.post("/", (req, res) => {
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

module.exports = router;
