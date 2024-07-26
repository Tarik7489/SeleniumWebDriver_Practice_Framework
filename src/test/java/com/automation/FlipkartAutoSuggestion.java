package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("iphone");
		
		
		//To get the all the auto suggestion using text
		
		String as = "//span[contains(text(),'iphone')]";
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath(as));
		
		//To get the count of all the auto suggestion
		
		int count =autoSuggestions.size();
		
		System.out.println(count);
		
		//To print the all auto suggestion
		
		for(int i=0; i<count;i++) {
			WebElement suggestion = autoSuggestions.get(i);
			String text = suggestion.getText();
			System.out.println(text);
		}

		
		int index=0;
		if(index<count) {
			autoSuggestions.get(index).click();
		}
		else {
			System.out.println("Index out of bounch");
		}
	}

}
