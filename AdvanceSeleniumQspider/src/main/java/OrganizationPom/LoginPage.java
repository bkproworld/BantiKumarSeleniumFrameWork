package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		
		public LoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="user_name")
		private WebElement userNameTextField;
		
		@FindBy(name="user_password")
		private WebElement passWordTextField;
		
		@FindBy(id="submitButton")
		private WebElement loginButton;
		
		//getters methods

		public WebElement getUserNameTextField() {
			return userNameTextField;
		}

		public WebElement getPassWordTextField() {
			return passWordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		//business logic
		public void loginToApp(String username, String Password) {
			userNameTextField.sendKeys(username);
			passWordTextField.sendKeys(Password);
			loginButton.click();
		}
		
		

}
