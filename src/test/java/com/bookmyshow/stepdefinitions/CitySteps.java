package com.bookmyshow.stepdefinitions;

import com.bookmyshow.pages.CityPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CitySteps {
    WebDriver driver = Hooks.driver;
    CityPage cityPage;

    @Given("user enters city on city page {string}")
    public void user_enters_city_cityPage(String city) {
        cityPage = new CityPage(driver);
        cityPage.enterCity(city);
    }

    @Given("user searches for theatres")
    public void user_searches_theatres() {
        // Implement theatre search if needed
    }
}