package api.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static String[][] getData(String fileName, String sheetName) {

		FileInputStream fis;
		try {
			fis = new FileInputStream("src/test/resources/testData/" + fileName);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);

		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCols = sheet.getRow(0).getLastCellNum();

		// Exclude header
		int dataRows = totalRows - 1;

		String[][] data = new String[dataRows][totalCols];

		int rowIndex = 0;

		for (int i = 1; i < totalRows; i++) {

			XSSFRow row = sheet.getRow(i);

			if (row == null)
				continue;

			boolean isEmpty = true;

			for (int j = 0; j < totalCols; j++) {
				XSSFCell cell = row.getCell(j);

				String val = "";

				if (cell != null) {
					if (cell.getCellType() == CellType.NUMERIC) {
						val = String.valueOf((long) cell.getNumericCellValue());
					} else {
						val = cell.toString().trim();
					}

					if (!val.isEmpty()) {
						isEmpty = false;
					}
				}

				data[rowIndex][j] = val;
			}

			
			if (!isEmpty) {
				rowIndex++;
			}
		}

		wb.close();
		fis.close();

		return java.util.Arrays.copyOf(data, rowIndex); 
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
