package OrganizationPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.Webdriver_Utility;

public class CreateProductPage {

	public CreateProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement plussignImage;
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productName;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement Save;
	
	//--->getters methods

	public WebElement getPlusgignImage() {
		return plussignImage;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getSave() {
		return Save;
	}
	
	
	//----business logic
	public void clickOnPlusImg() {
		plussignImage.click();
	}
	
	public void productData(String productNameData) {
		productName.sendKeys(productNameData);
		
	}
	
	public void saveButton(WebDriver driver) {
		Webdriver_Utility wlib = new Webdriver_Utility();
		WebElement savebutton = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
		 
		wlib.javaScriptExecutor(driver, savebutton);
		Save.click();
	}

}
