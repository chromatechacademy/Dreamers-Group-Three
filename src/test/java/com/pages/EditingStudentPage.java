package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class EditingStudentPage {
    
    //Selects Student Details tab
@FindBy(xpath = "//ul[@class='treeview-menu']//a[normalize-space()='Student Details']")
public WebElement studentDetailsLink;

//Clicks Search
@FindBy (xpath = "//button[@value='search_filter']")
public WebElement searchPress;

//Selects the edit button
@FindBy (xpath = "//td[contains(text(),'548')]/following-sibling::td[10]/a[2]")
public WebElement studentEditsButton;

public WebElement getStudentEditButton(String admissionNumber){
    return WebDriverUtils.driver.findElement(By.xpath("//td[contains(text(),'"+ admissionNumber +"')]/following-sibling::td[10]/a[2]"));
}

//Updates to new date of birth
@FindBy(xpath = "//input[@id='dob']")
public WebElement updatedDateOfBirth;

    public EditingStudentPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);

    }
}
