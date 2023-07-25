package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductForCampaignPage {

	
public CreateProductForCampaignPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement plusgignImage;
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productName;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])")
	private WebElement Save;
	
	//--->getters methods

	public WebElement getPlusgignImage() {
		return plusgignImage;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getSave() {
		return Save;
	}
	
	public void clickOnPlusImg() {
		plusgignImage.click();
	}
	
	public void productData(String productNameData) {
		productName.sendKeys(productNameData);
		
	}
	
	public void saveButton() {
		Save.click();
	}
	
	
	
}
