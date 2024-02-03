package com.test;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.SeleniumWrapper;

public class LoginTest {

	WebDriver driver;

	LoginPage login;

	SeleniumWrapper wrapper;

	@BeforeMethod

	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://members-qa.coyni.com/login");
		
		driver.manage().window().maximize();
		login = new LoginPage(driver);

		wrapper = new SeleniumWrapper(driver);
	}

	@Test

	public void LoginWithValidCredentials() throws InterruptedException, IOException, ParseException {

////		login.Login("ranjithachar1999@yopmail.com", "Admin@123", "123456");
////		login.fillEmail();
//		String validEmail = wrapper.getTestData("user.validEmail");
//        login.fillEmail(validEmail);
//		
////		login.fillPwd();
//		login.clkNextBtn();
//		login.fillVerificationCode();

		login.ValidLogin();

	}

	@Test

	public void VerifyErrMsgWithInvalidLogin() throws InterruptedException, IOException, ParseException {
try {
		login.InvalidLogin();
		Assert.assertTrue(login.verifyLoginErrMsg("User data not found in the system."), "Text does not match!");
	}
catch(Exception e) {
	System.out.println(e);
}
	}

	@AfterMethod

	public void closeBrowser() {
		driver.quit();
	}

}
