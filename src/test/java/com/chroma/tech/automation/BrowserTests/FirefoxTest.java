package com.chroma.tech.automation.BrowserTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {
    /*
    Firefox test
    */ 

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");

        // Printing out title of the webpage
        System.out.println(driver.getTitle());

        // Printing out current URL
        System.out.println(driver.getCurrentUrl());

        // You can use close() method to close current window open
        // driver.close();

        // Closing Firefox browser using quit() method - quit() closes all windows open
        // by selenium
        driver.quit();

    }

}
