package com.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StateElementReferenceException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		
//We can handle state element exception using Explicit wait 
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement element = wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.name("Tarik"))));
	
	element.click();

	
	
	//we can also handle try and catch block
	
	WebElement btn = driver.findElement(By.name("Name"));
	
	try {
		btn.click();
	}
	catch(StateElementReferenceException e){
	btn=	driver.findElement(By.name("Name")); //relocate the element
	btn.click();
		
		
		
	}
	
	
	
	}

}
