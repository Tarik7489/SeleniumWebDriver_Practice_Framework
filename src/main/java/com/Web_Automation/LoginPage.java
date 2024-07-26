package com.Web_Automation;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper{
	
	private WebDriver driver;
	private SeleniumWrapper wrapper;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper=new SeleniumWrapper(driver);
	}
	
	
	
	private By getEmailField = By.xpath("//input[@name=\"email\"]");
	
	private By getPwdField = By.xpath("//input[@name=\"password\"]");
	
	private By getLoginBtn = By.xpath("//button[@type=\"submit\"]");
	
	private By errMsgForEmailField = By.xpath("//span[text()='Please enter your email']");
	
	private By errMsgForPwdField = By.xpath("//span[text()='Please enter your password']");
	
	private By getCodeField = By.xpath("(//div[contains(@class,'flex relative align-center VerificationInput_verification_input__tIdkF')])//input[1]");
	
	
	
	
	public void enterEmail(String email) {
		wrapper.typeText(getEmailField, email);
	}
	
	public void enterPwd(String pwd) {
		wrapper.typeText(getPwdField, pwd);
	}
	
	public void clkLoginBtn() {
		wrapper.clickElement(getLoginBtn);
	}
	
	public void enterVerificationCode(String code) {
		wrapper.typeText(getCodeField, code);
	}
	
	public boolean verifyEmailErrMsg(String expectedText) {
		return wrapper.verifyText(errMsgForEmailField, expectedText);
	}
	public boolean verifyPwdErrMsg(String expectedText) {
		return wrapper.verifyText(errMsgForPwdField, expectedText);
	}
	
	
	
	public void Login() throws IOException, ParseException{
		enterEmail(wrapper.getTestData("BFSI_Login.email"));
		enterPwd(wrapper.getTestData("BFSI_Login.password"));
		clkLoginBtn();
	}

	
	public void VerificationCode() throws IOException, ParseException {
		enterVerificationCode(wrapper.getTestData("BFSI_Login.code"));
	}
}