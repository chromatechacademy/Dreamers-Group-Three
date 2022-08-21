package com.stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.constants.ApplicationConstants;
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
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

    }

    @When("user enters the Username {string}")
    public void user_enters_the_Username(String string) {
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        loginPage.passwordTextBox.sendKeys(password);

    }

    @When("User clicks Sign in button")
    public void user_clicks_Sign_in_button() {
        loginPage.signInButton.click();

    }

    @When("User clicks HomeWork module")
    public void user_clicks_HomeWork_module() {
        homePage.homeWorkModule.click();

    }

    @When("User clicks on the Expenses module")
    public void user_clicks_on_the_Expenses_module() {
        homePage.expensesModule.click();

    }

    @When("user enters the {string}")
    public void user_enters_the(String string) {
        loginPage.usernameTextBox.sendKeys(string);

    }

    @When("User enters {string}")
    public void user_enters(String string) {
        loginPage.passwordTextBox.sendKeys(string);
    }

    @Then("the following modules correctly display {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_modules_correctly_display(String studentInformationModuleName,
            String feesCollectionModuleName, String incomeModuleName, String expensesModuleName,
            String academicsModuleName, String humanResourceModuleName, String homeWorkModuleName,
            String reportsModuleName) {
        Assert.assertEquals(homePage.studentInformationModule.getText(), studentInformationModuleName);
        Assert.assertEquals(homePage.feesCollectionModule.getText(), feesCollectionModuleName);
        Assert.assertEquals(homePage.incomeModule.getText(), incomeModuleName);
        Assert.assertEquals(homePage.expensesModule.getText(), expensesModuleName);
        Assert.assertEquals(homePage.academicsModule.getText(), academicsModuleName);
        Assert.assertEquals(homePage.humanResourceModule.getText(), humanResourceModuleName);
        Assert.assertEquals(homePage.homeWorkModule.getText(), homeWorkModuleName);
        Assert.assertEquals(homePage.reportsModule.getText(), reportsModuleName);

    }

    @Then("Add HomeWork module correctly displays {string}")
    public void add_HomeWork_module_correctly_displays(String addHomeWorkModule) {
        Assert.assertEquals(homePage.addHomeWorkModule.getText(), addHomeWorkModule);
    }

    @Then("the Expenses modules corectly display {string}, {string}, {string}")
    public void the_Expenses_modules_corectly_display(String addExpenseModuleExpected,
            String searchExpenseModuleExpected,

            String expenseHeadModuleExpected) throws InterruptedException {

        Assert.assertEquals(homePage.addExpenseModule.getText(), addExpenseModuleExpected);
        Thread.sleep(2000);
        Assert.assertEquals(homePage.searchExpenseModule.getText(), searchExpenseModuleExpected);
        Assert.assertEquals(homePage.expenseHeadModule.getText(), expenseHeadModuleExpected);

    }
}
