package practiceAdvanceSelenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewProkabaddi {

	
		static WebDriver driver;
		static By teamName = By.xpath("//[@class='table-body']//[@class='table-row-wrap']//*[@class='team-name']//p");
		//static By matchPlay = By.xpath("//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data matches-play']//p");
		//static By matchWon = By.xpath("//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data matches-won']//p");
		//static By matchTie = By.xpath("//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data matches-draw']//p");
		//static By matchDraw = By.xpath("//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data score-diff']//p");
		static int y=1;
		
		public static void TestCode() {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.prokabaddi.com/standings");
			
			System.out.println("Succesfully started the Execution");
			System.out.println("<====================================================>");
			try {
			 List<WebElement> teams = driver.findElements(teamName);
			int teamSize = teams.size();
			System.out.println("Total Team Count is : " + teamSize);
			
			for(int i =0; i<=teamSize; i++) {
				WebElement toClick = teams.get(i);
				
				String teamNam = toClick.getText();
				System.out.println("Team Name :" + teamNam);
				String matchPlay = driver.findElement(By.xpath("(//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data matches-play']//p)["+ y +"]")).getText();
				System.out.println("Match play :" + matchPlay);
			    String matchWon = driver.findElement(By.xpath("(//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data matches-won']//p)["+ y +"]")).getText();
			    System.out.println("Match Won : "+ matchWon);
			    String matchLose = driver.findElement(By.xpath("(//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data matches-lost']//p)["+ y +"]")).getText();
			    System.out.println("Match Lose : " + matchLose);
			    String matchTie = driver.findElement(By.xpath("(//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data matches-draw']//p)["+ y +"]")).getText();
			    System.out.println("matchTie : " + matchTie);
			    String scoreDiff = driver.findElement(By.xpath("(//[@class='table-body']//[@class='table-row-wrap']//*[@class='table-data score-diff']//p)["+ y +"]")).getText();
			    System.out.println("Score Diff : " + scoreDiff);
			    y++;
			}
			}catch(Exception e) {
				//e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			
			TestCode();
			driver.close();
		}

	}


