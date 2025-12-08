package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.waitUtils;

public class CheckoutSummaryPage{
	
	WebDriver driver;

		By finishButton = By.id("finish");
		By successMsgText = By.cssSelector("h2.complete-header");
		
		public CheckoutSummaryPage(WebDriver driver) {
			this.driver=driver;
		}

		
		public void clickFinishButton() {
			waitUtils.clickability(finishButton);
			driver.findElement(finishButton).click();
		}
		
		public String getSuccessMsgText() {
			waitUtils.waitforElementToVisible(successMsgText);
			String text= driver.findElement(successMsgText).getText();
			return text;
		}
}
