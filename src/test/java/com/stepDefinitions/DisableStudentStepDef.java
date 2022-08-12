package com.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.pages.DisableStudentPage;
import com.pages.HumanResource;
import com.pages.LoginPage;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DisableStudentStepDef {

    LoginPage loginPage = new LoginPage();
    DisableStudentPage disableStudent = new DisableStudentPage();

    @Given("a teacher is on the login page of the CTSMS website")
    public void a_teacher_is_on_the_login_page_of_the_CTSMS_website() {

        WebDriverUtils.driver.get("https://chroma.mexil.it/site/login");

    }

    @When("the teacher uses as login credentials the username {string} and password {string}")
    public void the_teacher_uses_as_login_credentials_the_username_and_password(String username, String password) {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

    }

    @When("navigates to Student Information menu option")
    public void navigates_to_Student_Information_menu_option() {

        disableStudent.studentInformationMenu.click();

    }

    @When("after clicks on Student Admission")
    public void after_clicks_on_Student_Admission() {

        disableStudent.studentAdmissionMenu.click();

    }

    @When("enters {string} for Admission No")
    public void enters_for_Admission_No(String AdmissionNo) {

        disableStudent.studentAdmissionNo.sendKeys(AdmissionNo);

    }

    @When("selects Class {string} option from Class dropdown menu")
    public void selects_Class_option_from_Class_dropdown_menu(String sdet) throws InterruptedException {

        CommonUtils.selectDropDownValue(sdet, disableStudent.ClassWebElement);

        Thread.sleep(5000);

    }

}

