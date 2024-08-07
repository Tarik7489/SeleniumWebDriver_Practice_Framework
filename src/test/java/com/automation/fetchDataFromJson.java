package com.automation;

import java.io.File;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.qameta.allure.internal.shadowed.jackson.databind.JsonNode;

public class fetchDataFromJson {

	
	public String getJsonData(String filePath, String jsonPath) throws IOException, ParseException {
        File file = new File(filePath);
        ObjectMapper objectMapper = new ObjectMapper();
        com.fasterxml.jackson.databind.JsonNode jsonNode = objectMapper.readTree(file);

        String[] pathSegments = jsonPath.split("\\.");
        for (String segment : pathSegments) {
            jsonNode = jsonNode.get(segment);
            if (jsonNode == null) {
                return null; // Handle the case where the path is invalid
            }
        }

        return jsonNode.textValue();
    }

    public String getTestData(String jsonPath) throws IOException, ParseException {
        String path = System.getProperty("user.dir") + "\\src\\test\\java\\data\\testData.json";
        String result = getJsonData(path, jsonPath);
        System.out.println(result);

        return result;

    }
	
}































