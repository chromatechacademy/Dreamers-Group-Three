package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.appsCommon.PageInitializer;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends WebDriverUtils {

    @Before
    public void start(Scenario scenario) {

        CucumberLogUtils.scenario = scenario;
        setUp();
        PageInitializer.initializePageObjects();
    }

    @After
     public void end(Scenario scenario) throws IOException {
        tearDown();
    }
    
   
    

}
