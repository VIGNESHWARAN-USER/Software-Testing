const Joi = require("joi");

const productSchema =
Joi.object({

  name:
    Joi.string()
       .required(),

  price:
    Joi.number()
       .positive()
       .required(),

  stock:
    Joi.number()
       .required()
});

module.exports = {
  productSchema
};