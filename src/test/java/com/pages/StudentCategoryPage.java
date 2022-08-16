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
    
    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/a[2]")
    public WebDriverUtils deleteButton; 
   

    
    
    
    
    
    
    
    public StudentCategoryPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

    
}
