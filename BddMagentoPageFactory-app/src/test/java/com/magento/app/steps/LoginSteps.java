package com.magento.app.steps;

import com.magento.app.infrastructure.browswerConfig.BrowserFactory;
import com.magento.app.infrastructure.fileReader.ConfigReader;
import com.magento.app.pages.AccountPage;
import com.magento.app.pages.BasePage;
import com.magento.app.pages.WelcomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


/**
 * Created by Danny on 29/03/2017.
 */
public class LoginSteps {


    private BrowserFactory browserFactory;
    private WebDriver driver;
    protected AccountPage accountPage;
    private WelcomePage welcomePage;

    @Before
    public void testSetUp() throws Exception {
        String browserName = ConfigReader.getValue("magento.browser");
        this.browserFactory = new BrowserFactory();
        this.browserFactory.initialiseBrowser(browserName);
    }

    @After
    public void testCleanUp(){
        browserFactory.tearDownBrowser();
    }

    @Given("^I am in the login page$")
    public void iAmInTheLoginPage() throws Throwable {
        BasePage basePage = new BasePage(driver);
        accountPage = basePage.goToAccountPage();

    }

    @When("^login successfully$")
    public void loginSuccessfully() throws Throwable {
     String username = "dannyolu@yahoo.com";
        String password = "high123";
       welcomePage = accountPage.loginwith(username,password);

    }

    @Then("^I should see my credential$")
    public void iShouldSeeMyCredential() throws Throwable {
       String lastName = "tony";
        boolean result = welcomePage.validatelastName(lastName);
        Assert.assertTrue(result);
    }
}
