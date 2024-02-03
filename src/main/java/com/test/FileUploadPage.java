package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrapper;

public class FileUploadPage extends SeleniumWrapper {
	
	WebDriver driver;
	
	SeleniumWrapper wrapper;
	
	public FileUploadPage(WebDriver driver) {
	    super(driver);
	    this.driver = driver;
	    this.wrapper = new SeleniumWrapper(driver);
	}
	
	By getFileUpload = By.xpath("//input[@type=\"file\"]");
	By confirmBtn = By.xpath("//button[text()=\"Validate and upload\"]");
	
	
	public void uploadingFile(String filePath) {
		wrapper.uploadFile(getFileUpload, filePath);
	}
	
	public void confirmUploadFile() {
		wrapper.clickElement(confirmBtn);
	}

}
