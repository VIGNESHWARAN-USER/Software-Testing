// routes/docs.routes.js

const express = require("express");
const router = express.Router();

router.get("/", (req, res) => {
  res.send(`
    <html>
      <head>
        <title>API Documentation</title>
        <style>
          body { font-family: Arial; padding: 30px; background: #f4f6f8; }
          h1 { color: #222; }
          section { background: white; padding: 20px; margin-bottom: 20px; border-radius: 10px; }
          code { background: #eee; padding: 4px 8px; border-radius: 5px; }
        </style>
      </head>
      <body>
        <h1>API Testing Practice Documentation</h1>

        <section>
          <h2>Auth APIs</h2>
          <p><code>POST /api/auth/register</code></p>
          <p><code>POST /api/auth/login</code></p>
        </section>

        <section>
          <h2>User APIs</h2>
          <p><code>GET /api/users</code></p>
          <p><code>GET /api/users/:id</code></p>
          <p><code>PUT /api/users/:id</code></p>
          <p><code>PATCH /api/users/:id</code></p>
          <p><code>DELETE /api/users/:id</code></p>
        </section>

        <section>
          <h2>Product APIs</h2>
          <p><code>GET /api/products?page=1&limit=10</code></p>
          <p><code>GET /api/products?search=laptop</code></p>
          <p><code>GET /api/products?minPrice=1000&maxPrice=50000</code></p>
          <p><code>POST /api/products</code></p>
          <p><code>PUT /api/products/:id</code></p>
          <p><code>PATCH /api/products/:id</code></p>
          <p><code>DELETE /api/products/:id</code></p>
        </section>

          <h2>Schema & Swagger Docs</h2>
          <p><a href="/api/docs/schema">View API Schemas (JSON)</a></p>
          <p><a href="/api/api-docs">Interactive Swagger UI</a></p>
        </section>
      </body>
    </html>
  `);
});

router.get("/schema", (req, res) => {
  res.json({
    userRegisterSchema: {
      name: "string, required, min 3",
      email: "valid email, required",
      password: "string, required, min 6",
      role: "user/admin"
    },
    productSchema: {
      name: "string, required, min 2",
      price: "number, required, positive",
      stock: "integer, required, min 0"
    },
    paginationQueryParams: {
      page: "number, default 1",
      limit: "number, default 20",
      search: "string, optional",
      minPrice: "number, optional",
      maxPrice: "number, optional"
    }
  });
});

module.exports = router;