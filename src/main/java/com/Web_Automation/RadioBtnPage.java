package com.Web_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioBtnPage {
	
private	WebDriver driver;
	
	
	public RadioBtnPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	private By getFirstRadioBtn = By.xpath("//input[@value=\"radio1\"]");
	
	private By getSecondRadioBtn = By.xpath("//input[@value=\"radio2\"]");
	
	private By getThirdRadioBtn = By.xpath("//input[@value=\"radio3\"]");
	
	
	
	public void clickFirstRadioBtn() {
		driver.findElement(getFirstRadioBtn).click();
	}
	
	public void clickSecondRadioBtn() {
		driver.findElement(getSecondRadioBtn).click();
	}
	
	public void clickThirdRadioBtn() {
		driver.findElement(getThirdRadioBtn).click();
	}

}