module.exports = {
  default: {
    paths: ["features/**/*.feature"],
    require: [
      "stepDefinitions/**/*.ts",
      "support/**/*.ts"
    ],
    requireModule: ["ts-node/register"],
    format: [
      "progress",
      "json:reports/cucumber-report.json",
      "html:reports/cucumber-report.html"
    ],
    publishQuiet: true
  }
};