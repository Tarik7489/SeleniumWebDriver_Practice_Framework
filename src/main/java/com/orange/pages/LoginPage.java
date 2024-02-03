package com.orange.pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper {
	
	private WebDriver driver;
	
	private SeleniumWrapper wrapper;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper = new SeleniumWrapper(driver);
		
	}
	
	
	
	private By getUserName = By.xpath("//input[@name=\"username\"]");
	
	private By getPwd = By.xpath("//input[@type=\"password\"]");
	
	private By getLoginBtn = By.xpath("//button[@type=\"submit\"]");
	
	private By getInvalidCredentialsErrMsg= By.xpath("//p[text()=\"Invalid credentials\"]");
	
	
	
	public void fillUserName(String username) {
		wrapper.typeText(getUserName, username);
		
		
	}
	
	public void fillPassword(String password) {
		wrapper.typeText(getPwd, password);
		
		
	}
	
	public void clickOnLogin() {
		wrapper.clickElement(getLoginBtn);
	}
	
	public boolean verifyErrMsg(String expectedText) {
        return wrapper.verifyText(getInvalidCredentialsErrMsg, expectedText);
    }
	
	public void reUsedLogin() throws IOException, ParseException {
		fillUserName(wrapper.getTestData("LoginPage.validUserName"));
		fillPassword(wrapper.getTestData("LoginPage.validPassword"));
		clickOnLogin();
	}
}
