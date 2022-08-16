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
    public WebElement categoryDropDown;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupTextBox;

    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDateTextBox;

    @FindBy(xpath = "//*[@id='custom_fields[students][1]']")
    public WebElement mobileNumberTextBox;

    @FindBy(xpath = "//*[@id='custom_fields[students][2]']")
    public WebElement heightTextBox;

    @FindBy(xpath = "//input[@id='custom_fields[students][3]']")
    public WebElement weightTextBox;

    @FindBy(xpath = "//input[@value='other']")
    public WebElement guardianSelectionRadio;

    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneTextBox;

    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneTextBox;

    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement guardianRelationTextBox;

    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement successMessage;

    public StudentAdmissionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    };

}
