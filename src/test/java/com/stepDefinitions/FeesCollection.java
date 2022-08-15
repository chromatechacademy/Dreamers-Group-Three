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

public class FeesCollection {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is logged in on the CTSMS login page")
    public void user_is_logged_in_on_the_CTSMS_login_page() throws IOException {
         WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        loginPage.signInButton.click();
    }

    @When("A user clicks on Fees Collection")
    public void a_user_clicks_on_Fees_Collection() throws IOException {

        CommonUtils.waitForVisibility(homePage.feesCollectionLink);
        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Fees Collection']")).click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("{string} displays the following modules")
public void displays_the_following_modules(String feesCollection, String feesCollectionList) {
    
    Assert.assertTrue(homePage.feesCollectionLink.getText().contentEquals(feesCollection));

        Assert.assertEquals(feesCollectionList, homePage.feesCollectionList.getText());
}

}
