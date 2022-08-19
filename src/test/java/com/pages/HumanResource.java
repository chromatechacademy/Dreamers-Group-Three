package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HumanResource {

    /** staffDirectory */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Staff Directory']")
    public WebElement staffDirectoryTab;

    /** staffAttendance */
    @FindBy(xpath = "//ul[contains(@class,'treeview-menu menu-open')]//a[normalize-space()='Staff Attendance']")
    public WebElement staffAttendanceTab;

    /** payroll */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement payrollTab;

    /** approveLeaveRequest */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement approveLeaveRequestTab;

    /** applyLeave */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement applyLeaveTab;

    /** leaveType */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement leaveTypeTab;

    /** teachersRating */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement teacherRatingTab;

    /** department */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement departmentTab;

    /** designation */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement designationTab;

    public HumanResource() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    
}
