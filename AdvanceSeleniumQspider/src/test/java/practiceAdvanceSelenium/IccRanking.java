package practiceAdvanceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccRanking {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		String name="Australia";
		int count =1;
		
		List<WebElement> teamname = driver.findElements(By.xpath("//table[@class='table']//td//span[text()='"+ name +"']"));
		
		for(int i =0; i<teamname.size(); i++) {
			WebElement TTtname = teamname.get(i);
			String countryname = TTtname.getText();
			System.out.println("Team Name : "+countryname);
			
			
		}

	}

}
