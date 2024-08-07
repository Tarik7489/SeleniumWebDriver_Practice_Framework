package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledAndisDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://qa.mychargesavvy.com/auth/login");
		
	boolean userNameField =	driver.findElement(By.xpath("//input[@name=\"userName\"]")).isEnabled();
	
	if(userNameField ==true) {
		System.out.println("Username field is enabled");
	}
	else {
		System.out.println("Username field is disabled");
	}
	
	boolean headerText =	driver.findElement(By.xpath("(//*[.='Login'])[1]")).isDisplayed();
	
	if(headerText ==true) {
		System.out.println("Header text is login");
	}
	else {
		System.out.println("Header text is not login");
	}
	
	driver.quit();
	}
	
	

}
