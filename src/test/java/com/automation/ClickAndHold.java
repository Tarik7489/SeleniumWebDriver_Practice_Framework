package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	WebElement source=	driver.findElement(By.xpath("//*[.=' BANK ']"));
	
	WebElement des=  driver.findElement(By.xpath("//li[@class=\"placeholder\"]"));
	
	Actions a= new Actions(driver);
	
	a.clickAndHold(source).moveToElement(des).release(des).perform();

	}

}
