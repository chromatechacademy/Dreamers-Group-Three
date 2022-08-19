package com.stepDefinitions;

import org.junit.Assert;

import com.pages.DisabledStudentsPage;
import com.pages.HomePage;
import com.pages.StudentProfilePage;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnabledStudentStepDef {

    HomePage homePage = new HomePage();
    DisabledStudentsPage disabledStudentsPage = new DisabledStudentsPage();
    StudentProfilePage studentProfilePage = new StudentProfilePage();

    @When("User is on Disabled Student Page")
    public void user_is_on_Disabled_Student_Page() {
        homePage.studentInformationModule.click();
        homePage.disabledStudentModule.click();

    }

    @When("User select Class {string}")
    public void user_select_Class(String className) {
        CommonUtils.selectDropDownValue(className, disabledStudentsPage.classDropdown);

    }

    @When("User select Section {string}")
    public void user_select_Section(String classSectionName) {
        CommonUtils.selectDropDownValue(classSectionName, disabledStudentsPage.classSectionDropDown);

    }

    @When("User clicks Search")
    public void user_clicks_Search() throws InterruptedException {
        disabledStudentsPage.searchBtn.click();

    }

    @When("User enables Student")
    public void user_enables_Student() throws InterruptedException {
        disabledStudentsPage.studentName.click();
        studentProfilePage.enableIcon.click();
        CommonUtils.acceptAlert();
        Thread.sleep(5000);

    }

    @Then("Student has been enabled")
    public void student_has_been_enabled() throws InterruptedException {
        Assert.assertTrue(studentProfilePage.disableIcon.isDisplayed());

    }

    @When("User selects Class {string}")
    public void user_selects_Class(String string) {
        CommonUtils.selectDropDownValue(string, disabledStudentsPage.classDropdown);
    }

    @When("User selects Section {string}")
    public void user_selects_Section(String string) {
        CommonUtils.selectDropDownValue(string, disabledStudentsPage.classSectionDropDown);

    }


 
}

