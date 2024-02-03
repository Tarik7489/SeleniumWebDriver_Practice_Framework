package com.orange.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.pages.AdminPage;
import com.orange.pages.JobTitlePage;
import com.orange.pages.LoginPage;
import com.orange.pages.PIMAddEmployeePage;
import com.orange.pages.PayGradePage;

import utils.SeleniumWrapper;

public class PIMTest {

	LoginPage login;

	WebDriver driver;

	PIMAddEmployeePage addEmployee;

	SeleniumWrapper wrapper;

	@BeforeMethod

	public void setUP() throws IOException, ParseException {
		
		driver = new ChromeDriver();

		wrapper = new SeleniumWrapper(driver);

		login = new LoginPage(driver);
		addEmployee = new PIMAddEmployeePage(driver);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.get(wrapper.getTestData("env.QA"));
		driver.manage().window().maximize();

		login.reUsedLogin();
	}

	@Test

	public void verifyAddEmployee() throws IOException, ParseException {

		addEmployee.CreateEmployee();
		Assert.assertTrue(addEmployee.verifyToastMsg("Successfully Saved"), "Text does not match!");

	}

}
