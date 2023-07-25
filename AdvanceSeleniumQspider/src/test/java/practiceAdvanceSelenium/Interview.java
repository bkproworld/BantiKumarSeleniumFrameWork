package practiceAdvanceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://www.prokabaddi.com/standings");
		//int inc = 12;
		 //List<WebElement> teamname = driver.findElements(By.xpath("(//div[@class='table standings-table']/descendant::div[@class='team-name']//p)[" + inc +"]"));
		String name = "Haryana Steelers";
		List<WebElement> teamname = driver.findElements(By.xpath("//div[@class='table standings-table']/descendant::div[@class='team-name']//p[text()='"+ name +"']"));
		int count =1;
		for(int i =0; i<teamname.size(); i++) {
			WebElement toClick = teamname.get(i);
			
			String teamNam = toClick.getText();
			
			System.out.println("Team Name :" + teamNam);
			
			String Matchplay = driver.findElement(By.xpath("(//div[@class='table standings-table']//descendant::div[@class='table-row-wrap']//descendant::div[@class='table-data matches-play']//p)["+ count +"]")).getText();
			System.out.println("Match play :" + Matchplay);
			
			String Matchwon = driver.findElement(By.xpath("(//div[@class='table standings-table']//descendant::div[@class='table-row-wrap']//descendant::div[@class='table-data matches-won']//p)["+ count +"]")).getText();
			System.out.println("Match Won : "+ Matchwon);
			
			String MatchLose = driver.findElement(By.xpath("(//div[@class='table standings-table']//descendant::div[@class='table-row-wrap']//descendant::div[@class='table-data matches-lost']//p)["+ count +"]")).getText();
			 System.out.println("Match Lose : " + MatchLose);
			
			String Totalpoints = driver.findElement(By.xpath("(//div[@class='table standings-table']//descendant::div[@class='table-row-wrap']//descendant::div[@class='table-data points']//p)["+ count +"]")).getText();
			System.out.println("Total Points of this team is : " + Totalpoints);

		    count++;
		    System.out.println();
		}
		
			
			
			
	}		

}
