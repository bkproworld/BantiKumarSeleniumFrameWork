package OrganizationVtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import OrganizationPom.CreateOrganizationPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import OrganizationPom.ValidationPage;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(Generic_utility.ListenerClass.class)
public class CreateOrganizationTest extends BaseClass {
	

	//@Test(retryAnalyzer =Generic_utility.RetryAnlayser.class )

	//(groups = "smokeTest")
	@Test  
	public void createOrganizationTest() throws Throwable {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
		
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
		
//		driver.get("http://localhost:8888/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*FileInputStream fis = new FileInputStream("src/test/resources/Vtigerurl.properties");
		Properties pro  = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");*/
		
		
//		String URL = flib.getStringKeyAndValue("url");
//		String USERNAME = flib.getStringKeyAndValue("username");
//		String PASSWORD = flib.getStringKeyAndValue("password");
//		
//		driver.get(URL);
//		wlib.maximizeScreen(driver);
//		
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp(USERNAME, PASSWORD);
		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		HomePage hompg = new HomePage(driver);
		CreateOrganizationPage org = new CreateOrganizationPage(driver);
		hompg.organizationLink();
		
		//Assert.assertEquals(false, true);
		//driver.findElement(By.xpath("//td[@class='small']//descendant::a[text()='Organizations']")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		org.clickonPlusimg();
		int rannum = jlib.getRandomNum();
		

		//FileInputStream fi = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
//		FileInputStream fi = new FileInputStream("src/test/resources/MultipleExceldata.xlsx");
		
//		Workbook book = WorkbookFactory.create(fi);
//		
//		Sheet sh = book.getSheet("orgname");
//		Thread.sleep(2000);
//		 Row row = sh.getRow(0);
//		 Cell cel = row.getCell(0);
//		 String organization = cel.getStringCellValue()+rannum;
//		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(organization);
//		 Row row1 = sh.getRow(1);
//		 Cell cel1 = row1.getCell(1);
//		 DataFormatter format = new DataFormatter();
//		 String num = format.formatCellValue(cel1);
//		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(num);
//		
//		 Row row2 = sh.getRow(3);
//		 Cell cel2 = row2.getCell(2);
		 
		/*String orgName = elib.getExcelData("orgname", 0, 0)+rannum;
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
		String phno = elib.getExcelDataUsingDataFormatter("orgname", 1, 1)+rannum;
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phno);
		String email = elib.getExcelDataUsingDataFormatter("orgname", 3, 2);
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(email);*/
		String OrgName = elib.getExcelData("orgname", 0, 0)+rannum;
		String phoneNum = elib.getExcelDataUsingDataFormatter("orgname", 1, 1)+rannum;
		String emailId = elib.getExcelDataUsingDataFormatter("orgname", 3, 2);
		
		
		org.orgData(OrgName, phoneNum, emailId);
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		org.saveButton();
		Thread.sleep(2000);
		/* String actdata = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		 {
			 
			 if(actdata.contains(OrgName)) {
				 
				 System.out.println("Organization is correct");
			 }
			 else {
				 
				 System.out.println("Organization is not correct");
			 }
		 }*/
		 
		 
		 //hompg.logOut(driver);
		
		//String actData = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		/*ValidationPage valid = new ValidationPage(driver);
		 //String actData = valid.getOrgValidate().getText();
		String actData = valid.validationOrgName();
		Assert.assertEquals(actData, OrgName);*/
		 
//		WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		wlib.ActionsMoveToElement(driver, logout);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		

	}
	/*@Test
	public void checkmethod(){
		System.out.println("check method is running");
	}*/

}



