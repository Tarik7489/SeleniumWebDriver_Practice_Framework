package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
		List<WebElement> e = driver.findElements(By.tagName("a"));
		
		for(WebElement e1: e) {
			System.out.println(e1.getAttribute("href"));
		}
		

		driver.quit();
	}

}
