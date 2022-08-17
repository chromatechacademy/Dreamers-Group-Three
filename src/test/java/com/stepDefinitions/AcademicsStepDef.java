package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.pages.Academics;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcademicsStepDef {

    LoginPage loginPage = new LoginPage();
    Academics academics = new Academics();
    
    

    @Given("a teacher is on the CTSMS login webpage")
    public void a_teacher_is_on_the_CTSMS_login_webpage() throws IOException {
        WebDriverUtils.driver.get("https://chroma.mexil.it/site/login");

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

   


    @When("the teacher logs in with username {string} and password {string} and by expanding the Academics tab")
    public void the_teacher_logs_in_with_username_and_password_and_by_expanding_the_Academics_tab(String username,
            String password) throws IOException {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

        // Expanding the Accademics Page

        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Academics']")).click();

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @Then("the teacher should see the modules described in Description {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_teacher_should_see_the_modules_described_in_Description(String classTimetable,
            String teachersTimetable, String assignClassTeacher, String promoteStudents, String subjectGroup,
            String Subjects, String Class, String Sections) throws InterruptedException, IOException {

        String actualResult1 = academics.classTimetableTab.getText();
        Assert.assertTrue(actualResult1.contentEquals(classTimetable));

        CommonUtils.waitForVisibility(academics.teachersTimetableTab);

        String actualResult2 = academics.teachersTimetableTab.getText();
        Assert.assertTrue(actualResult2.contentEquals(teachersTimetable));

        CommonUtils.waitForVisibility(academics.assignClassTeacherTab);

        String actualResult3 = academics.assignClassTeacherTab.getText();
        Assert.assertTrue(actualResult3.contentEquals(assignClassTeacher));

        CommonUtils.waitForVisibility(academics.promoteStudentsTab);

        String actualResult4 = academics.promoteStudentsTab.getText();
        Assert.assertTrue(actualResult4.contentEquals(promoteStudents));

        CommonUtils.waitForVisibility(academics.subjectGroupTab);

        String actualResult5 = academics.subjectGroupTab.getText();
        Assert.assertTrue(actualResult5.contentEquals(subjectGroup));

        CommonUtils.waitForVisibility(academics.SubjectsTab);

        String actualResult6 = academics.SubjectsTab.getText();
        Assert.assertTrue(actualResult6.contentEquals(Subjects));

        CommonUtils.waitForVisibility(academics.ClassTab);

        String actualResult7 = academics.ClassTab.getText();
        Assert.assertTrue(actualResult7.contentEquals(Class));

        CommonUtils.waitForVisibility(academics.SectionsTab);

        String actualResult8 = academics.SectionsTab.getText();
        Assert.assertTrue(actualResult8.contentEquals(Sections));

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}

