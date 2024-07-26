package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class LogoutPage extends SeleniumWrapper{
	
	private WebDriver driver;
	private SeleniumWrapper wrapper;
	
	public LogoutPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		this.wrapper= new SeleniumWrapper(driver);
	}

	
	private By getPfofileDropdown = By.xpath("(//span[.='Pavan'])[1]");
	
	
	
	private By getLogoutBtn = By.xpath("//*[.='Logout']");
	
	private By getLoginText = By.xpath("//h1[text()=\"Login\"]");
	
	
	
	public void clickOnProfileDropDown() {
		wrapper.clickElement(getPfofileDropdown);
	}
	public void clickOnLogoutBtn() {
		wrapper.clickElement(getLogoutBtn);
	}
	
	public boolean verifyLoginText(String expectedText) {
		return wrapper.verifyText(getLoginText, expectedText);
	}
	
	
	
	public void LOGOUT() throws IOException, ParseException, InterruptedException {
		clickOnProfileDropDown();
		clickOnLogoutBtn();
		
	}
}
