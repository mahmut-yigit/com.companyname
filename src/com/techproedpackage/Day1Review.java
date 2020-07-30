package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {
    public static void main(String[] args) {
    /*
    Create a new class : Day1Review
Using ChromeDriver, Go to youtube and verify if page title is “youtube”,
If not, print the correct title.
Verify if the page URL contains youtube if not, print the right url.
Then Navigate to https://www.amazon.com/
Navigate back to youtube
Refresh the page
Navigate forward to amazon
Maximize the window
Then verify if page title includes “Amazon”, If not, print the correct title.
Verify if the page URL is https://www.amazon.com/, if not print the correct url
Quit the browser
     */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        //getting the actual title
        String actualYoutubeTitle=driver.getTitle();
        //expected title
        String expectedYoutubeTitle="youtube";
        //verifying if actual title = expected title
        if (actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE IS "+actualYoutubeTitle);
        }
        //getting the current URL
        String actualYoutubeURL=driver.getCurrentUrl();
        //Expected url = "youtube"
        String expectedYoutubeURL="youtube";
        //Verifying if actual youtube url contains the expected youtube URL
        //We want to have dynamic code. It means code should not be hard coded
        if (actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("PASS");
        }else {
            System.out.println("CORRECT URL IS "+actualYoutubeURL);
        }
        //navigation to amazon
        driver.navigate().to("https://www.amazon.com/");
        //navigating back to previous page which is youtube
        driver.navigate().back();
        //refreshing the page
        driver.navigate().refresh();
        //navigate forward to amazon
        driver.navigate().forward();
        //maximize the window
        driver.manage().window().maximize();
        //get the actual title
        String actualAmazonTitle=driver.getTitle();
        //expected title
        String expectedAmazonTitle="Amazon";
        //check if actual title includes the expected title
        if (actualAmazonTitle.contains(expectedAmazonTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE IS : "+actualAmazonTitle);
        }
        //Verify if page url is https://www.amazon.com/
        String actualAmazonURL=driver.getCurrentUrl();
        String expectedAmazonURL="https://www.amazon.com/";
        if (actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL IS "+actualAmazonURL);
        }
        //closing the driver
        driver.quit();
    }
}
/*
1. Create a new class : Day1Review
2. Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
3. Verify if the page URL contains youtube if not, print the right url.
4. Then Navigate to https://www.amazon.com/
5. Navigate back to youtube
6. Refresh the page
7. Navigate forward to amazon
8. Maximize the window
9. Then verify if page title includes “Amazon”, If not, print the correct title.
10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
11.Quit the browser
 */