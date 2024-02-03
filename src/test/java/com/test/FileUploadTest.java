package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadTest {
	
	WebDriver driver;
	
	FileUploadPage file;
	
	
	@BeforeTest
	
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://uploadnow.io/");
		driver.manage().window().maximize();
		
		file = new FileUploadPage(driver);
	}
	
	
	@Test
	
	public void verifyUploadFile() {
		
		String filePath = "D:\\eclips\\xcelerator\\Resources\\Noums.png";
		file.uploadingFile(filePath);
		file.confirmUploadFile();
	}

	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
