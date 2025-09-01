package com.bookmyshow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCardpage {  // lowercase 'p'
    WebDriver driver;

    public GiftCardpage(WebDriver driver) {
        this.driver = driver;
    }

    By giftCardMenu = By.xpath("//a[text()='Gift Cards']"); // Adjust if needed
    By checkBalanceIcon = By.xpath("//button[contains(text(),'Check Gift Card Balance')]"); // Adjust if needed
    By invalidVoucherMsg = By.xpath("//div[contains(@class,'error-message')]"); // Adjust if needed

    public void navigateToGiftCard() {
        driver.findElement(giftCardMenu).click();
    }

    public void clickCheckBalance() {
        driver.findElement(checkBalanceIcon).click();
    }

    public String getInvalidVoucherMessage() {
        return driver.findElement(invalidVoucherMsg).getText();
    }

    public void validateErrorMessage() {
        String msg = getInvalidVoucherMessage();
        if(msg.contains("Invalid")) {
            System.out.println("Error message displayed: " + msg);
        } else {
            System.out.println("Error message not displayed correctly");
        }
    }
}