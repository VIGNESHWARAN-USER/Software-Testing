const express = require("express");
const cors = require("cors");
const helmet = require("helmet");
const morgan = require("morgan");
const rateLimit = require("express-rate-limit");

// Import route modules
const authRoutes = require("./routes/auth.routes");
const userRoutes = require("./routes/user.routes");
const productRoutes = require("./routes/product.routes");
const xmlRoutes = require("./routes/xml.routes");
const searchRoutes = require("./routes/search.routes");
const docsRoutes = require("./routes/docs.routes");
const swaggerUi = require("swagger-ui-express");
const swaggerDocument = require("./docs/swagger.json");
const { success, error } = require("./utils/response");

const app = express();
const PORT = 5000;



// Middleware
app.use(cors());
app.use(helmet());
app.use(morgan("dev"));
app.use(express.json());
app.use(express.text({ type: "application/xml" }));

// Rate Limit
app.use(
  rateLimit({
    windowMs: 60 * 1000,
    limit: 20,
    message: {
      status: 429,
      statusText: "Too Many Requests",
      message: "Rate limit exceeded. Try again later."
    }
  })
);

// Basic API Status
app.get("/", (req, res) => {
  success(res, 200, "API Testing Practice Server is running", {
    version: "v1",
    docs: "/api/docs"
  });
});

app.get("/api/health", (req, res) => {
  success(res, 200, "Server health is good", {
    uptime: process.uptime()
  });
});

// Routes
app.use("/api/api-docs", swaggerUi.serve, swaggerUi.setup(swaggerDocument));
app.use("/api/docs", docsRoutes);
app.use("/api/auth", authRoutes);
app.use("/api/users", userRoutes);
app.use("/api/products", productRoutes);
app.use("/api/xml", xmlRoutes);
app.use("/api/search", searchRoutes);

// 404 Handler
app.use((req, res) => {
  error(res, 404, "API endpoint not found", "Check API URL and HTTP method");
});

// Start Server
app.listen(PORT, () => {
  console.log(`API Testing Practice Server running on http://localhost:${PORT}`);
});