package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.waitUtils;

public class CartPage extends waitUtils{

	WebDriver driver;
	
	
	By cart_Icon = By.cssSelector("a.shopping_cart_link");
	By checkout_button = By.cssSelector("button.checkout_button");
	
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnCartIcon() {
		waitUtils.waitforElementToVisible(cart_Icon);
		driver.findElement(cart_Icon).click();
	}
	
	public void clickCheckout() {
		waitUtils.waitforElementToVisible(checkout_button);
		driver.findElement(checkout_button).click();
	}
}
