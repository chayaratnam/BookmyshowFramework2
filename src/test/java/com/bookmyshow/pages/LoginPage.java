package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By loginIcon = By.xpath("//span[text()='Sign In']");
    By mobileField = By.id("mobileNumber");
    By otpField = By.id("otp");
    By loginButton = By.id("loginButton");
    By errorMsg = By.id("errorMessage");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginIcon() {
        driver.findElement(loginIcon).click();
    }

    public void enterMobileNumber(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void enterOTP(String otp) {
        driver.findElement(otpField).sendKeys(otp);
    }

    public void submitLogin() {
        driver.findElement(loginButton).click();
    }

    public void verifyLoginSuccess() {
        // write validation for successful login
    }

    public void verifyLoginError() {
        driver.findElement(errorMsg).isDisplayed();
    }

    public void verifyLoginUI() {
        driver.findElement(mobileField).isDisplayed();
        driver.findElement(otpField).isDisplayed();
        driver.findElement(loginButton).isDisplayed();
    }
}