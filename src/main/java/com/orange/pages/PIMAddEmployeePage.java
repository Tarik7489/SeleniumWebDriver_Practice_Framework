package com.orange.pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class PIMAddEmployeePage extends SeleniumWrapper {

	private WebDriver driver;
	private SeleniumWrapper wrapper;

	public PIMAddEmployeePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wrapper = new SeleniumWrapper(driver);
	}

	private By getPIMTab = By.xpath("//span[text()=\"PIM\"]");

	private By getAddEmployeeTab = By.xpath("//a[text()=\"Add Employee\"]");
	
	private By getUploadFile = By.xpath("//input[@type=\"file\"]");
	
	private By getFirstName = By.xpath("//input[@name=\"firstName\"]");
	
	private By getMiddleName = By.xpath("//input[@name=\"middleName\"]");
	
	private By getLastName = By.xpath("//input[@name=\"lastName\"]");
	
	private By getSaveBtn = By.xpath("//button[@type=\"submit\"]");
	
	private By getToastMsgEmployeeCreated = By.xpath("//p[text()=\"Successfully Saved\"]");
	
	
	public void clickOnPIMTab() {
		wrapper.clickElement(getPIMTab);
	}
	
	public void clickOnAddEmployeeTab() {
		wrapper.clickElement(getAddEmployeeTab);
	}
	
	public void uploadFile(String filePath) {
		wrapper.uploadFile(getUploadFile, filePath);
	}
	
	public void fillFirstName(String firstName) {
		wrapper.typeText(getFirstName, firstName);
	}
	public void fillMiddleName(String middleName) {
		wrapper.typeText(getMiddleName, middleName);
	}
	public void fillLastName(String lastName) {
		wrapper.typeText(getLastName, lastName);
	}
	public void clickOnSaveBtn() {
		wrapper.clickElement(getSaveBtn);
	}
	
	public boolean verifyToastMsg(String expectedText) {
		return wrapper.verifyText(getToastMsgEmployeeCreated, expectedText);
	}
	
	
	public void CreateEmployee() throws IOException, ParseException {
		clickOnPIMTab();
		clickOnAddEmployeeTab();
		String filePath = "D:\\Java_Selenium_Automation\\Automation_Practice\\Resources\\Noums.png";
		uploadFile(filePath);
		fillFirstName(wrapper.getTestData("AddEmployeePage.FirstName"));
		fillMiddleName(wrapper.getTestData("AddEmployeePage.MiddleName"));
		fillLastName(wrapper.getTestData("AddEmployeePage.LastName"));
		clickOnSaveBtn();
		
	}
}
