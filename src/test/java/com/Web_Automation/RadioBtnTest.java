package com.Web_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioBtnTest {
	
	WebDriver driver;
	
	RadioBtnPage radio;
	
   
	
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new ChromeDriver();
		
		radio = new RadioBtnPage(driver);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void verifyRadioBtnIsSelected() {
		
		radio.clickFirstRadioBtn();
		boolean first = driver.findElement(By.xpath("//input[@value=\"radio1\"]")).isSelected();
		
		if(first ==true) {
			System.out.println("First radio button is selected");
		}
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
