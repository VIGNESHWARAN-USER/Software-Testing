export function getData() {
    const timestamp = Date.now();
    const random = Math.floor(Math.random() * 10000);

    return {
      firstName: "VIGNESHWARAN",
      lastName: "M",
      phone: "9092174486",
      email: `vignesh${timestamp}${random}@gmail.com`,
      password: "Password@123"
    };
}