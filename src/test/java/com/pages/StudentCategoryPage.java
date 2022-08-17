package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentCategoryPage {

    @FindBy(xpath = "//*[@id='category']")
    public WebElement categoryTextbox; 

    @FindBy(xpath = "//*[@id='form1']/div[2]/button")
    public WebElement saveButton;
    
    @FindBy(xpath = "//td[contains(text(),'Moe')]/following-sibling::td[2]/a[2]")
    public WebElement deleteButton; 
   

    
    
    
    
    
    
    
    public StudentCategoryPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

    
}
