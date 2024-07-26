package Analyser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {
	
	private WebDriver driver;
	
	
	public TestPage(WebDriver driver) {
		super();
		this.driver=driver;
	}
	
	
	public void enterUserName(String username) {
		driver.findElement(By.name("userName")).sendKeys("Pavan");
	}
	
	
	public void enterPassword(String pwd) {
		driver.findElement(By.name("passWord")).sendKeys("Pavan");
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	
	public void login(String username, String pwd ) {
		enterUserName(username);
		enterPassword(pwd);
		clickOnLoginBtn();
	}
	

}
