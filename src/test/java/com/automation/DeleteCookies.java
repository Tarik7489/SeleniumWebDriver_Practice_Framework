package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
		driver.quit();
	}

}
