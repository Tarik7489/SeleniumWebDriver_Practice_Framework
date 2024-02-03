package com.orange.pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class AdminPage extends SeleniumWrapper {

	private WebDriver driver;
	private SeleniumWrapper wrapper;

	public AdminPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wrapper = new SeleniumWrapper(driver);
	}

	

	private By getAddAdminBtn = By.xpath("(//button[@type=\"button\"])[5]");

	private By getUserRoleDropDownList = By.xpath("(//div[text()=\"-- Select --\"])[1]");

	private By selectAdmin = By.xpath("//div[text()=\"Admin\"]");

	private By getStatusDropDownList = By.xpath("(//div[text()=\"-- Select --\"])[1]");

	private By selectEnabled = By.xpath("//div[text()=\"Enabled\"]");

	private By getUserNameField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");

	private By getPasswordField = By.xpath("(//input[@type=\"password\"])[1]");

	private By getConfirmPwdField = By.xpath("(//input[@type=\"password\"])[2]");

	private By getEmployeNameField = By.xpath("//input[@placeholder=\"Type for hints...\"]");

	private By getSaveBtn = By.xpath("//button[@type=\"submit\"]");
	

	public void clkAddAdminBtn() {

		wrapper.clickElement(getAddAdminBtn);
	}
	
	public void clickUserRoleDropDown() {

		wrapper.clickElement(getUserRoleDropDownList);
	}
	public void selectAdminRole() {

		wrapper.clickElement(selectAdmin);
	}
	
	public void fillEmployeeName(String employeeName) throws IOException, ParseException {
		wrapper.typeText(getEmployeNameField, wrapper.getTestData("AdminPage.EmployeeName"));
	}
	public void selectEmployee() {

		wrapper.clickElement(selectAdmin);
	}
}
