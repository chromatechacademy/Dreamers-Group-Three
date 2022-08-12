package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginScenariosSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the CTSMS login page")
    public void user_is_on_the_CTSMS_login_page() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) throws IOException {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot(); 
        loginPage.signInButton.click();

    }

    @Then("user should be succesfully logged in to {string}")
    public void user_should_be_succesfully_logged_in_to(String expectedResult) throws IOException {

        String actualResult = WebDriverUtils.driver.getTitle();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contentEquals(expectedResult));
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        


    }
}
