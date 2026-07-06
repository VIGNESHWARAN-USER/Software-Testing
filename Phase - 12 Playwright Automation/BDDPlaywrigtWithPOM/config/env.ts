import dotenv from "dotenv";
import path from "path";

dotenv.config({
    path: path.resolve(__dirname, "../env/.env")
});

export const ENV = {
    baseUrl: process.env.BASE_URL!
};