package com.chargeSavvy;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class SearchPage extends SeleniumWrapper{
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	
	public SearchPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		this.wrapper = new SeleniumWrapper(driver);
	}
	
	
	
	private By getSeachTextField = By.xpath("//input[@type=\"text\"]");
	
	private By getNotFoundMsg = By.xpath("(//*[.='Data Not Found'])[1]");
	
	
	
	
	public void enterSearchName(String merchant) {
		wrapper.typeText(getSeachTextField, merchant);
	}
	
		
	public boolean verifyNotFoundMsg(String expectedText) {
		return wrapper.verifyText(getNotFoundMsg, expectedText);
	}
		
	
	
	public void searchMerchantNotFOund() throws IOException, ParseException {
		enterSearchName(wrapper.getTestData("search.name"));
	}
		
	}

