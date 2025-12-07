package com.soucedemo.ui;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.soucedemo.ui.BaseTest.BaseTest;

import Pages.CartPage;
import Pages.CheckoutSummaryPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.UserInformationPage;
import utils.configReader;

public class LoginTest extends BaseTest{

	
	LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    UserInformationPage userInformationPage;
    CheckoutSummaryPage checkoutSummaryPage;
    
	@BeforeMethod
	public void PageSetUP() {
		loginPage =new LoginPage(driver);
		inventoryPage =new InventoryPage(driver);
		cartPage =new CartPage(driver); 
		userInformationPage = new UserInformationPage(driver);
		checkoutSummaryPage = new CheckoutSummaryPage(driver);
	}
	@Test
	public void eneTest() throws InterruptedException{
	String validUserName = configReader.getProperty("validUserName");
	String validpassword = configReader.getProperty("validpassword");
	
	loginPage.login(validUserName, validpassword);
	inventoryPage.clickScondLastItem();
	inventoryPage.clickLastItem();
	 cartPage.clickOnCartIcon(); cartPage.clickCheckout();
	 userInformationPage.enterUserDetails("abc", "xyz", "411014");
	 checkoutSummaryPage.clickFinishButton();
	 Assert.assertEquals(checkoutSummaryPage.getSuccessMsgText(), "Thank you for your order!");
	}
	
	@Test
    public void invalidLoginTest() {	
		String inValidUserName = configReader.getProperty("inValidUserName");
		String validpassword = configReader.getProperty("validpassword");
        loginPage.login(inValidUserName, validpassword);

        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
    }

}
