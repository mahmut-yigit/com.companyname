package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1ReviewPractice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "YouTube";
        if (actualYoutubeTitle.equals(expectedYoutubeTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE IS " + actualYoutubeTitle);
        }
        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";
        if (actualYoutubeURL.contains(expectedYoutubeURL)) {
            System.out.println("PASS");
        } else {
            System.out.println("CORRECT URL IS " + actualYoutubeURL);
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualAmazonTitle = driver.getTitle();
        String expectedAmazonTitle = "Amazon";
        if (actualAmazonTitle.contains(expectedAmazonTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE IS");
        }
        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";
        if (actualAmazonURL.equals(expectedAmazonURL)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL IS "+actualAmazonURL);
        }
        driver.quit();
    }
}