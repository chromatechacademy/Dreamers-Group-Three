package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentAdmissionPage {

    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionLink;

    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumberTextBox;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    public StudentAdmissionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    };

}
