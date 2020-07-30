package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //When we are doing automation, first step is to do manual test
        //driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();//navigate back to google
        driver.navigate().forward();//navigating forward to amazon
        driver.navigate().refresh();//refreshes the page
        driver.manage().window().maximize();
        driver.quit();
        //navatigate().to(); and get(); methods are very similar
        //There are some differences:
        //get(); opens the url, waits for the page to load, you cannot navigate the previous page
        //navatigate().to(); opens the url, doesn't wait for the page to load, you can navigate back and forward


    }
}
