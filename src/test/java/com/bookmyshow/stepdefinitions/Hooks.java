package com.bookmyshow.stepdefinitions;

import com.bookmyshow.utils.DriverSetup;
import com.bookmyshow.utils.ScreenshotUtil;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    // Before all scenarios, open Chrome only once
    @Before(order = 0)
    public void setup() {
        if (driver == null) {
            driver = DriverSetup.getDriver();
        }
    }

    // After each scenario, take screenshot if failed
    @After(order = 1)
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(driver, scenario.getName());
        }
    }

    // Optional: You can quit driver manually later
    @After(order = 2)
    public void tearDown() {
        // Commented out so Chrome stays open
        // DriverSetup.quitDriver();
    }
}