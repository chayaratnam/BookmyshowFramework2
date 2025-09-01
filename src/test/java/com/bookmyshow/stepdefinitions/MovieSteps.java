package com.bookmyshow.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MovieSteps {
    WebDriver driver;

    @Given("user navigates to movie page")
    public void user_navigates_movie_page() {
        // code to open movie page
    }

    @When("user selects movie {string}")
    public void user_selects_movie(String movie) {
        // code to select movie
    }

    @When("user selects show timing {string}")
    public void user_selects_showtime(String time) {
        // code to select show time
    }
}