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
import com.web.JavascriptUtils;
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
        JavascriptUtils.selectDateByJS(studentAdmissionPage.dateOfBirthTextBox, dateOfBirth);
        CommonUtils.selectDropDownValue(category, studentAdmissionPage.categoryDropDown);
        studentAdmissionPage.emailTextBox.sendKeys(email);
        JavascriptUtils.selectDateByJS(studentAdmissionPage.admissionDateTextBox, admissionDate);
        CommonUtils.selectDropDownValue(bloodGroup, studentAdmissionPage.bloodGroupTextBox);
        JavascriptUtils.selectDateByJS(studentAdmissionPage.asOnDateTextBox, asOnDate);
        CommonUtils.waitForVisibility(studentAdmissionPage.mobileNumberTextBox);
        studentAdmissionPage.mobileNumberTextBox.sendKeys(mobileNumber);
        studentAdmissionPage.heightTextBox.sendKeys(height);
        studentAdmissionPage.weightTextBox.sendKeys(weight);

    }

    @When("selects other for guardian")
    public void selects_other_for_guardian()  {
        studentAdmissionPage.guardianSelectionRadio.click();
    }

    @When("enters guardian information {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void enters_guardian_information(String fatherName, String fatherPhone, String fatherOccupation,
            String motherName,
            String motherPhone, String motherOccupation, String guradianName, String guardianRelation,
            String guardianEmail, String guardianPhone,
            String guardianOccupation, String guardianAdress) throws InterruptedException {

        studentAdmissionPage.fatherNameTextBox.sendKeys(fatherName);
        studentAdmissionPage.fatherPhoneTextBox.sendKeys(fatherPhone);
        studentAdmissionPage.fatherOccupationTextBox.sendKeys(fatherOccupation);
        studentAdmissionPage.motherNameTextBox.sendKeys(motherName);
        studentAdmissionPage.motherPhoneTextBox.sendKeys(motherPhone);
        studentAdmissionPage.motherOccupationTextBox.sendKeys(motherOccupation);
        studentAdmissionPage.guardianNameTextBox.sendKeys(guradianName);
        studentAdmissionPage.guardianRelationTextBox.sendKeys(guardianRelation);
        studentAdmissionPage.guardianEmailTextBox.sendKeys(guardianEmail);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(guardianPhone);
        studentAdmissionPage.guardianOccupationTextBox.sendKeys(guardianOccupation);
        studentAdmissionPage.guardianAddressTextBox.sendKeys(guardianAdress);
        studentAdmissionPage.saveButton.click();
        Thread.sleep(5000);

        // JavascriptUtils.scrollIntoView(element);
    }
}