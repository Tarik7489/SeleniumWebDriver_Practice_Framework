package com.orange.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.orange.pages.AdminPage;
import com.orange.pages.JobTitlePage;
import com.orange.pages.LoginPage;
import com.orange.pages.PayGradePage;

import utils.SeleniumWrapper;

public class AdminTest {

	WebDriver driver;
	SeleniumWrapper wrapper;
	LoginPage login;
	JobTitlePage job;
	AdminPage admin;
	PayGradePage pay;

	@BeforeMethod

	public void setUp() throws IOException, ParseException {

		driver = new ChromeDriver();

		wrapper = new SeleniumWrapper(driver);

		login = new LoginPage(driver);
		job = new JobTitlePage(driver);
		admin = new AdminPage(driver);
		pay = new PayGradePage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		driver.get(wrapper.getTestData("Env.QA"));
		driver.manage().window().maximize();

		login.reUsedLogin();

	}

//	@Test
	public void verifyAddJobTitle() throws IOException, ParseException {
		job.clkAdminTab();
		job.clkJobDropdown();
		job.clkJobTitleOption();
		job.clkAddBtn();
		job.fillJobTitle(wrapper.getTestData("JobTitlePage.JobTitle"));

		String filePath = "D:\\Java_Selenium_Automation\\Automation_Practice\\Resources\\Noums.png";

		job.uploadFile(filePath);

		job.fileNote(wrapper.getTestData("JobTitlePage.Notes"));
		job.clkSaveBtn();

		Assert.assertTrue(job.verifySuccessfulToastMsg("Successfully Saved"), "Text does not match!");
		
		//delete job title
		
		job.selectFirstCheckBox();
		job.clkDeleteBtn();
		job.clkConfirmDeleteBtn();
		Assert.assertTrue(job.verifyDeleteToastMsg("Successfully Deleted"), "Text does not match!");
		

	}
	
	
	@Test
	
	public void verifyPayGradeFunctionality() throws IOException, ParseException {
		job.clkAdminTab();
		job.clkJobDropdown();
		pay.clickOnPayGradeOption();
		job.clkAddBtn();
		pay.fillPayGradeName(wrapper.getTestData("PayGradePage.Name"));
		job.clkSaveBtn();
//		Assert.assertTrue(job.verifySuccessfulToastMsg("Successfully Saved"), "Text does not match!");
		
		//delete pay grade
		job.clkJobDropdown();
		pay.clickOnPayGradeOption();
		job.selectFirstCheckBox();
		job.clkDeleteBtn();
		job.clkConfirmDeleteBtn();
		Assert.assertTrue(job.verifyDeleteToastMsg("Successfully Deleted"), "Text does not match!");
		
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
