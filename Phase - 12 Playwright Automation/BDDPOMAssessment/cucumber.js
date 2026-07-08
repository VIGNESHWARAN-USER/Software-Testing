module.exports = {
    default: {
        requireModule: ["ts-node/register"],

        require: [
            "src/test/steps/**/*.ts",
            "src/test/hooks/**/*.ts"
        ],

        paths: [
            "src/test/features/**/*.feature"
        ],

        formatOptions: {
            snippetInterface: "async-await"
        },

        
        format: [
            "progress",
            "json:reports/cucumber-report.json",
            "html:reports/cucumber-report.html",
        ],
    }
};
