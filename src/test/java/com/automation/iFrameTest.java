package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrameTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	
	@Test
	
	public void testingIframe() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
	WebElement iframeElement =	driver.findElement(By.id("courses-iframe"));
	
	driver.switchTo().frame(iframeElement);
	
	
	
	
	WebElement mouse = driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a/text()"));
	
	WebElement about = driver.findElement(By.linkText("About us"));
	
	Actions a = new Actions(driver);
	
	a.moveToElement(mouse).perform();
	a.click(about).perform();
	
	//Perform anything inside frame now
	
//	WebElement insideFrame = driver.findElement(By.linkText("JOIN NOW"));
//	
//	
//		insideFrame.click();
//		
	driver.switchTo().defaultContent();
	}

}
