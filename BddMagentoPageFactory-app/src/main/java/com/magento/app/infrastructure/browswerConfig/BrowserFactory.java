package com.magento.app.infrastructure.browswerConfig;

import com.magento.app.infrastructure.fileReader.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Danny on 29/03/2017.
 */
public class BrowserFactory {

    private WebDriver driver;

    public void initialiseBrowser(String browserName) throws Exception {

        String systemPath = System.getProperty("user.dir");
        if(browserName.equalsIgnoreCase("chrome")){
            String chromePath = systemPath + "\\drivers\\windows\\chrome\\chromedriver_win32\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
           String firefoxPath = systemPath + "\\drivers\\windows\\firefox\\geckodriver-v0.15.0-win64\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", firefoxPath);
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
       long defaultTime = Long.parseLong(ConfigReader.getValue("default.time"));
    }

    public void tearDownBrowser(){
        driver.quit();
    }



}
