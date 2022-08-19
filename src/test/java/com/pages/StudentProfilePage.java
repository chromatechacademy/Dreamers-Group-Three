package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentProfilePage {

    // **Locator for Enable Icon*/
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement enableIcon;

    // **Locator for Disable icon*/
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement disableIcon;

    // **Locator for Student Details Module*/
    @FindBy(xpath = "(//a[@href='https://chroma.mexil.it/student/search'])[2]")
    public WebElement studentDetailsModule;

    public StudentProfilePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
