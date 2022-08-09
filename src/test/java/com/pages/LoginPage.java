package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    /** Username text box */
    @FindBy(xpath = "//input[@placeholder='Username']") 
    public WebElement usernameTextBox;

    /** Password text box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /** Sign In button */
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    /** Invalid username or password text box */
    @FindBy(xpath = "//div[normalize-space()='Invalid Username or Password']")
    public WebElement invalidUsernameOrPasswordMessage;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
