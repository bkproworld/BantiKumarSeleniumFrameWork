package ContactVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import OrganizationPom.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) throws Throwable {
		Webdriver_Utility wlib = new Webdriver_Utility();
		File_Utility flib= new File_Utility();
		Java_Utility jlib= new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		
		String BROWSER = flib.getStringKeyAndValue("browser");
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else {
			driver= new ChromeDriver();
			
		}
		
		wlib.maximizeScreen(driver);
		HomePage hompg = new HomePage(driver);
		hompg.opencontactlink();
	}

}
