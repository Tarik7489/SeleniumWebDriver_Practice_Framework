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

public class SearchMerchantTest {
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	SavvyLoginPage login;
	SearchMerchantPage search;
	
	
	@Parameters ("qaURL")
	@BeforeMethod (groups = {"Smoke"})
	public void setup(String qaURL) {
		
		driver = new ChromeDriver();
		driver.get(qaURL);
		driver.manage().window().maximize();
		
		wrapper = new SeleniumWrapper(driver);
		
		login = new SavvyLoginPage(driver);
		search = new SearchMerchantPage(driver);
		
	}
	
//	
//	@Test
//	public void VerifyCreateInventoryFlow() throws InterruptedException, IOException, ParseException {
//		
//		Thread.sleep(4000);
//		login.LOGIN();
//		search.createInventoryItems();
//		
//	}
	
	@Test (groups = {"Smoke"})
	public void verifyBergModelRequireErrMsg() throws InterruptedException, IOException, ParseException {
		
		Thread.sleep(4000);
		login.LOGIN();
		Thread.sleep(3000);
		search.searchMerchantName(wrapper.getTestData("CreateInventory.SearchField"));
		Thread.sleep(3000);
		search.clickOnEyeIcon();
		search.clickOnPOSConfiguration();
		search.clickingOnBegTab();

		search.clickOnCreateBergBtn();
		search.enterPortNumber(wrapper.getTestData("Berg.portNumber"));
		search.enterIpAddress(wrapper.getTestData("Berg.ipAddress"));
		search.enterRingNumber(wrapper.getTestData("Berg.ringNumber"));
		search.clickOnCreateBergBtn();
		Assert.assertTrue(search.verifyBergModelRequireErrMsg("berg Model is required"), "Text does not match!");	
		
	}
	
	
	@Test (groups = {"Smoke"})
	public void verifySomethingWentWrongErrMsgWhenPortNumberFieldIsEmpty() throws InterruptedException, IOException, ParseException {
		
		Thread.sleep(4000);
		login.LOGIN();
		Thread.sleep(3000);
		search.searchMerchantName(wrapper.getTestData("CreateInventory.SearchField"));
		Thread.sleep(3000);
		search.clickOnEyeIcon();
		search.clickOnPOSConfiguration();
		search.clickingOnBegTab();
		search.clickOnCreateBergBtn();
		search.clickOnBergModelField();
		search.selectBergModal();
		search.enterIpAddress(wrapper.getTestData("Berg.ipAddress"));
		search.enterRingNumber(wrapper.getTestData("Berg.ringNumber"));
		search.clickOnCreateBergBtn();
		Assert.assertTrue(search.verifySomethingWentWrongErrMsg("Some thing went wrong."), "Text does not match!");
			
	}
	
	@Test (groups = {"Smoke"})
	public void verifyIpAddressErrMsgWhenIpAddressFieldIsEmpty() throws InterruptedException, IOException, ParseException {
		
		Thread.sleep(4000);
		login.LOGIN();
		Thread.sleep(3000);
		search.searchMerchantName(wrapper.getTestData("CreateInventory.SearchField"));
		Thread.sleep(3000);
		search.clickOnEyeIcon();
		search.clickOnPOSConfiguration();
		search.clickingOnBegTab();
		search.clickOnCreateBergBtn();
		search.clickOnBergModelField();
		search.selectBergModal();
		search.enterPortNumber(wrapper.getTestData("Berg.portNumber"));
		search.enterRingNumber(wrapper.getTestData("Berg.ringNumber"));
		search.clickOnCreateBergBtn();
		Assert.assertTrue(search.verifyIPAddressRequireErrMSg("Ip Address is required"), "Text does not match!");
			
	}
	
	@Test
	public void verifySomethingWentWrongErrMsgWhenRingNumberFieldIsEmpty() throws InterruptedException, IOException, ParseException {
		
		Thread.sleep(4000);
		login.LOGIN();
		Thread.sleep(3000);
		search.searchMerchantName(wrapper.getTestData("CreateInventory.SearchField"));
		Thread.sleep(3000);
		search.clickOnEyeIcon();
		search.clickOnPOSConfiguration();
		search.clickingOnBegTab();
		search.clickOnCreateBergBtn();
		search.clickOnBergModelField();
		search.selectBergModal();
		search.enterPortNumber(wrapper.getTestData("Berg.portNumber"));
		search.enterIpAddress(wrapper.getTestData("Berg.ipAddress"));
		search.clickOnCreateBergBtn();
		Assert.assertTrue(search.verifySomethingWentWrongErrMsg("Some thing went wrong."), "Text does not match!");
			
	}
	
	@Test
	public void verifyAllErrMsgWhenAllFieldareEmpty() throws InterruptedException, IOException, ParseException {
		
		Thread.sleep(4000);
		login.LOGIN();
		Thread.sleep(3000);
		search.searchMerchantName(wrapper.getTestData("CreateInventory.SearchField"));
		Thread.sleep(3000);
		search.clickOnEyeIcon();
		search.clickOnPOSConfiguration();
		search.clickingOnBegTab();
		search.clickOnCreateBergBtn();
		search.clickOnCreateBergBtn();
		Assert.assertTrue(search.verifyBergModelRequireErrMsg("berg Model is required"), "Text does not match!");	
		Assert.assertTrue(search.verifyIPAddressRequireErrMSg("Ip Address is required"), "Text does not match!");
		Assert.assertTrue(search.verifyPortNumberRequireErrMsh("Port Number is Required"), "Text does not match!");
		Assert.assertTrue(search.verifygetRingNumberRequireErrMsg("Ring Number is required"), "Text does not match!");
	}
	
	@AfterMethod (groups = {"Smoke"})
	public void closeBrowser() {
		System.out.println("closing browser");
		driver.quit();
		
	}

}
