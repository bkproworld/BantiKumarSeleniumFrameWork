package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.Webdriver_Utility;

public class CreateOrganizationPage extends Webdriver_Utility {
	
	public CreateOrganizationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement clickplussign;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement orgPhone;
	
	@FindBy(xpath="//input[@id='email1']")
	private WebElement orgEmail;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement Industry;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement Type;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])")
	private WebElement Save;
	
	//--> getters methods
	
	public WebElement getClickplussign() {
		return clickplussign;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getOrgPhone() {
		return orgPhone;
	}

	public WebElement getOrgEmail() {
		return orgEmail;
	}
	
	
	public WebElement getIndustry() {
		return Industry;
	}

	public WebElement getType() {
		return Type;
	}

	public WebElement getSave() {
		return Save;
	}

	//---> business logic
	public void clickonPlusimg() {
		clickplussign.click();
	}
	
	public void orgData(String OrgName, String phoneNum, String emailId) {
		orgName.sendKeys(OrgName);
		orgPhone.sendKeys(phoneNum);
		orgEmail.sendKeys(emailId);
			
	}
	
	public void orgDataWithIndustry(String OrgNamed,String industry, String phoneNum, String emailId,String type) {
		orgName.sendKeys(OrgNamed);
		
		orgPhone.sendKeys(phoneNum);
		orgEmail.sendKeys(emailId);
		Webdriver_Utility wlib = new Webdriver_Utility();
		wlib.handleDropDownWithVisibleText(Industry, industry);
		wlib.handleDropDownWithVisibleText(Type, type);
		
	}
	
	public void clickOnIndustry() {
		Industry.click();
		
		
	}
	
	public void clickOnType() {
		Type.click();
	}
	
	
	
	public void saveButton() {
		Save.click();
	}
	

}
