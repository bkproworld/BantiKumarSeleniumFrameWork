package CampaignVtiger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import OrganizationPom.CreateCampaignpage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;

public class CreateCampaignTest extends BaseClass {
		
	@Test //(groups = "regressionTest")
	public void createCampaignTest ()throws Throwable {
		
		
		
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
//		
//		wlib.maximizeScreen(driver);
//		wlib.impilicitwait(driver);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp(USERNAME, PASSWORD);
		
		HomePage hompg = new HomePage(driver);
		hompg.openmoreLink();
		hompg.opencampaignLink();
		CreateCampaignpage createcam = new CreateCampaignpage(driver);
		//driver.findElement(By.linkText("More")).click();
		//driver.findElement(By.linkText("Campaigns")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		createcam.clickPlusImage();
//		Random rn = new Random();
//		int rannum = rn.nextInt(1000);
		
		
		/*FileInputStream fi = new FileInputStream("./src/test/resources/MultipleExceldata.xlsx");
		
		Workbook book = WorkbookFactory.create(fi);
		
		Sheet sh = book.getSheet("camname");
		 Row row = sh.getRow(0);
		 Cell cel = row.getCell(0);
		 String campaignname = cel.getStringCellValue()+rannum;*/
		
		
		
		
		/*String campaignname = elib.getExcelData("camname", 0, 0)+rannum;
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(campaignname);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();*/
		//String campData = elib.getExcelData("camname", 0, 0)+rannum;
		int rannum = jlib.getRandomNum();
		Thread.sleep(2000);
		String campaignNameData = elib.getExcelData("camname", 0, 0)+rannum;
		createcam.campaignData(campaignNameData);
		createcam.saveButton();
		Thread.sleep(1000);
		
		String actualdata = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		{
			
			if(actualdata.contains(campaignNameData)) {
				
				System.out.println("campaign name is correct");
			}
			else {
				
				System.out.println("campaign name is not correct");
			}
		}
		
		//hompg.logOut(driver);
//		WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		wlib.ActionsMoveToElement(driver, logout);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}

}
