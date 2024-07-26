package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
		WebElement w =driver.findElement(By.name("coffee"));
		
		Select s = new Select(w);
		
		s.selectByIndex(0);
		s.selectByValue("regular");
		s.selectByVisibleText("With sugar");
		
		s.deselectByVisibleText("With sugar");
	
	}

}
