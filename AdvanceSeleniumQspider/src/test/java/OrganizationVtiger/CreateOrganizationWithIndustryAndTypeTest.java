package OrganizationVtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import OrganizationPom.CreateOrganizationPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationWithIndustryAndTypeTest extends BaseClass{
	
	@Test  //(groups = {"smokeTest","regressionTest","systemTest"})
	public void createOrganizationWithIndustryAndTypeTest() throws Throwable {
		
		
		
//		Webdriver_Utility wlib = new Webdriver_Utility();
//		File_Utility flib= new File_Utility();
		Java_Utility jlib= new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
		
//		String BROWSER = flib.getStringKeyAndValue("browser");
//		WebDriver driver;
//		if(BROWSER.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver= new ChromeDriver();
//		}
//		else if(BROWSER.equalsIgnoreCase("edge")) {
//			
//			WebDriverManager.edgedriver().setup();
//			driver= new EdgeDriver();
//		}
//		else {
//			driver= new ChromeDriver();
//			
//		}
//		
//		
//		String URL = flib.getStringKeyAndValue("url");
//		String USERNAME = flib.getStringKeyAndValue("username");
//		String PASSWORD = flib.getStringKeyAndValue("password");
//		
//		driver.get(URL);
//		wlib.maximizeScreen(driver);
//		wlib.impilicitwait(driver);
//		
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp(USERNAME, PASSWORD);
		
		HomePage hompg = new HomePage(driver);
		CreateOrganizationPage org = new CreateOrganizationPage(driver);
		hompg.organizationLink();
		org.clickonPlusimg();
		
		
		int rannum = jlib.getRandomNum();
		
		String OrgName = elib.getExcelData("orgname", 0, 0)+rannum;
		String phoneNum = elib.getExcelDataUsingDataFormatter("orgname", 1, 1)+rannum;
		String emailId = elib.getExcelDataUsingDataFormatter("orgname", 3, 2);
		org.clickOnIndustry();
		String industry = elib.getExcelData("orgname", 4, 0);
		org.clickOnType();
		String type = elib.getExcelData("orgname", 5, 0);
		org.orgDataWithIndustry(OrgName, industry, phoneNum, emailId, type);
		
		org.saveButton();
		
		 String actdata = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		 {
			 
			 if(actdata.contains(OrgName)) {
				 
				 System.out.println("Organization is correct");
			 }
			 else {
				 
				 System.out.println("Organization is not correct");
			 }
		 }
		 
		 //hompg.logOut(driver);
		
		
		
		
		
		

		
		
		
		
		
	}

}
