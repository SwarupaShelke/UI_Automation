package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInformationPage {
	
	WebDriver driver;
	
	By firstname =By.id("first-name");
	By lastname =By.id("last-name");
	By postalcode =By.id("postal-code");
	By continuebutton =By.id("continue");
	
	
	public UserInformationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFirstName(String user) {
		driver.findElement(firstname).sendKeys("standard");
	}
	
	public void enterlastName(String user) {
		driver.findElement(lastname).sendKeys("user");
	}
	
	public void enterPostCode(String password) {
		driver.findElement(postalcode).sendKeys("411014");
	}
	
	public void clickContinueButton() {
		driver.findElement(continuebutton).click();
	}
	
	public void enterUserDetails(String firstName, String LastName, String postCode) {
		enterFirstName(firstName);
		enterlastName(LastName);
		enterPostCode(postCode);
		clickContinueButton();
	}

}
