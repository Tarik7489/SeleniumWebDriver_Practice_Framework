package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class MouseOverPage extends SeleniumWrapper {
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	
	public MouseOverPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		this.wrapper=new SeleniumWrapper(driver);
	}
	
	By getElement=By.xpath("//button[@id=\"mousehover\"]");
	
	
	public void mouseOverToElement() {
		wrapper.hoverOverElement(getElement);
		
	}

}
