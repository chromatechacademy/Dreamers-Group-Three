package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademicsSectionPage {

    // SECTIONS LINK
    @FindBy (xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsLink;

    // SECTIONS TEXT BOX
    @FindBy (xpath = "//input[@name='section']")
    public WebElement sectionsTextBox;

    // SECTIONS SAVE BUTTON
    @FindBy (xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement sectionsSaveButton;

    /**
     * USE THIS METHOD TO IDENTIFY THE SECTION NAME IN SECTIONS PAGE TABLE
     * @param classSection
     * @return
     */
    public WebElement classSectionsDynamicXPATH(String classSection) {

        return WebDriverUtils.driver.findElement(
                By.xpath("//tr/td[contains(text(),'" + classSection + "')]/following-sibling::td/a[2]"));

    }

    public AcademicsSectionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
