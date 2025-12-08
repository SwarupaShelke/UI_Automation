package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.waitUtils;

public class LoginPage{

	WebDriver driver;
	WebDriverWait wait;
	
	By username =By.id("user-name");
	By userpassword =By.id("password");
	By loginButton =By.id("login-button");
	By error = By.cssSelector("div.error");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String user) {
		waitUtils.waitforElementToVisible(username);
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String password) {
		waitUtils.waitforElementToVisible(userpassword);
		driver.findElement(userpassword).sendKeys(password);
	}
	
	public void clickSubmit() {
		waitUtils.clickability(loginButton);
		driver.findElement(loginButton).click();
	}
	
	public void login(String user, String password) {
		enterUserName(user);
		enterPassword(password);
		clickSubmit();
	}
	
	public String getErrorMessage() {
		waitUtils.waitforElementToVisible(error);
		return(driver.findElement(error).getText());
	}
	
}
