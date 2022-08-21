package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademicsClassPage {

    // Common xpath of Cyber Security class sections
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement cyberSecuritySectionsText;

    // Cyber Security class text
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']")
    public WebElement cyberSecurityClassText;

    // SDET class text
    @FindBy(xpath = "//td[normalize-space()='SDET']")
    public WebElement sdetClassText;

    // Common xpath of SDET class sections
    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement sdetClassSectionsText;

    public AcademicsClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}