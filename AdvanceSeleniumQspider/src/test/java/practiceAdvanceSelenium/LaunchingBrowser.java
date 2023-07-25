package practiceAdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Generic_utility.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		File_Utility flib = new File_Utility();
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
		
		//driver.get("");

	}

}
