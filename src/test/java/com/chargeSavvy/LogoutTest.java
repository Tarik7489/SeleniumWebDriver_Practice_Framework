package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.SeleniumWrapper;

public class LogoutTest {

	WebDriver driver;
	SeleniumWrapper wrapper;
	SavvyLoginPage login;
	LogoutPage logout;

	@Parameters("qaURL")
	@BeforeMethod(groups = { "Smoke" })
	public void setUP(String qaURL) {

		driver = new ChromeDriver();

		driver.get(qaURL);
		driver.manage().window().maximize();

		login = new SavvyLoginPage(driver);
		logout = new LogoutPage(driver);
	}

	@Test(groups = { "Smoke" })

	public void logoutFromTheApplication() throws IOException, ParseException, InterruptedException {
		Thread.sleep(4000);
		login.LOGIN();
		Thread.sleep(5000);
//		logout.LOGOUT();
		logout.clickOnProfileDropDown();
		logout.clickOnLogoutBtn();

		Assert.assertTrue(logout.verifyLoginText("Login"), "Text Doesn't match");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
