import * as report from "multiple-cucumber-html-reporter";
report.generate({
  jsonDir: "reports",
  reportPath: "./reports/detailed-html",
  reportName: "Playwright BDD Report",
  pageTitle: "LMS est Report",
  displayDuration: false,
  metadata: {
    browser: {
      name: "chrome",
      version: "118",
    },
device: "VIGNESHWARAN - Machine",
    platform: {
      name: "Windows",
      version: "11",
    },
  },
});