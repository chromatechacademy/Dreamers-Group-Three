package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    // Academics module link
    @FindBy (xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModuleLink;

    // Class module link
    @FindBy (xpath = "//a[normalize-space()='Class']")
    public WebElement classModuleLink;

    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformaion;

    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studenCategories; 



    




    // CONSTRUCTOR USING PAGE FACTORY TO INITIALIZE ELEMENTS
    public HomePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
