package com.stepDefinitions;

import org.apache.commons.configuration.resolver.CatalogResolver.Catalog;
import org.openqa.selenium.By;

import com.constants.ApplicationConstants;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.github.dockerjava.api.model.Driver;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Given("user is on chroma tech website")
    public void user_is_on_chroma_tech_website() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

    }

    @When("the teacher is logging in with username {string} and password {string}")
    public void the_teacher_is_logging_in_with_username_and_password(String username, String password) {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();
    }

    @When("user clicks Student Information")
    public void user_clicks_Student_Information() {
        homePage.studentInformationLink.click();
    }

    @When("user clicks on Student Admission")
    public void user_clicks_on_Student_Admission() {
        studentAdmissionPage.studentAdmissionLink.click();
    }

    @When("admits student with the information {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void admits_student_with_the_information(String admissionNumber, String firstName, String rollNumber,
            String lastName,
            String studentClass, String gender, String section, String dateOfBirth, String category, String email,
            String admissionDate, String bloodGroup, String asOnDate, String mobileNumber, String height,
            String weight) throws InterruptedException {

        studentAdmissionPage.admissionNumberTextBox.sendKeys(admissionNumber);
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.rollNumberTextBox.sendKeys(rollNumber);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
        CommonUtils.selectDropDownValue(studentClass, studentAdmissionPage.studentClass);
        Thread.sleep(4000);
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderTextBox);
        CommonUtils.selectDropDownValue(section, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.dateOfBirthTextBox.sendKeys(dateOfBirth);
        CommonUtils.selectDropDownValue(category, studentAdmissionPage.categoryDropDown);
        studentAdmissionPage.emailTextBox.sendKeys(email);
        studentAdmissionPage.admissionDateTextBox.click();
        studentAdmissionPage.admissionDateSelectTextBox.click();
        CommonUtils.selectDropDownValue(bloodGroup, studentAdmissionPage.bloodGroupTextBox);
        studentAdmissionPage.asOnDateTextBox.click();
        studentAdmissionPage.asOnDateSelectTextBox.click();
        Thread.sleep(6000);
        studentAdmissionPage.mobileNumberTextBox.sendKeys(mobileNumber);
        Thread.sleep(6000);
        studentAdmissionPage.heightTextBox.sendKeys(height);
        studentAdmissionPage.weightTextBox.sendKeys(weight);
        

    }

    @When("selects other for guardian")
    public void selects_other_for_guardian() {

        
    }

    @When("enters guardian information {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void enters_guardian_information(String fatherName, String string2, String string3, String string4,
            String string5, String string6, String string7, String string8, String string9, String string10,
            String string11, String string12) {

    }
}