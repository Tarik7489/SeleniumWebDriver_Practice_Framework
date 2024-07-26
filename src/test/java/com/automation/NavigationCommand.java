package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		String googleTitle=driver.getTitle();
		System.out.println("Google Title:"+googleTitle);
		
		driver.navigate().to("https://www.facebook.com/");
		String fbTitle=driver.getTitle();
		System.out.println("FB Title:"+fbTitle);
		
		
		driver.navigate().back();
		String GTitle=driver.getTitle();
		System.out.println("Google Title:"+GTitle);
		
		driver.navigate().forward();
		String FTitle=driver.getTitle();
		System.out.println("FB Title:"+FTitle);
		
		driver.navigate().refresh();
		driver.quit();
		
	}

}
