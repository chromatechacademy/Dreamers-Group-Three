package com.stepDefinitions;

import java.io.IOException;

import com.pages.BulkDeletePage;

import com.pages.EditingStudentPage;
import com.pages.StudentAdmissionPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.JavascriptUtils;

import cucumber.api.java.en.Then;

public class EditStudentRecordsStepDef {

    BulkDeletePage bulkDeletePage = new BulkDeletePage();
    EditingStudentPage editingStudentPage = new EditingStudentPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Then("user will change student record by selecting class {string} and section {string}")
    public void user_will_change_student_record_by_selecting_class_and_section(String className, String section) throws IOException {
        editingStudentPage.studentDetailsLink.click();
        CommonUtils.selectDropDownValue(className, bulkDeletePage.classNameDropDown);
        CommonUtils.selectDropDownValue(section, bulkDeletePage.sectionNameDropDown);
        editingStudentPage.searchPress.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("selects student edit button in order to change students date of birth {string}")
    public void selects_student_edit_button_in_order_to_change_students_date_of_birth(String string)
            throws InterruptedException {
        editingStudentPage.studentEditsButton.click();
        studentAdmissionPage.dateOfBirthTextBox.clear();

    }

    @Then("selection the section {string},change the date to that of updated date of birth {string}")
    public void selection_the_section_change_the_date_to_that_of_updated_date_of_birth(String section,
            String updatedDateOfBirth) throws InterruptedException, IOException {
        CommonUtils.selectDropDownValue(section, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.dateOfBirthTextBox.click();
        editingStudentPage.updatedDateOfBirth.sendKeys(updatedDateOfBirth);
        JavascriptUtils.scrollIntoView(studentAdmissionPage.saveButton);
        studentAdmissionPage.saveButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
