package com.pages;

<<<<<<< HEAD
=======
import com.web.WebDriverUtils;

>>>>>>> 81e5e2ffbd253c904147c7a83ea7494b49039861
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD
import com.web.WebDriverUtils;

public class HomePage {

    // ** Locator for Student Inforamation module */
    @FindBy(xpath = "(//*[contains(text(),'Student Information')])[1]")
    public WebElement studentInformationModule;

    // ** Locator for Student Details module */
    @FindBy(xpath = "(//*[contains(text(),'Student Details')])[2]")
    public WebElement studentDetailsModule;

    // ** Locator for Disabled Student module*/
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentModule;

    // ** Locator for Fees Collection Module*/
    @FindBy(xpath = "//*[contains(text(),' Fees Collection')]")
    public WebElement feesCollectionModule;

    // ** Locator for Income Module*/
    @FindBy(xpath = "(//*[contains(text(),'Income')])[1]")
    public WebElement incomeModule;

    // ** Locator for Expenses Module*/
    @FindBy(xpath = "//*[contains(text(),'Expenses')]")
    public WebElement expensesModule;

    // * Locator for Academics Module*/
    @FindBy(xpath = "//*[contains(text(), 'Academics')]")
    public WebElement academicsModule;

    // ** Locator for Human Resources Module*/
    @FindBy(xpath = "//*[contains(text(),'Human Resource')]")
    public WebElement humanResourceModule;

    // ** Locator for Homework Module*/
    @FindBy(xpath = "//*[contains(text(),'Homework')]")
    public WebElement homeWorkModule;

    // **Locator for Reports Module*/
    @FindBy(xpath = "//*[contains(text(),'Reports')]")
    public WebElement reportsModule;

    // ** Locator for Add Homework Module*/
    @FindBy(xpath = "//*[contains(text(),'Add Homework')]")
    public WebElement addHomeWorkModule;

    // ** Locator for Add Expense Module*/
    @FindBy(xpath = "(//*[contains(text(),'Add Expense')])[2]")
    public WebElement addExpenseModule;

    // ** Locator for Search Expense Module*/
    @FindBy(xpath = "//a[normalize-space()='Search Expense']")
    public WebElement searchExpenseModule;

    // ** Locator for Expense Head Module*/
    @FindBy(xpath = "//*[contains(text(),'Expense Head')]")
    public WebElement expenseHeadModule;

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

=======
public class HomePage {

    // Academics module link
    @FindBy (xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModuleLink;

    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationLink;

    // Class module link
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classModuleLink;

    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    // CONSTRUCTOR USING PAGE FACTORY TO INITIALIZE ELEMENTS
    public HomePage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }
>>>>>>> 81e5e2ffbd253c904147c7a83ea7494b49039861
}
