import fs from 'fs'
import {parse} from 'csv-parse/sync'

export function getData(filename:string) {

    const path =`test-data/${filename}`;
    const fileContent = fs.readFileSync(path, 'utf-8');

    return parse(fileContent, {trim: true, columns:true, skip_empty_lines:true});
}