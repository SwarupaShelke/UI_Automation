package com.soucedemo.ui.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import utils.configReader;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		configReader.initProp();
		
		String url = configReader.getProperty("baseURL");
		
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
