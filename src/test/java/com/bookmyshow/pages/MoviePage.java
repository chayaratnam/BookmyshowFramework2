package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage {
    WebDriver driver;

    By movieSearchField = By.xpath("//input[@placeholder='Search for movies']");
    By moviesTab = By.xpath("//a[text()='Movies']");
    By upcomingMoviesLink = By.xpath("//a[text()='Explore Upcoming Movies']");
    By cinemasNearYouLink = By.xpath("//a[text()='Cinemas Near You']");

    public MoviePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchMovie(String movie) {
        driver.findElement(movieSearchField).sendKeys(movie);
        // Add enter/select action if needed
    }

    public void verifyMovieResults(String movie) {
        // Validate movie appears in results
    }

    public void clickMoviesTab() {
        driver.findElement(moviesTab).click();
    }

    public void verifyMoviesScreen() {
        // Validate movies UI screen elements
    }

    public void exploreUpcomingMovies() {
        driver.findElement(upcomingMoviesLink).click();
    }

    public void verifyUpcomingMovies() {
        // Validate upcoming movies section is visible
    }

    public void verifyCinemasNearYou() {
        driver.findElement(cinemasNearYouLink).isDisplayed();
    }
}