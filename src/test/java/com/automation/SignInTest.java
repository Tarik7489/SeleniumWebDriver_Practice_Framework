package com.automation;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.SeleniumWrapper;

public class SignInTest {
	
	WebDriver driver;
	SeleniumWrapper wrapper;
	SignIn signin;
	
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();
		wrapper = new SeleniumWrapper(driver);
		signin = new SignIn(driver);
		
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void loginWithValidCredentials() throws IOException, ParseException {
		
		signin.login();
	}

}
