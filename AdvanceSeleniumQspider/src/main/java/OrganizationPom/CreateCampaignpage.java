package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignpage {

	
	public CreateCampaignpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement clickOnPlusImg;
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement CampaignName;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])")
	private WebElement Save;

	public WebElement getClickOnPlusImg() {
		return clickOnPlusImg;
	}

	public WebElement getCampaignName() {
		return CampaignName;
	}

	public WebElement getSave() {
		return Save;
	}
	
	//---> business logic
	
	public void clickPlusImage() {
		clickOnPlusImg.click();
	}
	
	public void campaignData(String campaignNameData) {
		CampaignName.sendKeys(campaignNameData);
	}

	public void saveButton() {
		Save.click();
	}
}
