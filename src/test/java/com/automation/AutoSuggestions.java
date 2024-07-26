package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		//Get the all auto suggestion using the text
		
		String au = "//span[contains(text(),'selenium')]";
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath(au));
		
		//To get the count of all the auto suggestion
		
		int count = autoSuggestions.size();
		
		System.out.println(count);
		
		//To print the all the auto suggestion
		
		for(int i=0; i<count;i++) {
			WebElement suggestion = autoSuggestions.get(i);
			
			String text = suggestion.getText();
			
			System.out.println(text);
		}
		
		//To click on the last auto suggestion
		
//		autoSuggestions.get(count-1).click();
		
		int index=1;
		
		if(index<count) {
			autoSuggestions.get(index).click();
		}
		else {
			System.out.println("Index out of bounch");
		}

	}

}
