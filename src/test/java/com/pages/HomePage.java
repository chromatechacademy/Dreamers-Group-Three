package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

    @FindBy(xpath = "(//*[contains(text(),'Student Information')])[1]")
    public WebElement studentInformationModule;

    @FindBy(xpath = "//*[contains(text(),' Fees Collection')]")
    public WebElement feesCollectionModule;

    @FindBy(xpath = "(//*[contains(text(),'Income')])[1]")
    public WebElement incomeModule;

    @FindBy(xpath = "//*[contains(text(),'Expenses')]")
    public WebElement expensesModule;

    @FindBy(xpath = "//*[contains(text(), 'Academics')]")
    public WebElement academicsModule;

    @FindBy(xpath = "//*[contains(text(),'Human Resource')]")
    public WebElement humanResourceModule;

    @FindBy(xpath = "//*[contains(text(),'Homework')]")
    public WebElement homeWorkModule;

    @FindBy(xpath = "//*[contains(text(),'Reports')]")
    public WebElement reportsModule;

    @FindBy(xpath = "//*[contains(text(),'Add Homework')]")
    public WebElement addHomeWorkModule;

    @FindBy(xpath = "(//*[contains(text(),'Add Expense')])[2]")
    public WebElement addExpenseModule;

    @FindBy(xpath = "//a[normalize-space()='Search Expense']")
    public WebElement searchExpenseModule;

    @FindBy(xpath = "//*[contains(text(),'Expense Head')]")
    public WebElement expenseHeadModule;
    

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }



}
