package com.example.refactor.service;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.nio.charset.StandardCharsets;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExampleFileUtils {

    private ExampleFileUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static JSONObject getJsonFromFile(InputStream inputSource) {
        JSONParser parser = new JSONParser();
        try {
            return (JSONObject) parser.parse(new InputStreamReader(inputSource, StandardCharsets.UTF_8));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public static InputStream getFileFromResources(String fileName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        if (inputStream != null) {
            return inputStream;
        } else {
            throw new IllegalArgumentException("Missing file");
        }
    }

}
