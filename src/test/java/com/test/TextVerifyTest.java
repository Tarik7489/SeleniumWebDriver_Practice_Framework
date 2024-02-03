package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextVerifyTest {
 WebDriver driver;
 TextVerifyPage text;
 
 
 
 	@BeforeTest
 	public void setup() {
 		
 		driver = new ChromeDriver();
 		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
 		driver.manage().window().maximize();
 		
 		text = new TextVerifyPage(driver);
 	}
 	
 	@Test
 	public void verifyTheLoginHeaderText() {
 		
 		Assert.assertTrue(text.verifyTheHeaderText("Demo Automation Practice Form"), "Text does not match!");
 	}
}
