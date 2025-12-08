package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.waitUtils;

public class UserInformationPage{
	
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	By firstname =By.id("first-name");
	By lastname =By.id("last-name");
	By postalcode =By.id("postal-code");
	By continuebutton =By.id("continue");
	
	
	public UserInformationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterFirstName(String user) {
		
		waitUtils.waitforElementToVisible(firstname);
		driver.findElement(firstname).sendKeys("standard");
	}
	
	public void enterlastName(String user) {
		waitUtils.waitforElementToVisible(lastname);
		driver.findElement(lastname).sendKeys("user");
	}
	
	public void enterPostCode(String password) {
		waitUtils.waitforElementToVisible(postalcode);
		driver.findElement(postalcode).sendKeys("411014");
	}
	
	public void clickContinueButton() {
		waitUtils.clickability(continuebutton);
		driver.findElement(continuebutton).click();
	}
	
	public void enterUserDetails(String firstName, String LastName, String postCode) {
		enterFirstName(firstName);
		enterlastName(LastName);
		enterPostCode(postCode);
		clickContinueButton();
	}

}
