package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://filebin.net/");
		
	WebElement fileUplaod=	driver.findElement(By.id("fileField"));
	
		fileUplaod.sendKeys("D:\\facebook.png");
		
		Thread.sleep(3000);

	}

}
