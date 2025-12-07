package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutSummaryPage {
	
	WebDriver driver;

		By finishButton = By.id("finish");
		By successMsgText = By.cssSelector("h2.complete-header");
		
		public CheckoutSummaryPage(WebDriver driver) {
			this.driver = driver;
		}

		
		public void clickFinishButton() {
			driver.findElement(finishButton).click();
		}
		
		public String getSuccessMsgText() {
			String text= driver.findElement(successMsgText).getText();
			return text;
		}
}
