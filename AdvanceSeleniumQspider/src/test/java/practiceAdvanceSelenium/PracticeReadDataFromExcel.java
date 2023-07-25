package practiceAdvanceSelenium;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		
		Sheet sh = book.getSheet("PracticeInterviewexcel");
		Row row = sh.getRow(2);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		//Thread.sleep(2000);
//		for(int i=0; i<sh.getLastRowNum(); i++) {
//			//Thread.sleep(2000);
//			Row row = sh.getRow(i);
//			
//			for(int j=0; j<row.getLastCellNum(); j++) {
//				Cell cell = row.getCell(j);
//				DataFormatter format= new DataFormatter();
//				String data = format.formatCellValue(cell);
//				
//				System.out.println(data);
//				
//			}
//			
//		}
		
//FileInputStream fis = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
//		
//		Workbook book = WorkbookFactory.create(fis);
//		
//		Sheet sh = book.getSheet("PracticeInterviewexcel");
//		for(int i=0; i<sh.getLastRowNum();i++) {
//			Row row = sh.getRow(i);
//			for(int j=0; j<row.getLastCellNum();j++) {
//				
//				Cell cel = row.getCell(j);
//				DataFormatter format=new DataFormatter();
//				String data = format.formatCellValue(cel);
//				System.out.println(data);
//			}
//
//	}

}

	}


