package com.stepDefinitions;

import java.io.IOException;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;

public class SampleTest {

    LoginPage loginPage = new LoginPage();

    @Given("this step can be used to specify a pre-condition")
    public void this_step_can_be_used_to_specify_a_pre_condition() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys("keysToSend");
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
