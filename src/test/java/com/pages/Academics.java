package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Academics {

    /** classTimetableTab */
    @FindBy(xpath = "//a[@href='https://chroma.mexil.it/admin/timetable/classreport']")
    public WebElement classTimetableTab;

    /** teachersTimetableTab */
    @FindBy(xpath = "//a[normalize-space()='Teachers Timetable']")
    public WebElement teachersTimetableTab;

    /** assignClassTeacherTab */
    @FindBy(xpath = "//a[normalize-space()='Assign Class Teacher']")
    public WebElement assignClassTeacherTab;

    /** promoteStudentsTab */
    @FindBy(xpath = "//a[normalize-space()='Promote Students']")
    public WebElement promoteStudentsTab;

    /** subjectGroupTab */
    @FindBy(xpath = "//a[normalize-space()='Subject Group']")
    public WebElement subjectGroupTab;

    /** SubjectsTab */
    @FindBy(xpath = "//a[normalize-space()='Subjects']")
    public WebElement SubjectsTab;

    /** ClassTab */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement ClassTab;

    /** SectionsTab */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement SectionsTab;

    public Academics() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}

