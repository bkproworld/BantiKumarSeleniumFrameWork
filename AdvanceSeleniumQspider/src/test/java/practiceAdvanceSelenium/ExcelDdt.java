package practiceAdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDdt {

	public static void main(String[] args) throws Throwable  {

		FileInputStream fis =new FileInputStream("./src/test/resources/ExcelData.xlsx"); 
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		
		Row row = sh.getRow(2);
		Cell cell = row.getCell(1);
		String exceldata = cell.getStringCellValue();
		System.out.println(exceldata);
		
		

	}

}
