package com.orange.pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class JobTitlePage extends SeleniumWrapper {

	private WebDriver driver;
	private SeleniumWrapper wrapper;

	public JobTitlePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wrapper = new SeleniumWrapper(driver);
	}
	
	private By getAdminTab = By.xpath("//span[text()=\"Admin\"]");

	private By getJobDropdown=By.xpath("//span[text()=\"Job \"]");
	
	private By selectJobTitleOption = By.xpath("//a[text()=\"Job Titles\"]");
	
	private By getAddBtn = By.xpath("(//button[@type=\"button\"])[3]");
	
	private By getJobTitleField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
	
	private By getFile = By.xpath("//input[@type=\"file\"]");
	
	private By getNoteField = By.xpath("//textarea[@placeholder=\"Add note\"]");
	
	private By getSaveButton = By.xpath("//button[@type=\"submit\"]");
	
	private By addSuccessfulJobTitle= By.xpath("//p[text()=\"Successfully Saved\"]");
	
	private By getFirstCheckBoxn = By.xpath("(//div[@class=\"oxd-table-card-cell-checkbox\"])[1]");
	
	private By getDeletSelectedBtn = By.xpath("//button[text()=\" Delete Selected \"]");
	
	private By getConfirmDeleteBtn = By.xpath("//button[text()=\" Yes, Delete \"]");
	
	private By deleteSuccessfulyToastMsg = By.xpath("//p[text()=\"Successfully Deleted\"]");
	
	public boolean verifyDeleteToastMsg(String expectedText) {
		return wrapper.verifyText(deleteSuccessfulyToastMsg, expectedText);
	}
	

	public void selectFirstCheckBox() {

		wrapper.clickElement(getFirstCheckBoxn);
	}
	public void clkDeleteBtn() {

		wrapper.clickElement(getDeletSelectedBtn);
	}
	public void clkConfirmDeleteBtn() {

		wrapper.clickElement(getConfirmDeleteBtn);
	}
	public void clkAdminTab() {

		wrapper.clickElement(getAdminTab);
	}
	
	public void clkJobDropdown() {

		wrapper.clickElement(getJobDropdown);
	}

	public void clkJobTitleOption() {

		wrapper.clickElement(selectJobTitleOption);
	}
	
	public void clkAddBtn() {

		wrapper.clickElement(getAddBtn);
	}
	
	public void fillJobTitle(String jobTitle) throws IOException, ParseException {
		wrapper.typeText(getJobTitleField,jobTitle );
	}
	
	public void uploadFile(String filePath) throws IOException, ParseException {
		wrapper.uploadFile(getFile, filePath);
	}
	
	public void fileNote(String notes) throws IOException, ParseException {
		wrapper.typeText(getNoteField,notes );
	}
	public void clkSaveBtn() {

		wrapper.clickElement(getSaveButton);
	}
	
	public boolean verifySuccessfulToastMsg(String expectedText) {
		return wrapper.verifyText(addSuccessfulJobTitle, expectedText);
	}
}
