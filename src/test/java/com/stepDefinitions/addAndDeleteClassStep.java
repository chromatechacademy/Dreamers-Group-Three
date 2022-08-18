package com.stepDefinitions;

import com.pages.Academics;
import com.pages.HomePage;

import cucumber.api.java.en.When;

public class addAndDeleteClassStep {

    HomePage homePage = new HomePage();
    Academics academics = new Academics();

    @When("user clicks on {string} module")
    public void user_clicks_on_module(String string) {

        homePage.academicsModuleLink.click();

    }

    @When("user clicks on the {string} page")
    public void user_clicks_on_the_page(String string) {

        academics.ClassTab.click();

    }

}
