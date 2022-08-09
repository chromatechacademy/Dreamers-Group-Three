package com.chroma.tech.automation.BrowserTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ChromeTest {
 
    /*
        Chrome Browser Test
    */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Setting up chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Instantiating WebDriver and ChromeDriver
        WebDriver driver = new ChromeDriver();

        // navigating to a website using get() method
        driver.get("https://www.google.com/");

        // Printing out title of the webpage
        System.out.println(driver.getTitle());

        // Printing out current URL
        System.out.println(driver.getCurrentUrl());
       
        // You can use close() method to close current window open
        // driver.close();

        // Closing Chrome browser using quit() method - quit() closes all windows open
        // by selenium
        driver.quit();

    }
}
