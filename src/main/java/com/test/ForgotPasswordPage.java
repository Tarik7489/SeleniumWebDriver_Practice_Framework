package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrapper;

public class ForgotPasswordPage extends SeleniumWrapper {
	
	private WebDriver driver;
	private SeleniumWrapper wrapper;
	
	public ForgotPasswordPage(WebDriver driver) {
	    super(driver);
	    this.driver = driver;
	    this.wrapper = new SeleniumWrapper(driver);
	}
	
	By getForgotPwdBtn=By.xpath("//button[text()=\"Forgot Password?\"]");
	
	By getNewPwdField=By.xpath("//input[@name=\"enter_password\"]");
	
	By getConfirmPwdField=By.xpath("//input[@name=\"confirm_password\"]");
	
	By getSubmitBtn=By.xpath("//button[@type=\"submit\"]");
	
	By getPwdChangeMsg=By.xpath("//span[text()=\"Password Changed\"]");
	
	
	public void  clkForgotPwdLink() {
//		driver.findElement(getForgotPwdBtn).click();
		wrapper.clickElement(getForgotPwdBtn);
		
	}
	
	public void fillNewPwd(String newPwd) {
//		driver.findElement(getNewPwdField).sendKeys(newPwd);
		wrapper.typeText(getNewPwdField, newPwd);
	}
	public void fillConfirmPwd(String confirmPwd) {
//		driver.findElement(getNewPwdField).sendKeys(confirmPwd);
		wrapper.typeText(getConfirmPwdField, confirmPwd);
	}
	
	public void  clkSubmitBtn() {
//		driver.findElement(getSubmitBtn).click();
		wrapper.clickElement(getSubmitBtn);
	}
	
	
	
	
	//upload file
	 private By fileUploadInput = By.id("your_file_input_id");
	 public void uploadFile(String filePath) {
	        wrapper.uploadFile(fileUploadInput, filePath);
	    }
	
	
	
	//scroll by
//	 private By specificElementId = By.id("specificElementId");
//
//	    public void scrollToSpecificElement() {
//	        wrapper.scrollToElement(driver.findElement(specificElementId));
//	    }
    }

	
	
