package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://qa.mychargesavvy.com/");
	}
	
	@Test
	public void verifyTheText() {
		
		boolean loginText = driver.findElement(By.xpath("(//*[.='Login'])[1]")).isDisplayed();
		
		if(loginText==true) {
			System.out.println("Login text is visible");
		}
		else {
			System.out.println("Text doesn't appear");
		}
	}

}
