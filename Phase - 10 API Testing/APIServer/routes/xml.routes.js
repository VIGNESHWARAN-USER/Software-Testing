const express = require("express");
const router = express.Router();
const xml2js = require("xml2js");
const { success, error } = require("../utils/response");

router.post("/product", async (req, res) => {
  try {
    const parsedXml = await xml2js.parseStringPromise(req.body);
    success(res, 200, "XML received successfully", parsedXml, "Set Content-Type: application/xml when sending XML");
  } catch {
    error(res, 400, "Invalid XML format", "Send proper XML data");
  }
});

module.exports = router;
