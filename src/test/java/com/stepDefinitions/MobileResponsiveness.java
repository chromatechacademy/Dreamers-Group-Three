package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.constants.ApplicationConstants;
import com.pages.Academics;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobileResponsiveness {

    LoginPage loginPage = new LoginPage();
    Academics academics =  new Academics();

    @Then("Start to type your Then step here the teacher should see the modules described in Description {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and also perform some manual testing operations on the device")
public void start_to_type_your_Then_step_here_the_teacher_should_see_the_modules_described_in_Description_and_also_perform_some_manual_testing_operations_on_the_device(String classTimetable,
String teachersTimetable, String assignClassTeacher, String promoteStudents, String subjectGroup,
String Subjects, String Class, String Sections) throws IOException {
    
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
