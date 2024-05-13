package com.chargeSavvy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class CreateMerchantPage extends SeleniumWrapper{
	
	private WebDriver driver;
	private SeleniumWrapper wrapper;
	
	public CreateMerchantPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		this.wrapper = new SeleniumWrapper(driver);
	}

	
	
	private By getCreateBtn = By.xpath("//span[text()=\"Create\"]");
	
	private By getCancelBtn = By.xpath("//*[@id=\"__next\"]/div/div/main/div/form/div[8]/div/div/div[1]/div/button/span[1]/text()");
	
	
	public void clickOnCreateMerchantBtn() {
		wrapper.clickElement(getCreateBtn);
	}
	public void clickOnCancelBtn() {
		wrapper.clickElement(getCancelBtn);
	}
}
