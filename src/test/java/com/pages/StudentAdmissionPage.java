package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentAdmissionPage {

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement section;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement gender; 

    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//input[@value='father']")
    public WebElement ifGuardianIs;

    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianName;

    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhone;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement noField;


    
    
    
    
    
    
    
    
    
    
    
    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }


    
}
