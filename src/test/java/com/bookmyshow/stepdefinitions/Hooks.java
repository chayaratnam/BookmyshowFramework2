package com.bookmyshow.stepdefinitions;

import com.bookmyshow.utils.DriverSetup;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup() {
        driver = DriverSetup.getDriver();
    }

    @After
    public void tearDown() {
        // comment this if you want Chrome to stay open after scenario
        // DriverSetup.quitDriver();
    }
}