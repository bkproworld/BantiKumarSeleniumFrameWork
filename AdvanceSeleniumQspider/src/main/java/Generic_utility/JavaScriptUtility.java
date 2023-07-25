package Generic_utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {
	
	JavascriptExecutor js;
	/**
	 * Driver
	 */
	
	public JavaScriptUtility(WebDriver driver) {
		js=(JavascriptExecutor)driver;
	}


	public void launchApplication(String url) {
		js.executeScript("window.location=arguments[0]", url);
	}
	

	public void sendKeys(WebElement element, String data) {
		
		js.executeScript("arguments[0].value=arguments[1]",element, data);
	}
	

	public void click(WebElement element) {
		js.executeScript("arguments[0].click()",element);
	}
	
	public String getUrlofCurrentPage() {
		String url = (String) js.executeScript("return window.location.href");
		return url;
	}
	

	public String getTitleofCurrentPage() {
		String title = (String) js.executeScript("return document.title");
		return title;
	}
	
	public void scrollUp() {
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
	
	public void scrolldown() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
