package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://qa.mychargesavvy.com/auth/login");
		
		
		
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("Pavan");
		driver.findElement(By.xpath("//input[@name=\"passWord\"]")).sendKeys("Test@123");
		
	String s=	driver.findElement(By.xpath("//input[@name=\"userName\"]")).getAttribute("value");
	
	String s1=	driver.findElement(By.xpath("//input[@name=\"passWord\"]")).getAttribute("value");
	
	System.out.println(s);
	System.out.println(s1);
	
	driver.quit();
	}

}
