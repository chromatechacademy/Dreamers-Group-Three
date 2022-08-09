package com.chroma.tech.automation.BrowserTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");

        // Printing out title of the webpage
        System.out.println(driver.getTitle());

        // Printing out current URL
        System.out.println(driver.getCurrentUrl());

        // You can use close() method to close current window open
        // driver.close();

        // Closing Edge browser using quit() method - quit() closes all windows open
        // by selenium
        driver.quit();

    }

}
