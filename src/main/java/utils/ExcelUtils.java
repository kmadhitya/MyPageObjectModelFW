package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

public static Object[][] excelData(String excelFileName) throws IOException {
		
		
		XSSFWorkbook excel = new XSSFWorkbook("./datasheets/"+excelFileName+".xlsx");
		XSSFSheet sheetAt = excel.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum(); //0 to 3 poi 1 to 4 // 1 to 3
		short lastCellNum = sheetAt.getRow(0).getLastCellNum(); //0 to 2
		Object[][] data = new Object[lastRowNum][lastCellNum];
		for (int i=1; i<=lastRowNum; i++)
		{
			XSSFRow row = sheetAt.getRow(i);
			for (int j=0; j<lastCellNum; j++)
			{
				String stringCellValue = row.getCell(j).getStringCellValue();
				data[i-1][j] = stringCellValue;
			}
			
		}
		excel.close();
		return data;
	}

}
