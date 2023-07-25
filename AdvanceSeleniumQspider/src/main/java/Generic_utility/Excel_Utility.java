package Generic_utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	

	public String getExcelData(String sheetNum, int rowNum, int cellnum) throws Throwable {
		
		
		
		//FileInputStream fi = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
		FileInputStream fi = new FileInputStream(iPathConstant.EXCELUTILITY_PATH);
		
		Workbook book = WorkbookFactory.create(fi);
		
		Sheet sh = book.getSheet(sheetNum);
		 Row row = sh.getRow(rowNum);
		 Cell cel = row.getCell(cellnum);
		 String value = cel.getStringCellValue();
		return value;
		
	}
	
	public String getExcelDataUsingDataFormatter(String sheetName,int rowNum, int cellNum) throws Throwable {
		
		FileInputStream dformatterexcel = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
		Workbook book = WorkbookFactory.create(dformatterexcel);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(book.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		return value;
	}
	
	public Object[][] readMultipleData(String sheetName) throws Throwable{
		
		FileInputStream fi = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
		 
		Workbook book = WorkbookFactory.create(fi);
		
		Sheet sh = book.getSheet(sheetName);
		int lastRow = sh.getLastRowNum()+1;
		 int lastCell = sh.getRow(0).getLastCellNum();
		 
		 Object[][] obj = new Object[lastRow][lastCell];
		 for(int i=0; i<lastRow; i++) {
			 
			 for(int j = 0; j<lastCell; j++) {
				 
				 obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();			 }
			 
		 }
		return obj;
		
		
		
	}

}
