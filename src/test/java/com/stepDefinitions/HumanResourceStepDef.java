package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.pages.HumanResource;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HumanResourceStepDef {

    LoginPage loginPage = new LoginPage();
    HumanResource humanResource = new HumanResource();

    @Given("the teacher is on the CTSMS login webpage")
    public void the_teacher_is_on_the_CTSMS_login_webpage() throws IOException {

        WebDriverUtils.driver.get("https://chroma.mexil.it/site/login");

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("the teacher logs in with username {string} and password {string} and by expanding the Human Resource tab")
    public void the_teacher_logs_in_with_username_and_password_and_by_expanding_the_Human_Resource_tab(String username,
            String password) throws IOException {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

        // Expanding the Human Resource Tab

        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Human Resource']")).click();

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("the teacher should see the modules described under Description {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_teacher_should_see_the_modules_described_under_Description(String staffDirectory,
            String staffAttendance, String payroll, String approveLeaveRequest, String applyLeave, String leaveType,
            String teacherRating, String department, String designation) throws IOException {

        String actualResult1 = humanResource.staffDirectoryTab.getText();
        Assert.assertTrue(actualResult1.contentEquals(staffDirectory));

        CommonUtils.waitForVisibility(humanResource.staffAttendanceTab);

        String actualResult2 = humanResource.staffAttendanceTab.getText();
        Assert.assertTrue(actualResult2.contentEquals(staffAttendance));

        CommonUtils.waitForVisibility(humanResource.payrollTab);

        String actualResult3 = humanResource.payrollTab.getText();
        Assert.assertTrue(actualResult3.contentEquals(payroll));

        CommonUtils.waitForVisibility(humanResource.approveLeaveRequestTab);

        String actualResult4 = humanResource.approveLeaveRequestTab.getText();
        Assert.assertTrue(actualResult4.contentEquals(approveLeaveRequest));

        CommonUtils.waitForVisibility(humanResource.applyLeaveTab);

        String actualResult5 = humanResource.applyLeaveTab.getText();
        Assert.assertTrue(actualResult5.contentEquals(applyLeave));

        CommonUtils.waitForVisibility(humanResource.leaveTypeTab);

        String actualResult6 = humanResource.leaveTypeTab.getText();
        Assert.assertTrue(actualResult6.contentEquals(leaveType));

        CommonUtils.waitForVisibility(humanResource.teacherRatingTab);

        String actualResult7 = humanResource.teacherRatingTab.getText();
        Assert.assertTrue(actualResult7.contentEquals(teacherRating));

        CommonUtils.waitForVisibility(humanResource.departmentTab);

        String actualResult8 = humanResource.departmentTab.getText();
        Assert.assertTrue(actualResult8.contentEquals(department));

        CommonUtils.waitForVisibility(humanResource.designationTab);

        String actualResult9 = humanResource.designationTab.getText();
        Assert.assertTrue(actualResult9.contentEquals(designation));

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
