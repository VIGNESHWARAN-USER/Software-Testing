import * as report from "multiple-cucumber-html-reporter";
report.generate({
  jsonDir: "reports",
  reportPath: "./reports/detailed-html",
  reportName: "Playwright BDD Report",
  pageTitle: "BookCart App test report",
  displayDuration: false,
  metadata: {
    browser: {
      name: "chrome",
      version: "118",
    },
device: "VIGNESHWARAN - Machine",
    platform: {
      name: "Windows",
      version: "11 Pro",
    },
  },
  customData: {
    title: "Test info",
    data: [
      { label: "Project", value: "Book Cart Project" },
      { label: "Release", value: "1.2.3" },
      { label: "Cycle", value: "Smoke-1" },      ],    },  });