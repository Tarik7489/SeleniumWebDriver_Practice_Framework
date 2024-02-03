package com.test;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper {
	
	
private	WebDriver driver;
private SeleniumWrapper wrapper;
	
	
public LoginPage(WebDriver driver) {
    super(driver);
    this.driver = driver;
    this.wrapper = new SeleniumWrapper(driver);
}
	
	
	By emailField=By.xpath("//input[@name=\"email\"]");
	
	By pwdField=By.xpath("//input[@name=\"password\"]");
	
	By nextBtn=By.xpath("//button[@type=\"submit\"]");
	
//	By getCode=By.cssSelector(".VerificationInput_verification_input_wrapper__o8Que > .relative > :nth-child(1)");
	
	By getCode=By.xpath("(//div[contains(@class,'flex relative align-center gap-3 leading-10 VerificationInput_verification_input__yYLC-')])//input[1]");
	
	By errLogin=By.xpath("//p[text()=\"User has not completed with registration steps in GreenBox system, kindly finish and login.\"]");
	
	public void fillEmail(String email) throws IOException, ParseException {
//		driver.findElement(emailField).sendKeys(email);
		wrapper.typeText(emailField, email);
//		String email = wrapper.getTestData("Login.email");
//		wrapper.typeText(emailField, email);
		
	}
	
	public void fillPwd(String password) throws IOException, ParseException {
//		driver.findElement(pwdField).sendKeys(password);
		wrapper.typeText(pwdField, password);
		
//		String password = wrapper.getTestData("Login.password");
//		wrapper.typeText(pwdField, password);
	}
	
	public void clkNextBtn() {
//		driver.findElement(nextBtn).click();
		wrapper.clickElement(nextBtn);
	}
	
	public void fillVerificationCode(String code) throws IOException, ParseException {
//		driver.findElement(getCode).sendKeys(code);
		wrapper.typeText(getCode, code);
//		
//		String code = wrapper.getTestData("Login.code");
//		wrapper.typeText(getCode, code);
		
	}
	
	public boolean verifyLoginErrMsg(String expectedText) {
		return wrapper.verifyText(errLogin, expectedText);
	
	}
	
	public void ValidLogin() throws InterruptedException, IOException, ParseException {
	fillEmail(wrapper.getTestData("Login.ValidEmail"));	
		fillPwd (wrapper.getTestData("Login.ValidPassword"));
		clkNextBtn();
		fillVerificationCode(wrapper.getTestData("Login.ValidCode"));
		
	}
	public void InvalidLogin( ) throws InterruptedException, IOException, ParseException {
		fillEmail(wrapper.getTestData("Login.InvalidEmail"));	
		fillPwd (wrapper.getTestData("Login.InvalidPassword"));
		clkNextBtn();
		
	}

}
