package com.pages;

import javax.xml.xpath.XPath;

import org.checkerframework.framework.qual.FieldInvariant;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentAdmissionPage {

    //Student Admission link
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionLink;

    //Admission Number text box
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumberTextBox;

    //First Name text box
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    //Roll Number text box
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    //Last Name text box
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastNameTextBox;

    //Student Class text box
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement studentClass;

    //Gender text box
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderTextBox;

    //Section drop down
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    //Date of birth text box
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthTextBox;

    //Catagory drop down
    @FindBy(xpath = "//select[@id='category_id']")
    public WebElement categoryDropDown;

    //Email text box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    //Admission text box
    @FindBy(xpath = "//input[@id='admission_date']")
    public WebElement admissionDateTextBox;

    //Blood group text box
    @FindBy(xpath = "//select[@name='blood_group']")
    public WebElement bloodGroupTextBox;

    //As on date text box
    @FindBy(xpath = "//input[@id='measure_date']")
    public WebElement asOnDateTextBox;

    //Mobile number text box
    @FindBy(xpath = "//*[@id='custom_fields[students][1]']")
    public WebElement mobileNumberTextBox;

    //Height  text box
    @FindBy(xpath = "//*[@id='custom_fields[students][2]']")
    public WebElement heightTextBox;

    //Weight text box
    @FindBy(xpath = "//input[@id='custom_fields[students][3]']")
    public WebElement weightTextBox;

    //Guardian Selection button
    @FindBy(xpath = "//input[@value='other']")
    public WebElement guardianSelectionRadio;

    //Father name text box
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    //Father Phone text box
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement fatherPhoneTextBox;

    //Father Occupation text box
    @FindBy(xpath = "//input[@id='father_occupation']")
    public WebElement fatherOccupationTextBox;

    //Mother name text box
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    //Mother Phone text box
    @FindBy(xpath = "//input[@id='mother_phone']")
    public WebElement motherPhoneTextBox;

    //Mother occupation text box
    @FindBy(xpath = "//input[@id='mother_occupation']")
    public WebElement motherOccupationTextBox;

    //Guardian Name text box
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    //Guardian relation text box
    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement guardianRelationTextBox;

    //Guardian email text box
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    //Guardian phone text box
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    //Guardian occupation text box
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    //Guardian adress text box
    @FindBy(xpath = "//textarea[@id='guardian_address']")
    public WebElement guardianAddressTextBox;

    //Save button 
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    //Sucess message
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement successMessage;

    public StudentAdmissionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    };

}
