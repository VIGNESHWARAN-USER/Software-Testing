import fs from "fs"
import path from 'path';
import { parse } from "csv-parse/sync"


export function getData(filename: string) {
    const filepath =  path.join(__dirname, "..","data" , filename);
    const fileContent = fs.readFileSync(filepath, "utf-8")
    
    return parse(fileContent, {
        columns: true,
        skip_empty_lines: true,
        trim: true,
    });
}