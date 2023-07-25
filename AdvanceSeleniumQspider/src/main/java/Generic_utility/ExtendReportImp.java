package Generic_utility;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportImp implements ITestListener {
	
	WebDriver driver;
	
	ExtentReports report;
	 
	
	ExtentTest test;

	public void onTestStart(ITestResult result) {
	
		
		/*Step -3 Create Test methods during the test execution */
		report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		/* Step 4: Log the pass method */
		
		test.log(Status.PASS, result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		
		/* Step -5 Log the fail method
		 * 
		 */
		

		String testData = result.getMethod().getMethodName();
		System.out.println("----execute----");
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(src, new File("./Screen/"+testData+".png"));
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
		/*Step:6 - Log the skip method */
		 test.log(Status.SKIP, result.getMethod().getMethodName());
	}

	public void onStart(ITestContext context) {
		// Step -1 Extend Report Configuration
		
		Date date = new Date();
		System.out.println(date);
		
		date.toString().replace("", "").replace("", "");
		
		ExtentSparkReporter htmlReport = new ExtentSparkReporter(new File("ExtendReports.html"));
		htmlReport.config().setDocumentTitle("Vtiger ExtentReport");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("Automation Test");
		
		
		/*Step-2 Attach the physical report and do the system configuration */
		
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Os", "Windows 11");
		report.setSystemInfo("Environment", "Automation Testing");
		report.setSystemInfo("url", "http://localhost:8888/");
		report.setSystemInfo("Reporter Name", "BantiKumar");
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}

}
