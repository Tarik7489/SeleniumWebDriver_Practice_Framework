package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyErrorMsgTest {
	
	WebDriver driver;
	
	VerifyErrorMsgPage errMsg;
	
	@BeforeTest
	public void setUp() {
		driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		errMsg = new VerifyErrorMsgPage(driver);
	}
	
	@Test(priority = 1)
	
	public void verifyTheErrrorMsgForUserNameField() {
		
		errMsg.enterUserName("abc");
		errMsg.enterPwd("Password123");
		errMsg.clkSubmitBtn();
		Assert.assertTrue(errMsg.verifyUserNameErrMsg("Your username is invalid!"), "Text does not match!");
		
	}
	
	@Test(priority = 2)
	
	public void verifyTheErrrorMsgForPasswordField() {
		
		errMsg.enterUserName("student");
		errMsg.enterPwd("abc");
		errMsg.clkSubmitBtn();
		Assert.assertTrue(errMsg.verifyUserNameErrMsg("Your password is invalid!"), "Text does not match!");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
