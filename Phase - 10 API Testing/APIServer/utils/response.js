function success(
  res,
  statusCode,
  message,
  data = null,
  suggestion = null
) {
  return res.status(statusCode).json({
    status: statusCode,
    statusText: "Success",
    message,
    data,
    suggestion
  });
}

function error(
  res,
  statusCode,
  message,
  suggestion = null
) {
  return res.status(statusCode).json({
    status: statusCode,
    statusText: "Error",
    message,
    suggestion
  });
}

module.exports = {
  success,
  error
};