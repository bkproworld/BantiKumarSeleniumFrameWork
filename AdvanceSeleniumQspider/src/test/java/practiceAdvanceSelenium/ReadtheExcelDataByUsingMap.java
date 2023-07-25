package practiceAdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadtheExcelDataByUsingMap {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet6");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		
		LinkedHashMap<String, String> map= new LinkedHashMap<String, String>();
		for(int i =0; i<=rows; i++)
		{
			String key = sheet.getRow(i).getCell(0).toString();
			String value = sheet.getRow(i).getCell(1).toString();
			map.put(key, value);
			
		}
		for(Entry<String, String> m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}

}
