package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlTest {
    public static void main(String[] argas) {

    /*
    Create a new class: VerifyURLTest
    Navigate to google homepage
    Verify if google homepage url is “www.google.com
     */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");
        String actualURL=driver.getCurrentUrl();
        String expectedURL="www.google.com";
        if (actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected URL : "+expectedURL);
            System.out.println("Actual URL"+actualURL);
        }

    }

}
