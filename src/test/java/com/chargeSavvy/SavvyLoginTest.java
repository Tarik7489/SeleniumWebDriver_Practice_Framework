package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.SeleniumWrapper;

public class SavvyLoginTest {
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	SavvyLoginPage savvy;
	
	@Parameters ("qaURL")
	@BeforeMethod	 (groups = {"Regression", "Smoke"})
	public void setUp(String qaURL) {
		
		driver = new ChromeDriver();
		System.out.println("hello");
//		driver.get("https://qa.mychargesavvy.com/auth/login");
		driver.get(qaURL);
		
		driver.manage().window().maximize();
		
		savvy = new SavvyLoginPage(driver);
	}

	

	@Test(groups = {"Smoke"} )
	
//	retryAnalyzer = Analyser.RetryAnalyser.class)  **** To retry the failed script in test label
	
	public void loginWithValidCredentials() throws IOException, ParseException, InterruptedException {
		
		Thread.sleep(5000);
		Assert.assertTrue(savvy.verifyLoginTxt("Login"), "Text does not match!");
		savvy.LOGIN();
	}
	
	@Test(groups = {"Regression"})
	
	public void verifyUserRequireErrMsg() throws IOException, ParseException, InterruptedException {
		
//		savvy.enterPassword(wrapper.getTestData("ChargeSavvyLogin.password"));
//		savvy.clickOnLoginBtn();
		
		Thread.sleep(4000);
		savvy.VerifyUsernameErrorMsg();
		Assert.assertTrue(savvy.UserNameRequireErrMsg("Username is required"), "Text does not match!");
		
	}
	@Test (groups = {"Regression"})
	
	public void verifyPwdRequireErrMsg() throws IOException, ParseException, InterruptedException {
		
		
		Thread.sleep(5000);
		savvy.VerifyPwdRequiredErrMsg();
		Assert.assertTrue(savvy.PwdRequireErrMsg("Password is required."), "Text does not match!");
	}
	
	@Test (groups = {"Regression"})
	
	public void verifyUserNameAndPwdRequireMsg() throws IOException, ParseException, InterruptedException {
		Thread.sleep(5000);
		savvy.clickOnLoginBtn();
		Assert.assertTrue(savvy.PwdRequireErrMsg("Password is required."), "Text does not match!");
		Assert.assertTrue(savvy.UserNameRequireErrMsg("Username is required"), "Text does not match!");
	}
	@AfterMethod (groups = {"Regression", "Smoke"})
	public void closeBrowser() {
		driver.quit();
	}
	
}
