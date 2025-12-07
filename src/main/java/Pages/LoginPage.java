package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username =By.id("user-name");
	By userpassword =By.id("password");
	By loginButton =By.id("login-button");
	By error = By.cssSelector("div.error");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void enterUserName(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String password) {
		driver.findElement(userpassword).sendKeys(password);
	}
	
	public void clickSubmit() {
		driver.findElement(loginButton).click();
	}
	
	public void login(String user, String password) {
		enterUserName(user);
		enterPassword(password);
		clickSubmit();
	}
	
	public String getErrorMessage() {
		return(driver.findElement(error).getText());
	}
	
}
