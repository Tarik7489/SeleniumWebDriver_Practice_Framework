package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollByTest {
	
	WebDriver driver;
	
	ScrollByPage scroll;
	

	
	
	@BeforeTest
	
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		scroll = new ScrollByPage(driver);
	}
	
	@Test
	
	public void verifyScrollByMethod() throws InterruptedException {
		
		scroll.scrollToElement();
	}
	
	@AfterTest
	
	public void closeBrowser() {
		driver.quit();
	}

}


