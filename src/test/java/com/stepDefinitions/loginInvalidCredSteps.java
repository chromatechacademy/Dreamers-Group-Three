package com.stepDefinitions;

import java.io.IOException;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dev.failsafe.internal.util.Assert;

public class loginInvalidCredSteps {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the CTSMS login page")
    public void the_user_is_on_the_CTSMS_login_page() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("user logs in with invalid username {string} and password {string}")
    public void user_logs_in_with_invalid_username_and_password(String username, String password) throws IOException {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        loginPage.signInButton.click();

    }

    @Then("user should not be able to be logged in to {string}")
    public void user_should_not_be_able_to_be_logged_in_to(String expectedResult) throws IOException {

        String actualResult = WebDriverUtils.driver.getTitle();
        System.out.println(actualResult);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
