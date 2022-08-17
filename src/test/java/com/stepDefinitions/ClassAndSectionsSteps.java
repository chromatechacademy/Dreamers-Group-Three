package com.stepDefinitions;

import java.io.IOException;

import com.constants.ApplicationConstants;
import com.pages.AcademicsClassPage;
import com.pages.AcademicsSectionPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClassAndSectionsSteps {

    // CREATING OBJECTS OF PAGE CLASSES TO ACCESS ELEMENTS
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AcademicsClassPage academicsClassPage = new AcademicsClassPage();
    AcademicsSectionPage academicsSectionPage = new AcademicsSectionPage();

    @Given("user is one the CTSMS login page")
    public void user_is_one_the_CTSMS_login_page() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        // ATTACHING SCREENSHOT TO EXTENT REPORT
        CucumberLogUtils.logExtentScreenshot();
        // ATTACHING SCREENSHOT TO CUCUMBER HTML REPORT
        CucumberLogUtils.logScreenShot();

    }

    @When("user logs with username {string} and password {string}")
    public void user_logs_with_username_and_password(String username, String password) {

        // USING BELOW INSTEAD OF THREAD.SLEEP - waiting for usernamtextbox to fully
        // display
        CommonUtils.waitForVisibility(loginPage.usernameTextBox);

        // LOGGING IN
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();
    }

    @When("navigates to Academics module")
    public void navigates_to_Academics_module() throws IOException {

        // WAITING FOR VISIBILITY OF ACADEMICS MODULE LINK
        CommonUtils.waitForVisibility(homePage.academicsModuleLink);

        homePage.academicsModuleLink.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("navigates to Class module")
    public void navigates_to_Class_module() throws IOException {

        // WAITING FOR VISIBILITY OF CLASS MODULE LINK
        CommonUtils.waitForVisibility(homePage.classModuleLink);

        // CLICKING ON CLASS MODULE LINK
        homePage.classModuleLink.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("Class {string} displays with class sections")
    public void class_displays_with_class_sections(String cyberSecurity, String securitySections) {

        Assert.assertTrue(academicsClassPage.cyberSecurityClassText.getText().contentEquals(cyberSecurity));

        // ASSERTING PARAGRAPH
        Assert.assertTrue(academicsClassPage.cyberSecuritySectionsText.getText().contentEquals(securitySections));

    }

    @Then("Class {string} displays with the following class sections")
    public void class_displays_with_the_following_class_sections(String sdetClassText, String sdetClassSectionsText)
            throws IOException {

        // ASSERTING SDET CLASS TEXT
        Assert.assertTrue(academicsClassPage.sdetClassText.getText().contentEquals(sdetClassText));

        Assert.assertEquals(sdetClassSectionsText, academicsClassPage.sdetClassSectionsText.getText());
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("navigates to sections module")
    public void navigates_to_sections_module() throws IOException {

        CommonUtils.waitForVisibility(academicsSectionPage.sectionsLink);
        academicsSectionPage.sectionsLink.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("adds section {string}")
    public void adds_section(String sectionName) throws InterruptedException, IOException {

        academicsSectionPage.sectionsTextBox.sendKeys(sectionName);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        academicsSectionPage.sectionsSaveButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("deletes sections {string}")
    public void deletes_sections(String sectionName) throws InterruptedException, IOException {

        Thread.sleep(2000);
        CommonUtils.waitForVisibility(academicsSectionPage.classSectionsDynamicXPATH(sectionName));
        academicsSectionPage.classSectionsDynamicXPATH(sectionName).click();
        CommonUtils.acceptAlert();
       CucumberLogUtils.logScreenShot();
       CucumberLogUtils.logExtentScreenshot();
        Thread.sleep(3000);
      
    }

}
