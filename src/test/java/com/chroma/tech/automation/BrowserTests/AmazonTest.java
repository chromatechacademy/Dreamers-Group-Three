package com.chroma.tech.automation.BrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // Using ID locator to send text
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Selenium");

        // Using ID locator to click on search button
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Using partialLinkText to click on a link
        driver.findElement(By.partialLinkText("A Beginner")).click();

        // Using className to retrieve text using getText() method
        String sample = driver.findElement(By.className("a-size-extra-large")).getText();
        System.out.println(sample);

    }

}
