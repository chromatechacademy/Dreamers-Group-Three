package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;

import com.pages.HomePage;

import com.pages.StudentCategoryPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class AddAndDeleteStudentCategoriesStepDef {

    HomePage homePage = new HomePage();
    StudentCategoryPage studentCategoryPage = new StudentCategoryPage();

    @When("user clicks on section {string}")
    public void user_clicks_on_section(String studentInformaion) throws InterruptedException {

        homePage.studentInformaion.click();
        Thread.sleep(2000);

    }

    @When("user then clicks on {string}")
    public void user_then_clicks_on(String StudentCategories) throws InterruptedException, IOException {

        homePage.studenCategories.click();
         Thread.sleep(2000);
         CucumberLogUtils.logScreenShot();
         CucumberLogUtils.logExtentScreenshot(); 

    }

    @When("enter {string} for Category")
    public void enter_for_Category(String category) throws InterruptedException {

        studentCategoryPage.categoryTextbox.sendKeys(category);
        Thread.sleep(2000);

    }

    @When("user clicks on the {string} button")
    public void user_clicks_on_the_button(String string) throws InterruptedException, IOException {

        studentCategoryPage.saveButton.click();
        Thread.sleep(2000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot(); 

    }

    @When("user should delete {string}")
    public void user_should_delete(String string) throws InterruptedException, IOException {

        studentCategoryPage.deleteButton.click();
        Thread.sleep(2000);
        CommonUtils.acceptAlert();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot(); 

    }

}
