package com.Web_Automation;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.SeleniumWrapper;

public class LoginTest {
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	
	LoginPage login;
	
	
	@BeforeMethod (groups = {"Smoke","Regression"})
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://admin-qa.coyni.com/login");
		driver.manage().window().maximize();
		
		wrapper = new SeleniumWrapper(driver);
		login = new LoginPage(driver);
		
	}
	
	@Test (groups= {"Smoke", "Regression"})
	public void loginWithValidCredentials() throws IOException, ParseException, InterruptedException {
		
		login.Login();
		login.VerificationCode();
	}
	
	@Test (groups = {"Smoke"})
	public void verifyErrErrorMsg() throws IOException, ParseException {
		
		login.enterEmail(wrapper.getTestData("BFSI_Login.email"));
		login.enterPwd(wrapper.getTestData("BFSI_Login.null"));
		login.enterEmail(wrapper.getTestData("BFSI_Login.email"));
	
		Assert.assertTrue(login.verifyPwdErrMsg("Please enter your password"), "Text doesn't match");
	}
	
	@Test (groups = {"Smoke"})
	public void verifyEmailErrorMsg() throws IOException, ParseException {
		
		login.enterEmail(wrapper.getTestData("BFSI_Login.null"));
		login.enterPwd(wrapper.getTestData("BFSI_Login.password"));	
		Assert.assertTrue(login.verifyEmailErrMsg("Please enter your email"), "Text doesn't match");
	}
	
	@Test (groups = {"Regression"})
	public void verifyLoginBtnIsDisable() throws IOException, ParseException {
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		email.isEnabled();
	}
	
	@AfterMethod (groups= {"Smoke", "Regression"})
	public void closeBrowser() {
		driver.quit();
	}

}