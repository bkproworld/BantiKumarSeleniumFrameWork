package practiceAdvanceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPractice {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement data = driver.findElement(By.xpath("//input[@name='q']"));
		data.sendKeys("hp laptop");
		data.submit();
		//Thread.sleep(1000);
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']"));
		Thread.sleep(1000);
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i).getText());
			
			
		}
//		WebElement data1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (White, 64 GB)']"
//				+ "/ancestor::div[contains(@class,'pLy-c row')]"
//				+ "/descendant::div[text()='₹53,999']"));
		
//		 WebElement data1 = driver.findElement(By.xpath("//div[contains(@class,'_4rR01T')]"));
//		String value = data1.getText();
//		System.out.println(value);
	}

}
