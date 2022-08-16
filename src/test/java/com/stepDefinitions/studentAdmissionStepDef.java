package com.stepDefinitions;



import java.io.IOException;

import org.testng.Assert;

import com.pages.BulkDeletePage;
import com.pages.DisableStudentPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class studentAdmissionStepDef {

    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    DisableStudentPage disableStudentPage = new DisableStudentPage();
    HomePage homePage = new HomePage(); 
    BulkDeletePage bulkDeletePage = new BulkDeletePage();
   

    @When("selects section {string}")
    public void selects_section(String section) {

        CommonUtils.selectDropDownValue(section, studentAdmissionPage.section);

    
    }

    @When("enters first name {string}")
    public void enters_first_name(String firstName) {

        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
    }

    @When("selects Gender {string}")
    public void selects_Gender(String gender) {

        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.gender);
    
    }

    @When("enters Date Of Birth {string}")
    public void enters_Date_Of_Birth(String dateOfBirth) {

        studentAdmissionPage.dateOfBirth.sendKeys(dateOfBirth);

    
    }
    @When("click on If Guardian Is {string}")
    public void click_on_If_Guardian_Is(String ifGuardianIs) {

        studentAdmissionPage.ifGuardianIs.click();
       
    }

    @When("enters {string} in the Guardian Name text box")
    public void enters_in_the_Guardian_Name_text_box(String guardianNamae) {

        studentAdmissionPage.guardianName.sendKeys(guardianNamae);
    
    }

    @When("enters phone number {string}")
    public void enters_phone_number(String guardianPhone) {

        studentAdmissionPage.guardianPhone.sendKeys(guardianPhone);
    
    }

    @When("click on save button")
    public void click_on_save_button() {

        studentAdmissionPage.saveButton.click();
    }

    @When("enters {string} for admission number")
    public void enters_for_admission_number(String section) {

        disableStudentPage.studentAdmissionNo.sendKeys(section);
    }

    @When("click again on save button")
    public void click_again_on_save_button() {
        
        studentAdmissionPage.saveButton.click();
    }
    @Then("user is not be able to registor new student and {string} display page")
    public void user_is_not_be_able_to_registor_new_student_and_display_page(String addmitionNumber) throws IOException {
        CommonUtils.waitForVisibility(studentAdmissionPage.noField);

        Assert.assertTrue(studentAdmissionPage.noField.getText().contentEquals(addmitionNumber));
        
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        
        
    }

    @Then("user navigates to Bulk Delete menu")
    public void user_navigates_to_Bulk_Delete_menu() {

        homePage.bulkDelete.click();
    
    }
  
    @Then("user select class SDET")
    public void user_select_class_SDET() {
        CommonUtils.waitForClickability(bulkDeletePage.classBulkDelete);
    bulkDeletePage.classBulkDelete.click();

    }

    @Then("user clicks on search button")
    public void user_clicks_on_search_button() throws IOException {

        bulkDeletePage.searchButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    
    }

    @Then("user checks the box with admission number {string}")
    public void user_checks_the_box_with_admission_number(String admissionNo) {

        bulkDeletePage.checkBox(admissionNo).click();

    
    }

    @Then("user clicks on Delete button")
    public void user_clicks_on_Delete_button() throws InterruptedException {

        bulkDeletePage.deleteButton.click();
        Thread.sleep(2000);
        CommonUtils.acceptAlert();
   
    }

    @Then("the student with unique number {string} is not displayed")
    public void the_student_with_unique_number_is_not_displayed(String adminNo) throws IOException {

        CommonUtils.waitForVisibility(bulkDeletePage.classList);
        Assert.assertFalse(bulkDeletePage.classList.getText().contentEquals(adminNo));
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    
    }


}
