package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class SavvyLoginPage extends SeleniumWrapper {
	private WebDriver driver;
	private SeleniumWrapper wrapper;
	
	public SavvyLoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper= new SeleniumWrapper(driver);
	}
	


	private By getLoginTxt = By.xpath("//*[@id=\"__next\"]/div/main/div/div/h1");
	
	private By getUserNameField = By.xpath("//input[@name=\"userName\"]");
	
	private By getPwdField = By.xpath("//input[@name=\"passWord\"]");
	
	private By getLoginBtn = By.xpath("//button[@type=\"submit\"]");
	
	private By userRequireErrMsg = By.xpath("//*[.='Username is required']");
	
	private By pwdRequireErrMsg = By.xpath("//*[.='Password is required.']");
	
	
	public boolean UserNameRequireErrMsg(String expectedText) {
		return wrapper.verifyText(userRequireErrMsg, expectedText);
	}
	
	public boolean PwdRequireErrMsg(String expectedText) {
		return wrapper.verifyText(pwdRequireErrMsg, expectedText);
	}
	
	public boolean verifyLoginTxt(String expectedText) {
		return wrapper.verifyText(getLoginTxt, expectedText);
	}
	
	public void enterUserName(String username) {
		wrapper.typeText(getUserNameField, username);
	}
	
	public void enterPassword(String password) {
		wrapper.typeText(getPwdField, password);
	}
	
	public void clickOnLoginBtn() {
		wrapper.clickElement(getLoginBtn);
	}
	
	
	public void LOGIN() throws IOException, ParseException, InterruptedException {
		Thread.sleep(3000);
		enterUserName(wrapper.getTestData("ChargeSavvyLogin.username"));
		enterPassword(wrapper.getTestData("ChargeSavvyLogin.password"));
		clickOnLoginBtn();
		Thread.sleep(2000);
	}
	
	public void VerifyUsernameErrorMsg() throws IOException, ParseException {
		enterPassword(wrapper.getTestData("ChargeSavvyLogin.password"));
		clickOnLoginBtn();
	}
	
	public void VerifyPwdRequiredErrMsg() throws IOException, ParseException {
		enterUserName(wrapper.getTestData("ChargeSavvyLogin.username"));
		clickOnLoginBtn();
	}
	public void VerifyUserNameAndPwdRequireErrMsg() throws IOException, ParseException {
		clickOnLoginBtn();
	}
	
	

}
