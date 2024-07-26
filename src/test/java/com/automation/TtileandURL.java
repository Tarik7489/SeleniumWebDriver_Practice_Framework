package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TtileandURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	String title=	driver.getTitle();
	System.out.println("Title:"+title);
	
	String url = driver.getCurrentUrl();
	System.out.println("URL:"+url );
		
		driver.quit();

	}

}
