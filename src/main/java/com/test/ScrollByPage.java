package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class ScrollByPage extends SeleniumWrapper {
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	
	
	public ScrollByPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper=new SeleniumWrapper(driver);
	}
	
	
	By getElement=By.xpath("//button[@id=\"mousehover\"]");
	
	
	public void scrollToElement() {
		wrapper.scrollToElement(getElement);
	}

}
