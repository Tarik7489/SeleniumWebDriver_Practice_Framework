package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest {

	WebDriver driver;
	SavvyLoginPage login;
	SearchPage search;
	
	
	@BeforeMethod
	public void setup() throws IOException, ParseException, InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qa.mychargesavvy.com/");
		
		login = new SavvyLoginPage(driver);
		
		search = new SearchPage(driver);
		
		login.LOGIN();
	}
	
	@Test
	public void verifyErrMessg() throws IOException, ParseException, InterruptedException {
		
		Thread.sleep(3000);
		search.searchMerchantNotFOund();
		
		Assert.assertTrue(search.verifyNotFoundMsg("Data Not Found"), "Text Doesn't match");
		
		
		
		
		
	}
}
