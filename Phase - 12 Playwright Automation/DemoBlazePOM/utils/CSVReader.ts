import fs from "fs"
import { parse } from "csv-parse/sync"


export function getData(filename: string) {
    const fileContent = fs.readFileSync(`data/${filename}`, "utf-8")
    
    return parse(fileContent, {
        columns: true,
        skip_empty_lines: true,
        trim: true,
    });
}