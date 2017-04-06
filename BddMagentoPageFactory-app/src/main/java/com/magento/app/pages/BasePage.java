package com.magento.app.pages;

import com.magento.app.infrastructure.fileReader.ConfigReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Danny on 29/03/2017.
 */
public class BasePage {



    protected WebDriver driver;
    @FindBy (how = How.ID, using = "header")
    private WebElement headerElement = null;
    @FindBy (how = How.ID, using = "header-account")
    private WebElement headerAccountElement = null;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage prepareBrowser() throws Exception {

        String baseUrl = ConfigReader.getValue("magento.base.url");
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
        return PageFactory.initElements(driver, BasePage.class);
    }

    public HomePage goToHomePage() throws Exception {
        prepareBrowser();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public AccountPage goToAccountPage() {

        List<WebElement> aTags = headerElement.findElements(By.tagName("span"));
        for (WebElement aTag : aTags) {
            if (aTag.getText().toLowerCase().contains("Account".toLowerCase())) {
                aTag.click();
                break;
            }
        }
        driver.switchTo().activeElement();
        List<WebElement> logTags = headerAccountElement.findElements(By.tagName("a"));
        for (WebElement logTag : logTags) {
            if (logTag.getText().equalsIgnoreCase("Log In")) {
                logTag.click();
                break;
            }
        }
        return PageFactory.initElements(driver,AccountPage.class);
    }
    }




