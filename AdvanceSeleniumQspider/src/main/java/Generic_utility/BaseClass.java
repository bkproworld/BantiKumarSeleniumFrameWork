package Generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver=null;
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void beforeSuite() {
		
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void beforeTest() {
		
		System.out.println("Parallel Execution");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
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
	sdriver=driver;
}
	
	@BeforeMethod(groups = {"smokeTest","regressionTest"})
	public void beforeMethod() throws Throwable {
	
		File_Utility flib= new File_Utility();
		Webdriver_Utility wlib = new Webdriver_Utility();
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");

		driver.get(URL);
		wlib.maximizeScreen(driver);
		wlib.impilicitwait(driver);

		
		LoginPage login = new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
		System.out.println("Login to application");
}
	
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void afterMethod() {
		HomePage hompg = new HomePage(driver);
		hompg.logOut(driver);
		
		System.out.println("");
}
	
	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void afterClass() {
	
	System.out.println("close the browser");
}
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void afterTest() {
		
		System.out.println("parallel execution done");
	}
	
	
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void afterSuite() {
		
		System.out.println("Databse is closed");
		driver.close();
	}
}
