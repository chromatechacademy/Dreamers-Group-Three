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

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement studentClass;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderTextBox;
    
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupTextBox;

    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDateTextBox;

    @FindBy(xpath = "//input[@id='custom_fields")
    public WebElement mobileNumberTextBox;

    @FindBy(xpath = "//input[@id='custom_fields[students][2]']")
    public WebElement heightTextBox;

    @FindBy(xpath = "//input[@id='custom_fields[students][3]']")
    public WebElement weightTextBox;



    public StudentAdmissionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    };

}
