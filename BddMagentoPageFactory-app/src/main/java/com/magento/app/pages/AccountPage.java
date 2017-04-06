package com.magento.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Danny on 29/03/2017.
 */
public class AccountPage extends BasePage {

    @FindBy (how = How.ID,using = "email")
    private WebElement emailElement;
    @FindBy (how = How.ID,using = "pass")
    private  WebElement passElement;
    @FindBy (how = How.ID,using = "send2")
    private  WebElement send2Element;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public WelcomePage loginwith(String username, String password) {
        emailElement.sendKeys(username);
        passElement.sendKeys(password);
        send2Element.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return PageFactory.initElements(driver,WelcomePage.class);
    }
}
