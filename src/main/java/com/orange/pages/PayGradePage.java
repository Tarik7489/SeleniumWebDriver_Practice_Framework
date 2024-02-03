package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class PayGradePage extends SeleniumWrapper {

	private WebDriver driver;
	private SeleniumWrapper wrapper;

	public PayGradePage(WebDriver driver) {

		super(driver);
		this.driver = driver;
		this.wrapper = new SeleniumWrapper(driver);

	}
	
	private By getPayGradeOption = By.xpath("//a[text()=\"Pay Grades\"]");
	
	private By getNameField = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
	
	
	public void clickOnPayGradeOption() {
		wrapper.clickElement(getPayGradeOption);
	}
	
	public void fillPayGradeName(String name) {
		wrapper.typeText(getNameField, name);
	}

}
