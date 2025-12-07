package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	
	
	By cart_Icon = By.cssSelector("a.shopping_cart_link");
	By checkout_button = By.cssSelector("button.checkout_button");
	
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnCartIcon() {
		driver.findElement(cart_Icon).click();
	}
	
	public void clickCheckout() {
		driver.findElement(checkout_button).click();
	}
}
