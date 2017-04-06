package com.magento.app.infrastructure.fileReader;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Danny on 29/03/2017.
 */
public class ConfigReader {

    public static String getValue(String keyName) throws Exception{

        String sysPath = System.getProperty("user.dir");
        String configPath = "\\src\\main\\resources\\test_report\\objectRepo.properties";
        Properties config = new Properties();
        FileInputStream fileInputStream = new FileInputStream(sysPath + configPath);
        config.load(fileInputStream);
        return config.getProperty(keyName);
    }
}
