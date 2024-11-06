package com.automation.utils;

import com.automation.pojo.CreateRequestPojo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static void initConfig() {
        try {
            prop = new Properties();
            prop.load(new FileReader("src/test/resources/config/config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    public static void setProperty(String key, String value) {
        prop.setProperty(key, value);
    }

    public static Object getObject(String key) {
        return prop.get(key);
    }

    public static void setObject(String key, Object value) {
        prop.put(key, value);
    }

    public static void main(String[] args) throws Exception {
        ConfigReader.initConfig();
        String content = RestAssuredUtils.getDataFromJsonFile("create_booking.json");
        ObjectMapper objectMapper = new ObjectMapper();
        CreateRequestPojo requestPojo = objectMapper.readValue(content, CreateRequestPojo.class);
        ConfigReader.setObject("requestPojo", requestPojo);

        CreateRequestPojo pojo = (CreateRequestPojo) ConfigReader.getObject("requestPojo");
        System.out.println(pojo.toString());
    }


}
