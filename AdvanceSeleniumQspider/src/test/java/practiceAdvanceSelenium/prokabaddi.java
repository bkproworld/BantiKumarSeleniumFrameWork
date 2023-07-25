package practiceAdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prokabaddi {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//driver.get("https://www.google.com/search?q=pro+kabaddi+points+table&oq=&gs_lcrp=EgZjaHJvbWUqCQgCECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQk2ODUxNGowajeoAgiwAgE&sourceid=chrome&ie=UTF-8");
		//List<WebElement> name = driver.findElements(By.xpath("//div[@class='tsp-tln']"));
		//System.out.println(name);
		driver.get("https://www.prokabaddi.com/standings");
		int row = driver.findElements(By.xpath("//div[@class='table standings-table']/descendant::div[@class='row-head']")).size();
		System.out.println(row);
		
		int col = driver.findElements(By.xpath("//div[@class='table standings-table']/descendant::div[@class='table-head']/descendant::div")).size();
		System.out.println(col);
	}

}
