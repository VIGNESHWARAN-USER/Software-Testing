// utils/csvReader.ts

import fs from "fs";
import { parse } from "csv-parse/sync";
import { LoginData } from "../types/LoginData";

export function getLoginData(testName: string): LoginData {

    const fileContent = fs.readFileSync("data/Login_data.csv", "utf-8");

    const data: LoginData[] = parse(fileContent, {
        columns: true,
        skip_empty_lines: true,
        trim: true,
    });

    const loginData = data.find(user => user.testName === testName);

    if (!loginData) {
        throw new Error(`No test data found for '${testName}'`);
    }

    return loginData;
}