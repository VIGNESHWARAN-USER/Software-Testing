import path from "path";
import * as XLSX from "xlsx";

export function getData(filename: string, sheetname: string) {
    const filepath = path.join(__dirname, "..", "data", filename);

    const workbook = XLSX.readFile(filepath);
    const worksheet = workbook.Sheets[sheetname];

    return XLSX.utils.sheet_to_json(worksheet, {
  defval: ""
});
}