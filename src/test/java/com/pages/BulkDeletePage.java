package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class BulkDeletePage {

    //Bulk Delete link
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteLink;

    //Class name drop down
    @FindBy(xpath = "//select[@autocomplete='off']")
    public WebElement classNameDropDown;

    //Section name drop down
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionNameDropDown;

    //Search button
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    //Delete button
    @FindBy(xpath = "//button[@id='load']")
    public WebElement deleteButton;

    public WebElement bulkDeleteDynamicXpath(String studentRecordAdmissionNumber) {

        return WebDriverUtils.driver.findElement(
                By.xpath("//*[contains(text(),'" + studentRecordAdmissionNumber
                        + "')]/preceding-sibling::td/input[@type='checkbox']"));
    }

    public BulkDeletePage() {

        PageFactory.initElements(WebDriverUtils.driver, this);

    }

}
