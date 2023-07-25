package Generic_utility;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
	
		

	public void onTestFailure(ITestResult result) {
		
		/*String testData = result.getMethod().getMethodName();
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(null);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(src, new File("./ScreenShot/"+testData+".png"));
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}*/
		
		String testName = result.getMethod().getMethodName();
		System.out.println("-----execute-----");
		
		TakesScreenshot screen = (TakesScreenshot)BaseClass.sdriver;
		
		File src = screen.getScreenshotAs(OutputType.FILE);
		LocalDateTime localDateTime = LocalDateTime.now();
		localDateTime.toString().replace(" ", "-").replace(":", "/");
		//File dest = new File("./ScreenShot/\"+testName+\".png");
		File dest = new File("./ScreenShot/\"+ testName +\".png");
		
		try {
			
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			
			
			e.printStackTrace();
			
			System.out.println("problem is saving in screenshot"+e.getMessage());
		}
		
		
	}

}
