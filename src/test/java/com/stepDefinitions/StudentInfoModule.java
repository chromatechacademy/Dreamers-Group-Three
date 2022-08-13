package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInfoModule {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("A user is logged into the ctsms website")
    public void a_user_is_logged_into_the_ctsms_website() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        loginPage.signInButton.click();
    }

    @When("A user clicks on Student Information")
    public void a_user_clicks_on_Student_Information() throws IOException {

        CommonUtils.waitForVisibility(homePage.studentInfoModule);
        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("{string} Module displays the following modules:")
    public void module_displays_the_following_modules(String studentInformation, String studentInfoList) {

        Assert.assertTrue(homePage.studentInfoModule.getText().contentEquals(studentInformation));

        Assert.assertEquals(studentInfoList, homePage.studentInfoList.getText());
    }

}
