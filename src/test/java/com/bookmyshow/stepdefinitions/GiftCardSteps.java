package com.bookmyshow.stepdefinitions;

import com.bookmyshow.pages.MoviePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class GiftCardSteps {
    WebDriver driver = Hooks.driver;
    MoviePage moviePage;

    @Given("user opens gift card page")
    public void user_opens_giftcard_page() {
        moviePage = new MoviePage(driver);
        // Navigate to Gift Card section if needed
    }

    @When("user selects gift card {string}")
    public void user_selects_giftcard(String gift) {
        // Implement selecting gift card
    }

    @When("user enters gift card amount {string}")
    public void user_enters_amount(String amount) {
        // Implement entering amount
    }
}