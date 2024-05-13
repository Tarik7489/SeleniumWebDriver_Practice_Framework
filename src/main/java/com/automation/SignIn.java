package com.automation;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class SignIn extends SeleniumWrapper{
	
	private WebDriver driver;
	private SeleniumWrapper wrapper;
	

	public SignIn(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper=new SeleniumWrapper(driver);
	}

	
	
	private By getLoginLink= By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	
	private By getEmailField = By.xpath("//input[@data-qa=\"login-email\"]");
	
	
	private By getPwdField = By.xpath("//input[@data-qa=\"login-password\"]");
	
	private By getLoginBtn = By.xpath("//button[@data-qa=\"login-button\"]");
	
	
	public void clickOnLoginLink() {
		wrapper.clickElement(getLoginLink);
	}
	
	public void enterEmail(String email) {
		wrapper.typeText(getEmailField, email);
	}
	
	public void enterPassword(String password) {
		wrapper.typeText(getPwdField, password);
	}
	public void clickOnLoginButton() {
		wrapper.clickElement(getLoginBtn);
	}
	
	
	
	public void login() throws IOException, ParseException{
		clickOnLoginLink();
		enterEmail(wrapper.getTestData("SignIn.email"));
		enterPassword(wrapper.getTestData("SignIn.password"));
		clickOnLoginButton();
	}
}
