package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DisabledStudentsPage {

    // Locator for Class Dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropdown;

    // Locator for Class Section Dropdown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement classSectionDropDown;

    // Locator for Search button
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchBtn;

    // Locator for Student Name
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'Eugene Yeroshenko')]")
    public WebElement studentName;

    public DisabledStudentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

}