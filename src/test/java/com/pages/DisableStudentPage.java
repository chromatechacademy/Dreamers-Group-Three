package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DisableStudentPage {

    /** Navigation to Student Information */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationMenu;

    /** Navigation to Student Admission */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionMenu;

    /** Finding the fields for Student Information fill up */
    //Student Admission No
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentAdmissionNo;

    //Shortcut for Class WebElement for further selection of SDET
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement ClassWebElement;
   



    public DisableStudentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    
}
