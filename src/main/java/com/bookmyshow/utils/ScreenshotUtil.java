package com.bookmyshow.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
        File dest = new File(path);
        try {
            FileUtils.copyFile(source, dest);
            System.out.println("Screenshot saved: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}