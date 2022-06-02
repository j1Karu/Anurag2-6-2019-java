package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {
	
	public static void main(String[] args) throws IOException {
		
		File src = new File ("C:\\Users\\HP\\OneDrive\\Documents\\Requirements.xlsx");
		FileInputStream Fis = new FileInputStream(src);
		XSSFWorkbook xf = new XSSFWorkbook(Fis);
		XSSFSheet sh = xf.getSheet("data");
	String value = sh.getRow(1).getCell(2).getStringCellValue();
	System.out.println(value);
		
	}

}
