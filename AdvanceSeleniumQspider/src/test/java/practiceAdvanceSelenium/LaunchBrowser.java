package practiceAdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();*/

		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		/*WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();*/
		FileInputStream fis = new FileInputStream("src/main/resources/actitime.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String Username = pro.getProperty("username");
		String Pass = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.name("pwd")).sendKeys(Pass);
		driver.findElement(By.id("loginButton")).click();
		
				
		
	}

}
