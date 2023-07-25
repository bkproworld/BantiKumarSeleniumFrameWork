package practiceAdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFormatterExcel {

	public static void main(String[] args) throws Throwable {
FileInputStream fis = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet3");
		
		Row row = sh.getRow(1);
		Cell cel = row.getCell(1);
		
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(cel);
		System.out.println(data);
		

	}

}
