package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CityPage {
    WebDriver driver;

    By citySearchField = By.xpath("//input[@placeholder='Search for your city']");
    By errorMsg = By.id("cityError");

    public CityPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCity(String city) {
        driver.findElement(citySearchField).sendKeys(city);
        // Add select/enter action if needed
    }

    public void verifyCityResults(String city) {
        // Validate city appears in results
    }

    public void verifyCityError() {
        driver.findElement(errorMsg).isDisplayed();
    }

    public void clickCityIcon(String icon) {
        driver.findElement(By.xpath("//div[text()='"+icon+"']")).click();
    }

    public void viewAllCities() {
        driver.findElement(By.xpath("//a[text()='View All Cities']")).click();
    }

    public void verifyAdditionalCities() {
        // Validate some non-popular cities
    }
}