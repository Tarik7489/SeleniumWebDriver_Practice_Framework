package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	
	driver.get("https://qa.mychargesavvy.com/auth/login");
	
	String text = driver.findElement(By.xpath("(//*[.='Remember me'])[1]")).getText();
	
	System.out.println("Text is:"+text);
	
	driver.quit();

	}

}
