package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class TextVerifyPage extends SeleniumWrapper {

	
	WebDriver driver;
	SeleniumWrapper wrapper;
	
	
	public TextVerifyPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper=new SeleniumWrapper(driver);
	}
	
	
	By getHeaderText= By.xpath("//h3[text()=\"Demo Automation Practice Form\"]");
	
	
	
	public boolean verifyTheHeaderText(String expectedText) {
		return wrapper.verifyText(getHeaderText, expectedText);
	}
}
