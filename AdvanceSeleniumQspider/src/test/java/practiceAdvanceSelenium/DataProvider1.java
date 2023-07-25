package practiceAdvanceSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider="dataProviderExecute")
	public void bookTickets(String src, String dest) {
		System.out.println("book tickets from "+src+" to "+dest);
	}
	
	@DataProvider
	public Object[][] dataProviderExecute() {
		
		Object[][] obj = new Object[2][2];
		obj[0][0]="bangalore";
		obj[0][1]="goa";
		
		obj[1][0]="patna";
		obj[1][1]="delhi";
		
		return obj;
		
		
	}
}
