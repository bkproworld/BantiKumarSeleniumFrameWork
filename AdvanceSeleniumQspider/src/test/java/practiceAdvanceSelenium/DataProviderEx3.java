package practiceAdvanceSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_utility.Excel_Utility;

public class DataProviderEx3 {

	
	@Test(dataProvider="dataProviderExecute")
	public void bookTickets(String src, String dest) {
		System.out.println("book tickets from "+src+" to "+dest);
	}
	
	@DataProvider
	public Object[][] dataProviderExecute() throws Throwable {
		
		Excel_Utility elib = new Excel_Utility();
		Object[][] value = elib.readMultipleData("DataProvider");		
		return value;
		
	}
}
