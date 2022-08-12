package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AcademicsSectionPage {

    public WebElement dynamicSectionXpath(String sectionName) {

        return WebDriverUtils.driver
                .findElement(By.xpath("//tr/td[contains(text(),'" + sectionName + "')]/following-sibling::td/a[2]"));

    }

    public AcademicsSectionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
