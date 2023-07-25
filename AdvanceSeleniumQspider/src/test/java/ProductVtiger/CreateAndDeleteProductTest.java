package ProductVtiger;


import java.util.List;

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
import OrganizationPom.CreateProductPage;
import OrganizationPom.DeleteProductPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAndDeleteProductTest extends BaseClass {

	@Test  //(groups = {"smokeTest","systemTest"})
	public void createAndDeleteProductTest() throws Throwable {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
		
		Webdriver_Utility wlib = new Webdriver_Utility();
		File_Utility flib= new File_Utility();
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
//		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
//		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
//		LoginPage login = new LoginPage(driver);
//		login.loginToApp(USERNAME, PASSWORD);
		
		
		HomePage hompg = new HomePage(driver);
		hompg.productlink();
		//driver.findElement(By.xpath("//a[text()='Products']")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		
		CreateProductPage createproduct = new CreateProductPage(driver);
		createproduct.clickOnPlusImg();
		
		
//		Random r= new Random();
//		int rannum = r.nextInt(100);
		
		int rannum = jlib.getRandomNum();
//		FileInputStream fi =new FileInputStream("./src/test/resources/MultipleExceldata.xlsx"); 
//		Workbook book = WorkbookFactory.create(fi);
//		Sheet sh = book.getSheet("Productname");
//		
//		Row row = sh.getRow(0);
//		Cell cell = row.getCell(0);
//		String productdata = cell.getStringCellValue()+rannum;
		String productdata = elib.getExcelData("Productname", 0, 0)+rannum;
		createproduct.productData(productdata);
		createproduct.saveButton(driver);
		
		//driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(productdata);
		//driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])")).click();
		
		//driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
		DeleteProductPage deletepro = new DeleteProductPage(driver);
		deletepro.productTable();
//		driver.findElement(By.xpath("//select[@name='search_field']/option[2]")).click();
//		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(productdata);
//		driver.findElement(By.xpath("//select[@name='search_field']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody//td//a[text()='"+productdata+"']/../preceding-sibling::td/input")).click();
		//driver.findElement(By.xpath("//input[@value='Delete']")).click();
		deletepro.deleteProductData();
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//		driver.findElement(By.xpath("//a[text()='Marketing73']")).click();
		
		wlib.Alertaccept(driver);
		
		
		 List<WebElement> productlist = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));
		boolean flag =false;
		for( WebElement prodName:productlist) {
			String actdata= prodName.getText();
			if(actdata.contains(productdata)) {
				
				flag=true;
				break;
			}
			
		}
		
		if(flag) {
			
			System.out.println("product data is deleted");
		}
		else {
			
			System.out.println("product data not deleted");
		}
		
		//Thread.sleep(2000);
		//hompg.logOut(driver);
//		Alert alrt = driver.switchTo().alert();
//		  
//		alrt.accept();
		
//		WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
//		wlib.ActionsMoveToElement(driver, logout);
//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		

	}

}
