package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	
	WebDriver driver;
	
	By allItemList = By.cssSelector("button.btn_inventory");
	
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
	}

	
	public void clickLastItem() {
	List<WebElement> items = driver.findElements(allItemList);
		items.get(items.size()-1).click();
	}
	
	public void clickScondLastItem() {
		List<WebElement> items = driver.findElements(allItemList);
		items.get(items.size()-2).click();
	}
}
