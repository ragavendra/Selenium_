package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		// set path of Chromedriver executable
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/drivers/chromedriver.exe");

		// initialize new WebDriver session
		driver = new ChromeDriver();
	}

	@Test
	public void navigateToAUrl() {
		// navigate to the web site
		driver.get("http://demo.atata.io");
		// Validate page title
		Assert.assertEquals(driver.getTitle(), "Atata Sample App");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
