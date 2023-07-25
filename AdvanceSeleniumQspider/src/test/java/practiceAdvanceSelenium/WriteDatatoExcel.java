package practiceAdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatatoExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("./src/test/resources/ExcelData.xlsx"); 
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		
		Row row = sh.getRow(4);
		Cell cell = row.createCell(5);
		cell.setCellValue("Oneplus");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/ExcelData.xlsx");
		book.write(fos);
		book.close();
		
	}

}
