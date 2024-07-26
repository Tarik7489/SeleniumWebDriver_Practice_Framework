package com.automation;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SignInTest {
	

		 
		 
		 public String getJsonData(String filePath, String jsonPath) {
			 
			 File file = new File(filePath);
			 ObjectMapper objectMapper = new OnjectMapper();
			 com.fasterxml.jackson.databind.JsonNode jsonNode = objectMapper.readTree(file);
			 
			 
			 String [] pathSegment = jsonPath.split("\\.");
			 
			 for(String segment : pathSegment) {
				 
				 jsonNode = jsonNode.get(segment);
				 
				 if(jsonNode ==null) {
					 return null;
					 
				 }
			 }
			 return jsonNode.textValue();
			 
		 }
		 
		 public String getTestData(String jsonPath) {
			 String path = System.getProperty("user.dir")+"\\src\\main\\java\\data\\testData.json";
			 String result = getJsonData(path, jsonPath);
			 System.out.println(result);
			 
			 return result;
		 }
	 }