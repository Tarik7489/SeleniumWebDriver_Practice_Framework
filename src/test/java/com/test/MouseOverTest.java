package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseOverTest {
	
	WebDriver driver;
	
	MouseOverPage mouse;
	
	
	@BeforeTest
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		 mouse = new MouseOverPage(driver);
		
	}
	
	@Test
	
	public void mouseOver() {
		mouse.mouseOverToElement();
		
	}
	
	@AfterTest
	
	public void closeBrowser() {
		driver.quit();
	}
	

}
