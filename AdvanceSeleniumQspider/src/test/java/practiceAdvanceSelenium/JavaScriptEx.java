package practiceAdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_utility.JavaScriptUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		JavaScriptUtility jslib = new JavaScriptUtility(driver);
		jslib.launchApplication("http://localhost:8888");
		
		WebElement UserName = driver.findElement(By.name("user_name"));
		jslib.sendKeys(UserName, "admin");
		
		WebElement Password = driver.findElement(By.name("user_password"));
		jslib.sendKeys(Password, "admin");
		
		WebElement LogIn = driver.findElement(By.id("submitButton"));
		jslib.click(LogIn);
		
		String Urln = jslib.getUrlofCurrentPage();
		System.out.println(Urln);
		
		String Title = jslib.getTitleofCurrentPage();
		System.out.println(Title);
		
		jslib.scrolldown();
		Thread.sleep(2000);
		
		jslib.scrollUp();

	}

}
