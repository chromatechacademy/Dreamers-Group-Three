package com.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModulesStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user access ChromaTech website")
    public void user_access_ChromaTech_website() {
        WebDriverUtils.driver.get("https://chroma.mexil.it/site/login");

    }

    @When("user enters the Username {string}")
    public void user_enters_the_Username(String string) {
        loginPage.usernameTextBox.sendKeys("general@teacher.com");
    }

    @When("User enters password {string}")
    public void user_enters_password(String string) {
        loginPage.passwordTextBox.sendKeys("123456");

    }

    @When("User clicks Sign in button")
    public void user_clicks_Sign_in_button() {
        loginPage.signInButton.click();

    }

    @Then("the modules display")
    public void the_modules_display() {

        String studentInformationModuleName = "Student Information";
        String feesCollectionModuleName = "Fees Collection";
        String incomeModuleName = "Income";
        String expensesModuleName = "Expenses";
        String academicsModuleName = "Academics";
        String humanResourceModuleName = "Human Resource";
        String homeWorkModuleName = "Homework";
        String reportsModuleName = "Reports";
        Assert.assertEquals(homePage.studentInformationModule.getText(), studentInformationModuleName);
        Assert.assertEquals(homePage.feesCollectionModule.getText(), feesCollectionModuleName);
        Assert.assertEquals(homePage.incomeModule.getText(), incomeModuleName);
        Assert.assertEquals(homePage.expensesModule.getText(), expensesModuleName);
        Assert.assertEquals(homePage.academicsModule.getText(), academicsModuleName);
        Assert.assertEquals(homePage.humanResourceModule.getText(), humanResourceModuleName);
        Assert.assertEquals(homePage.homeWorkModule.getText(), homeWorkModuleName);
        Assert.assertEquals(homePage.reportsModule.getText(), reportsModuleName);

    }

    @When("User clicks HomeWork module")
    public void user_clicks_HomeWork_module() {
        homePage.homeWorkModule.click();

    }

    @Then("Add HomeWork module displays")
    public void add_HomeWork_module_displays() {
        String addHomeWorkModule = "Add Homework";
        Assert.assertEquals(homePage.addHomeWorkModule.getText(), addHomeWorkModule);
    
    }

    @When("User clicks on the Expenses module")
    public void user_clicks_on_the_Expenses_module() {
        homePage.expensesModule.click();
    
    }
    
    @Then("the Expenses modules are display")
    public void the_Expenses_modules_are_display() throws InterruptedException 
    {

        String addExpenseModuleExpected = "Add Expense";
        String searchExpenseModuleExpected = "Search Expense";
        String expenseHeadModuleExpected = "Expense Head";
        Thread.sleep(2000);

        Assert.assertEquals(homePage.addExpenseModule.getText(),addExpenseModuleExpected);
        Assert.assertEquals(homePage.searchExpenseModule.getText(),searchExpenseModuleExpected);
        Assert.assertEquals(homePage.expenseHeadModule.getText(),expenseHeadModuleExpected);


    }
}

