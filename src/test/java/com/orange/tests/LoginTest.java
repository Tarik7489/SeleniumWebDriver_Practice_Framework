package com.orange.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.pages.LoginPage;

import utils.SeleniumWrapper;

public class LoginTest {

	WebDriver driver;
	SeleniumWrapper wrapper;
	LoginPage login;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		wrapper = new SeleniumWrapper(driver);
		login = new LoginPage(driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}
	
	@Test
	
	public void loginWithValidCredentials() throws IOException, ParseException {
		
		login.reUsedLogin();
	}

//	
	@Test
	
	public void verifyErrorMessageWithInvalidLoginCredentials() throws IOException, ParseException {
		
		login.fillUserName(wrapper.getTestData("LoginPage.InvalidUserName"));
		login.fillPassword(wrapper.getTestData("LoginPage.validPassword"));
		login.clickOnLogin();
		
		Assert.assertTrue(login.verifyErrMsg("Invalid credentials"), "Text does not match!");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
