package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class BulkDeletePage {

    public WebElement checkBox(String uniqueAdmissionNumber) {

        return WebDriverUtils.driver.findElement(By.xpath(
                "//*[contains(text(),'" + uniqueAdmissionNumber + "')]/preceding-sibling::td/input[@type='checkbox']"));

    }

    @FindBy(xpath = "//option[@value='9']")
    public WebElement classBulkDelete;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@id='load']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@id='DataTables_Table_0_wrapper']")
    public WebElement classList;

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
