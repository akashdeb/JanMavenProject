package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement usernameTxtFld;
	
	@FindBy(name = "pwd")
	WebElement passwordTxtFld;
	
	@FindBy(xpath = "//div[text()='Login ']")
	WebElement loginButton;
	
	public void loginAction(String username, String password) {
		usernameTxtFld.sendKeys(username);
		passwordTxtFld.sendKeys(password);
		loginButton.click();
	}

	
}
