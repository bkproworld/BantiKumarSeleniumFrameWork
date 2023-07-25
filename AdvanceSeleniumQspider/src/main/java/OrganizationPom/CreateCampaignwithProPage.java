package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignwithProPage {
	
	
	public CreateCampaignwithProPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement clickonPlusImg;
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campaignName;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement selectButton;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement productNameSwitching;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement productSearchSwitching;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])")
	private WebElement Save;
	
	// getters methods

	public WebElement getClickonPlusImg() {
		return clickonPlusImg;
	}

	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getProductNameSwitching() {
		return productNameSwitching;
	}

	public WebElement getProductSearchSwitching() {
		return productSearchSwitching;
	}

	public WebElement getSave() {
		return Save;
	}
	
	//---> Business logic
	
	public void clickPlusimg() {
		clickonPlusImg.click();
	}
	
	public void campaignsName(String campData) {
		campaignName.sendKeys(campData);
	}
	
	public void selectplusButton() {
		selectButton.click();
	}

	public void productnameSwitch(String prodName) {
		productNameSwitching.sendKeys(prodName);
}

	public void searchProductName() {
	
		productSearchSwitching.click();
}

	public void saveButton() {
		Save.click();
}
	
	
	
}
