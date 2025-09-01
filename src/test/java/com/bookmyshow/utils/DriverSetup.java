package com.bookmyshow.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); // automatically setup driver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.bookmyshow.com"); // open BookMyShow
        }
        return driver;
    }

    // optional quit
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}