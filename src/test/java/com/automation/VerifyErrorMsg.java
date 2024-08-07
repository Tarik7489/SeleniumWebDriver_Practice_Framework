
package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://qa.mychargesavvy.com/auth/login");
		
		driver.findElement(By.name("userName")).sendKeys("");
		
		driver.findElement(By.name("passWord")).sendKeys("Test");
		
		driver.findElement(By.xpath("(//*[.='Login'])[6]")).click();
		
	boolean text=	driver.findElement(By.xpath("//*[.='Username is required']")).isDisplayed();
	
	if(text==true) {
		
		System.out.println("Error msg is displayed");
	}
	else {
		System.out.println("Err msg is not displayed");
	}
	
	driver.quit();
	}


}
