package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.greenstechnologys.com/");

		WebElement mouse = driver.findElement(By.linkText("COURSES"));

		Actions a = new Actions(driver);

		a.moveToElement(mouse).perform();

		Thread.sleep(3000);

		WebElement e = driver.findElement(By.linkText("RCM Training"));

		a.click(e).perform();

		driver.getCurrentUrl();

	}

}
