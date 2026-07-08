import { Login } from './../types/Login';
import fs from 'fs'
import {parse} from 'csv-parse/sync'


export function getCSVData(filename:string, testName: string): Login {

    const fileContent = fs.readFileSync(`src/test/data/${filename}`, "utf-8");

    const data: Login[] = parse(fileContent, {
        columns: true,
        skip_empty_lines: true,
        trim: true,
    });

    const loginData = data.find(user => user.testcase === testName);

    if (!loginData) {
        throw new Error(`No test data found for '${testName}'`);
    }

    return loginData;
}