package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
		
	public static String[][] getData(String fileName, String sheetName) throws IOException
	{
		String[][] data = null;
		
		try
		{
			FileInputStream fis = new FileInputStream("src/test/resources/"+fileName);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetName);
			
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(0).getLastCellNum();
			
			data = new String[rows][cols];
			
			
			for(int i=1; i<=rows; i++)
			{
				XSSFRow row= sheet.getRow(i);
				
				
				for(int j=0; j<cols; j++)
				{
					data[i-1][j] = row.getCell(j).toString();
				}
			}
			
			return data;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
