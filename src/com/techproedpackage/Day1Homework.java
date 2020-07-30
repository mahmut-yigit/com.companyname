package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Homework {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        String actualFacebookTitle = driver.getTitle();
        String expectedFecabookTitle = "facebook";
        if (actualFacebookTitle.equals(expectedFecabookTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL FACEBOOK TITLE IS " + actualFacebookTitle);
        }
        String actualFacebookURL = driver.getCurrentUrl();
        String expectedFacebookURL = "facebook";
        if (actualFacebookURL.contains(expectedFacebookURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("ACTUAL FACEBOOK URL IS" + actualFacebookURL);
        }
        driver.navigate().to("https:www.walmart.com/");

        String actualWalmartURL = driver.getCurrentUrl();
        String expectedWalmartURL = "Walmart.com";
        if (actualWalmartURL.contains(expectedWalmartURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("ACTUAL WALMAR URL IS " + actualWalmartURL);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}

/*
        Create a new class :Day1Homework
        Using ChromeDriver, Go to facebook and verify if page title is “facebook”,If not, print the correct title.
                Verify if the page URL contains facebook;
        if not, print the right url.
                Then Navigate to https:
        //www.walmart.com/
        Verify if the walmart page title includes “Walmart.com”
        Navigate back to facebook
        Refresh the page
        Maximize the window
        Close the browser  */