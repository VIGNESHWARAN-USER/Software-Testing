module.exports = {
  default: {
    requireModule: ["ts-node/register"],
    require: [
      "src/test/steps/**/*.ts",
      "src/test/hooks/**/*.ts"
    ],
    format: ["progress"],
    publishQuiet: true
  }
};