package com.bookmyshow.stepdefinitions;

import com.bookmyshow.pages.HomePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver = Hooks.driver;
    HomePage home;

    @Given("user opens homepage")
    public void user_opens_homepage() {
        home = new HomePage(driver);
        home.openHomePage();
    }

    @Given("user selects city on home page {string}")
    public void user_selects_city_home(String city) {
        home.enterCity(city);
    }
}