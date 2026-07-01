import path from "path";
import * as XLSX from "xlsx";

export function getData(filename: string, sheetname: string) {
    const workbook = XLSX.readFile(`data/${filename}`);
    const worksheet = workbook.Sheets[sheetname];

    return XLSX.utils.sheet_to_json(worksheet, {
  defval: ""
});
}