package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://www.bookmyshow.com");
    }

    public void enterCity(String cityName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Close pop-up if exists
        try {
            WebElement popup = driver.findElement(By.xpath("//button[text()='Not Now']"));
            popup.click();
        } catch (Exception e) {
            // no pop-up, continue
        }

        // Wait for city input
        WebElement cityInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'city')]"))
        );

        cityInput.sendKeys(cityName);
        cityInput.sendKeys(Keys.ENTER);
    }
}