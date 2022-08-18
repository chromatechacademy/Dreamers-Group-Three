package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentProfilePage {

    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement enableIcon;

    @FindBy(xpath ="//i[@class='fa fa-thumbs-o-down']")
    public WebElement disableIcon;

    @FindBy(xpath = "(//a[@href='https://chroma.mexil.it/student/search'])[2]")
    public WebElement studentDetailsModule;

    public StudentProfilePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
