package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.waitUtils;

public class CartPage extends waitUtils{

	WebDriver driver;
	
	
	By cart_Icon = By.cssSelector("a.shopping_cart_link");
	By checkout_button = By.id("checkout");
	
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnCartIcon() {
		waitUtils.clickability(cart_Icon);
		driver.findElement(cart_Icon).click();
	}
	
	public void clickCheckout() throws InterruptedException {
		waitUtils.clickability(checkout_button);
		Thread.sleep(10000);
		driver.findElement(checkout_button).click();
	}
}
