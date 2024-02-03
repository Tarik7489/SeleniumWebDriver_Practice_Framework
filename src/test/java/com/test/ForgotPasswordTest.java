package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForgotPasswordTest {
	
WebDriver driver;
	
	LoginPage login;
	
	ForgotPasswordPage password;
	
	
	@BeforeTest
	
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.get("https://members-qa.coyni.com/login");
		driver.manage().window().maximize();
		 login = new LoginPage(driver);
		 
		 password= new ForgotPasswordPage(driver);
	}
	
	@Test
	public void LoginWithValidCredentials() throws InterruptedException {
		
//		login.Login("ranjithachar1999@yopmail.com", "Admin@123", "123456");
//		
	}
	
	@Test
	
	public void VerifyForgotPasswordFunctionality() throws InterruptedException {
		
	
//		password.clkForgotPwdLink();
//		login.fillEmail("ranjithachar1999@yopmail.com");
//		login.clkNextBtn();
//		login.fillVerificationCode("123456");
//		password.fillNewPwd("Admin@123");
//		password.fillConfirmPwd("Admin@123");
//		password.clkSubmitBtn();
		
		
//		 password.clkForgotPwdLink();
//	        login.fillEmail((String) testData.get("email"));
//	        login.clkNextBtn();
//	        login.fillVerificationCode((String) testData.get("verificationCode"));
//	        password.fillNewPwd((String) testData.get("password"));
//	        password.fillConfirmPwd((String) testData.get("password"));
//	        password.clkSubmitBtn();
	
				
		
	}
	
	@AfterTest
	
	public void closeBrowser() {
		driver.quit();
	}

}

