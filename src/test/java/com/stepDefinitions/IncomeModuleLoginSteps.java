package com.stepDefinitions;

import java.io.IOException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable.ForRetainedElement;

public class IncomeModuleLoginSteps {

    LoginPage loginPage = new LoginPage();

    @Then("user will have to click on section {string}")
    public void user_will_have_to_click_on_section(String incomeModule) throws IOException {
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

        WebDriverUtils.driver.findElement(By.xpath("//li//a[@href='#']//span[contains(text(),'Income')]")).click();

        CucumberLogUtils.logExtentScreenshot();

    }

}
