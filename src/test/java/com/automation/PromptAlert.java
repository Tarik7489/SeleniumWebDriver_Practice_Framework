package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PromptAlert {

	WebDriver driver;

	@BeforeMethod

	public void setup() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://javascript.info/alert-prompt-confirm");
	}

	@Test
	public void promptAlertAccept() {
		
		driver.findElement(By.xpath("(//a[@title=\"run\"])[2]")).click();
		
		
	org.openqa.selenium.Alert promptAlert=	driver.switchTo().alert();
	
	promptAlert.sendKeys("26");
	
	//Print the text
	
	promptAlert.accept();
	
	String text = promptAlert.getText();
	
	System.out.println(text);

	}

}