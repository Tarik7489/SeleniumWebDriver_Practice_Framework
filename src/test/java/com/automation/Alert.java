package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;
	
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	
	public void simpleAlert() {
		
		driver.findElement(By.id("alertbtn")).click();
		
		
	org.openqa.selenium.Alert simpleAlert=	driver.switchTo().alert();
	
	//Print the text 
	
	String text = simpleAlert.getText();
	
	System.out.println(text);
	simpleAlert.accept();
		
	}
	
	@Test
	public void confirmAlert() {
		driver.findElement(By.id("confirmbtn")).click();
		
	org.openqa.selenium.Alert confirmAlert =driver.switchTo().alert();
		
		//To print the text
		
		String headerText= confirmAlert.getText();
		
		System.out.println(headerText);
		
		confirmAlert.dismiss();
		
	}
	

}