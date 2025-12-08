package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserInformationPage {
	
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	By firstname =By.id("first-name");
	By lastname =By.id("last-name");
	By postalcode =By.id("postal-code");
	By continuebutton =By.id("continue");
	
	
	public UserInformationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFirstName(String user) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstname));
		driver.findElement(firstname).sendKeys("standard");
	}
	
	public void enterlastName(String user) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastname));
		driver.findElement(lastname).sendKeys("user");
	}
	
	public void enterPostCode(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(postalcode));
		driver.findElement(postalcode).sendKeys("411014");
	}
	
	public void clickContinueButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(continuebutton));
		driver.findElement(continuebutton).click();
	}
	
	public void enterUserDetails(String firstName, String LastName, String postCode) {
		enterFirstName(firstName);
		enterlastName(LastName);
		enterPostCode(postCode);
		clickContinueButton();
	}

}
