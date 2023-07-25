package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.Webdriver_Utility;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orgLink;
	
	@FindBy(linkText="Products")
	private WebElement productLink;
	
	@FindBy(linkText="More")
	private WebElement moreLink;
	
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignLink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administrator;
	
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignOut;
	
	//======getters methods
	public WebElement getCampaignLink() {
		return campaignLink;
		
		
	}
	
	

	public WebElement getContactLink() {
		return contactLink;
	}



	public WebElement getOrgLink() {
		return orgLink;
	}
	
	

	public WebElement getProductLink() {
		return productLink;
		
	
	}
	
	public WebElement getMoreLink() {
		return moreLink;
	}
	
	public WebElement getAdministrator() {
		return Administrator;
	}

	public WebElement getSignOut() {
		return SignOut;
	}
	
	
	//------business logic
	public void organizationLink() {
		orgLink.click();
	}
	public void productlink() {
		productLink.click();
	}
	

	public void openmoreLink() {
		moreLink.click();
	}
	
	public void opencampaignLink() {
		campaignLink.click();
	}
	
	public void opencontactlink() {
		contactLink.click();
	}
	
	public void logOut(WebDriver driver) {
		
		Webdriver_Utility wlib = new Webdriver_Utility();
		wlib.ActionsMoveToElement(driver,Administrator );
//		Actions act = new Actions(driver);
//		act.moveToElement(Administrator).perform();
		SignOut.click();
		
	}

	
	
	
	
	

	
	

}
