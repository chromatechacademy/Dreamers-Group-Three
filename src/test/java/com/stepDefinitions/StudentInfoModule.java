package com.stepDefinitions;




import org.openqa.selenium.By;

import com.constants.ApplicationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInfoModule {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("A user is logged into the ctsms website")
    public void a_user_is_logged_into_the_ctsms_website() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();

    }
    @When("A user clicks on Student Information Module")
    public void a_user_clicks_on_Student_Information_Module() {
    

        WebDriverUtils.driver.findElement(By.xpath("//span[normalize-space()='Student Information']")).click();
    }

@Then("A user will see modules listed in Student Information Module")
public void a_user_will_see_modules_listed_in_Student_Information_Module() {



}
}

