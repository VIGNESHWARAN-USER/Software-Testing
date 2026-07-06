import * as report from "multiple-cucumber-html-reporter";
report.generate({
    jsonDir: "reports",
    reportPath: "./",
    reportName: "Playwright BDD Report",
    pageTitle: "Automation Exercise Login Test Report",
    displayDuration: false,
    metadata: {
        browser: {
            name: "chrome",
            version: "118",
        },
        device: "Tamil - Machine",
        platform: {
            name: "Windows",
            version: "10",
        },
    },
    customData: {
        title: "Test info",
        data: [
            { label: "Project", value: "Automation exercise" },
            { label: "Release", value: "1.2.3" },
            { label: "Cycle", value: "Smoke-1" },],
    },
});