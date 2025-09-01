package com.bookmyshow.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("user opens login page")
    public void user_opens_login_page() {
        // code to open login page
    }

    @When("user logs in with valid mobile {string}")
    public void user_logs_in_valid(String mobile) {
        // code to login with valid mobile
    }

    @When("user attempts login with invalid mobile {string}")
    public void user_logs_in_invalid(String mobile) {
        // code to handle invalid login
    }
}