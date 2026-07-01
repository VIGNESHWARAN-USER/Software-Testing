import fs from 'fs';
import {parse} from 'csv-parse'


export async function readCSVData(filename: string) {

    const fileContent = fs.readFileSync("./test_data/" + filename, 'utf-8');
    return parse(fileContent, { columns: true, skip_empty_lines: true, trim: true });
}