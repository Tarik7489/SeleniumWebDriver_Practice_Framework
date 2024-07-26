package com.automation;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAll {

    public static void main(String[] args) throws IOException {
        // Set up the ChromeDriver system property
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the target web page
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Locate the table element
        WebElement table = driver.findElement(By.id("product"));
        
        // Get all the rows from the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        // Iterate over each row
        for (WebElement row : rows) {
            // Get all the cells from the current row
            List<WebElement> cells = row.findElements(By.tagName("td"));
            
            // Iterate over each cell and get the text
            for (WebElement cell : cells) {
                String cellText = cell.getText();
                System.out.print(cellText + " | "); // Use print instead of println to keep cells on the same line
            }
            
            System.out.println(); // Print a newline after each row
        }
        
        // Close the browser
        driver.quit();
    }
}
