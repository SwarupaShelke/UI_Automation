package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtils {
	
	public WebDriver driver;
    public static WebDriverWait wait;
    
    // Wait for element
    public static WebElement waitforElementToVisible(By locator) {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public static WebElement clickability(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
