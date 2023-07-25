package Generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassExample {
	
	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Throwable {
	
	File_Utility flib= new File_Utility();
	
	String BROWSER = flib.getStringKeyAndValue("browser");
	
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
	System.out.println("Launching Browser");
}
	
	public void name() {
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Database close");
		
		driver.close();
	}
}
