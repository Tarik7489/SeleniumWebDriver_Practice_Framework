package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class VerifyErrorMsgPage extends SeleniumWrapper{
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	
	
	public VerifyErrorMsgPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper=new SeleniumWrapper(driver);
	}
	
	By userNameField=By.xpath("//input[@name=\"username\"]");
	By pwdField =By.xpath("//input[@name=\"password\"]");
	By submitBtn=By.xpath("//button[@id=\"submit\"]");
	By getInvalidUserNameErrMsg=By.xpath("//div[text()=\"Your username is invalid!\"]");
	By getInvalidPwdErrMsg=By.xpath("//div[text()=\"Your password is invalid!\"]");
	
	
	public boolean verifyUserNameErrMsg(String expectedText) {
		return wrapper.verifyText(getInvalidUserNameErrMsg, expectedText);
	}
	
	public boolean verifyPwdErrMsg(String expectedText) {
		return wrapper.verifyText(getInvalidPwdErrMsg, expectedText);
	}
	
	public void enterUserName(String username) {
		wrapper.typeText(userNameField, username);
	}
	public void enterPwd(String password) {
		wrapper.typeText(pwdField, password);
	}
	
	public void clkSubmitBtn() {
		wrapper.clickElement(submitBtn);
	}

}
