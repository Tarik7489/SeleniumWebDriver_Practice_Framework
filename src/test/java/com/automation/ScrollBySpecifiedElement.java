package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBySpecifiedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
	WebElement element =	driver.findElement(By.xpath("//*[.='MVNRepository']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",element);

	}

}
