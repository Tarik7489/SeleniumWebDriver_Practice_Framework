package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.SeleniumWrapper;

public class CreateMerchantTest {
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	SavvyLoginPage login;
	CreateMerchantPage merchant;
	
	@Parameters ("qaURL")
	@BeforeMethod
	public void setUp(String qaURL) {
		
		driver = new ChromeDriver();
		driver.get(qaURL);
		driver.manage().window().maximize();
		
		login = new SavvyLoginPage(driver);
		
		merchant = new CreateMerchantPage(driver);
	}

	
	@Test
	
	public void createMerchant() throws IOException, ParseException, InterruptedException {
		
		login.LOGIN();
		merchant.clickOnCreateMerchantBtn();
		merchant.clickOnCancelBtn();
	}
}
