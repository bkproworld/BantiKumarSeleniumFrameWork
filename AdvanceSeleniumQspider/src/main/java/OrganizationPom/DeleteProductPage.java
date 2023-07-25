package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductPage {
	
	
	public DeleteProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Products")
	private WebElement navigateProductTable;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteProduct;

	//getters methods
	public WebElement getNavigateProductTable() {
		return navigateProductTable;
	}

	public WebElement getDeleteProduct() {
		return deleteProduct;
	}
	
	//----business logic
	
	public void productTable() {
		navigateProductTable.click();
	}
	
	public void deleteProductData() {

	deleteProduct.click();
		
	}
	
	
}
