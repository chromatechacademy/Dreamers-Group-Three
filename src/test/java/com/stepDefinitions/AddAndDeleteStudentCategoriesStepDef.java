package com.stepDefinitions;

import org.openqa.selenium.By;

import com.pages.LoginPage;
import com.pages.StudentCategoryPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.When;

public class AddAndDeleteStudentCategoriesStepDef {

    LoginPage loginPage = new LoginPage();
    StudentCategoryPage studentCategoryPage = new StudentCategoryPage();

    @When("user clicks on section {string}")
    public void user_clicks_on_section(String studentInformaion) throws InterruptedException {

        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
        Thread.sleep(2000);

    }

    @When("user then clicks on {string}")
    public void user_then_clicks_on(String StudentCategories) throws InterruptedException {

        WebDriverUtils.driver.findElement(By.xpath("//a[normalize-space()='Student Categories']")).click();

        Thread.sleep(2000);

    }

    @When("enter {string} for Category")
    public void enter_for_Category(String category) throws InterruptedException {

        studentCategoryPage.categoryTextbox.sendKeys(category);
        Thread.sleep(2000);

    }

    @When("user clicks on the {string} button")
    public void user_clicks_on_the_button(String string) throws InterruptedException {

        studentCategoryPage.saveButton.click();
        Thread.sleep(2000);

    }

    @When("user should delete {string}")
    public void user_should_delete(String string) throws InterruptedException {

        studentCategoryPage.deleteButton.click();
        Thread.sleep(2000);

    }

}
