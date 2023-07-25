package CampaignVtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_Utility;
import Generic_utility.File_Utility;
import Generic_utility.Java_Utility;
import Generic_utility.Webdriver_Utility;
import OrganizationPom.CreateCampaignpage;
import OrganizationPom.CreateCampaignwithProPage;
import OrganizationPom.CreateProductForCampaignPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignWithProductTest extends BaseClass {

	@Test //(groups = {"smokeTest","regressionTest"})
	public void createCampaignWithProductTest() throws Throwable {
		
			
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
		
		Webdriver_Utility wlib = new Webdriver_Utility();
		//File_Utility flib= new File_Utility();
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
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
//		driver.findElement(By.linkText("More")).click();
//		driver.findElement(By.linkText("Campaigns")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		
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
//		wlib.impilicitwait(driver);
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp(USERNAME, PASSWORD);
		
		//driver.findElement(By.xpath("//a[text()='Products']")).click();
		HomePage hompg = new HomePage(driver);
		hompg.productlink();
		
		
		//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		CreateProductForCampaignPage createproduct = new CreateProductForCampaignPage(driver);
		createproduct.clickOnPlusImg();
		int rannum = jlib.getRandomNum();
		
//		FileInputStream fi = new FileInputStream("src/test/resources/MultipleExceldata.xlsx");
//		
//		Workbook book = WorkbookFactory.create(fi);
//		
//		Sheet sh = book.getSheet("Productname");
//		Thread.sleep(2000);
//		 Row row = sh.getRow(0);
//		 Cell cel = row.getCell(0);
		String prodName = elib.getExcelData("Productname", 0, 0)+rannum;
		 createproduct.productData(prodName);
		 //driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(pronam);
		 //driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])")).click();
		 createproduct.saveButton();
		 hompg.openmoreLink();
		 hompg.opencampaignLink();
		 CreateCampaignwithProPage createcampaign = new CreateCampaignwithProPage(driver);
		 
//		driver.findElement(By.linkText("More")).click();
//		driver.findElement(By.linkText("Campaigns")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		 createcampaign.clickPlusimg();
		
		
//		String campaignname = elib.getExcelData("camname", 0, 0)+rannum;
//		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(campaignname);
		String campaignNameData = elib.getExcelData("camname", 0, 0)+rannum;
		createcampaign.campaignsName(campaignNameData);
		createcampaign.selectplusButton();
		//createcam.saveButton();
		
		//driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		
		
		
//		Set<String> allWindows = driver.getWindowHandles();
//		Iterator<String> id= allWindows.iterator();
//		while(id.hasNext()) {
//			String win = id.next();
//			driver.switchTo().window(win);
//			String title = driver.getTitle();
//			
//			if(title.contains("Products&action")) {
//				
//				break;
//				
//			}
//			
//		}
		
		wlib.switchToWindow(driver,"Products&action");
		
//		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(pronam);
//		driver.findElement(By.xpath("//input[@name='search']")).click();
		
		
		createcampaign.productnameSwitch(prodName);
		createcampaign.searchProductName();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+prodName+"']")).click();
		
//		Set<String> allWindows1 = driver.getWindowHandles();
//		Iterator<String> id1= allWindows1.iterator();
//		while(id1.hasNext()) {
//			String win1 = id1.next();
//			driver.switchTo().window(win1);
//			String title = driver.getTitle();
//			
//			if(title.contains("Campaigns&action")) {
//				
//				break;
//				
//				
//			}
//			
//		}
		wlib.switchToWindow(driver, "Campaigns&action");
		
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
//		Thread.sleep(2000);
//		hompg.logOut(driver);
//		WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		wlib.ActionsMoveToElement(driver, logout);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		
		
		
//		String mainwind = driver.getWindowHandle();
//
//		Set<String> newwind = driver.getWindowHandles();
//		for(String window1:newwind) {
//			System.out.println(window1);
//			if(!window1.equals(mainwind)) {
//				driver.switchTo().window(window1);
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("hp");
//				driver.findElement(By.xpath("//input[@name='search']")).click();		
//				driver.findElement(By.xpath("//a[text()='hp']")).click();
//		
//		}
//			
//			driver.switchTo().window(mainwind);
//			driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("HpSaleJunetoJulyDay2");
//			
//			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
//			
//			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			
			
		
	}

}
