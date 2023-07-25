package practiceAdvanceSelenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample2 {

	@Test(dataProvider="getdata")
	public void name(String orgName, String phoneNum,String emailId) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNum);
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}
	@DataProvider
	public Object[][] getdata(){
		
		
		Random ran = new Random();
		int rannum = ran.nextInt(1000);
		
		Object[][] obj = new Object[3][3];
		obj[0][0]="iphone"+rannum;
		obj[0][1]="0987654";
		obj[0][2]="abc@gmail.com";
		
		obj[1][0]="sam"+rannum;
		obj[1][1]="098765432";
		obj[1][2]="mln@gmail.com";
		
		obj[2][0]="moto"+rannum;
		obj[2][1]="1234556";
		obj[2][2]="zxc@gmail.com";
		
		return obj;
		
	}
	
	
}
