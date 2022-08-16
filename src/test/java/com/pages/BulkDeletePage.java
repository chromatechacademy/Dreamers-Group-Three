package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class BulkDeletePage {

    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteLink;

    @FindBy(xpath = "//select[@autocomplete='off']")
    public WebElement classNameDropDown;

    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionNameDropDown;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

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
