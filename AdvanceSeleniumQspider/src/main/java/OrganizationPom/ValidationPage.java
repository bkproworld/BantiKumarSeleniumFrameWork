package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {

	
	public ValidationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@id='dtlview_Organization Name']")
	private WebElement orgValidate;
	
	
	
	
	
	public WebElement getOrgValidate() {
		return orgValidate;
	}



	//Business Logic
	public String validationOrgName() {
		return orgValidate.getText();
	}
	
}
