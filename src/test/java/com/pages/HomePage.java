package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // Academics module link
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModuleLink;

    // Class module link
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classModuleLink;

    // Student Information Module
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInfoModule;

    // CONSTRUCTOR USING PAGE FACTORY TO INITIALIZE ELEMENTS
    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
