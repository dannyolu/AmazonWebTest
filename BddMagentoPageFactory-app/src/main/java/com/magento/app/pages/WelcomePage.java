package com.magento.app.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Danny on 30/03/2017.
 */
public class WelcomePage extends BasePage {

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public boolean validatelastName(String lastName) {
        return driver.getPageSource().toLowerCase().contains(lastName.toLowerCase());

    }
}
