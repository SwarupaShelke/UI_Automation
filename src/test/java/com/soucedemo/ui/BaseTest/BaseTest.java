package com.soucedemo.ui.BaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import utils.configReader;

public class BaseTest {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@BeforeMethod
	public void SetUp() {
		configReader.initProp();
		
		String url = configReader.getProperty("baseURL");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--headless=new"); options.addArguments("--no-sandbox");
		 * options.addArguments("--disable-dev-shm-usage");
		 * options.addArguments("--disable-gpu");
		 * options.addArguments("--window-size=1920,1080");
		 * 
		 * driver = new ChromeDriver(options);
		 */
		driver =new EdgeDriver();
		utils.waitUtils.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
