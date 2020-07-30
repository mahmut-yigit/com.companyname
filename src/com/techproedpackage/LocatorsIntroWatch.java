package com.techproedpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class LocatorsIntroWatch {
    //Create main method and complete the following task.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //When user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //Locate the elements of email textbox,password textbox, and signin button
        //Writing locator for email textbox
        WebElement emailTextbox = driver.findElement(By.id("session_email"));
        //We created the element for email textbox. It means we can use the methods of teh webelement
        emailTextbox.sendKeys("testtechproed@gmail.com");
        //Writing locator for password textbox
        WebElement passwordTextbox = driver.findElement(By.id("session_password"));
        passwordTextbox.sendKeys("Test1234!");

        //Writing the locator for signin button
        WebElement signInButon = driver.findElement(By.name("commit"));
        signInButon.click();
        //Then verify that the expected user id  testtechproed@gmail.com
        //locating the user id element
        WebElement userId = driver.findElement(By.className("navbar-text"));
        System.out.println("USER ID WEBELEMENT: " + userId);

        //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>
        String actualUserId = userId.getText();
        System.out.println("USER IS TEXT :" + actualUserId);
        String expectedUserID = "testtechproed@gmail.com";
        if (actualUserId.equals(expectedUserID)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID IS " + actualUserId);
            System.out.println("EXPECTED ID IS: " + expectedUserID);

            // Verify the Addresses and Sign Out  texts are displayed
/*
<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
 */
            WebElement addressLink = driver.findElement(By.linkText("Addresses"));
            String actualAddressLink = addressLink.getText();
            String expectedAddressLink = "Addresses";

            if (actualAddressLink.equals(expectedAddressLink)) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("ACTUAL ADDRESS IS " + actualAddressLink);
                System.out.println("EXPECTED address IS: " + expectedAddressLink);
            }
//<a class="nav-item nav-link" data-test="sign-out" rel="nofollow" data-method="delete"
// href="/sign_out">Sign out</a>
            //Checking if Sign Out text is displayed as expected
            String expectedSignout = "Sign Out";
            //String actualSignout = driver.findElement(By.linkText("Sign out")).getText();
            //Or we can use below combination
            WebElement signOutElement = driver.findElement(By.linkText("Sign out"));
            String actualSignout = signOutElement.getText();
            if (actualSignout.equals(expectedSignout)) {
                System.out.println("PASS: " + actualSignout);
            } else {
                System.out.println("FAIL");
                System.out.println("ACTUAL TEXT IS " + actualSignout);
                System.out.println("EXPEXTED TEXT IS " + expectedSignout);

            }





        /*
Create a class : LocatorsIntro
Create main method and complete the following task.
When user goes to http://a.testaddressbook.com/sign_in
Locate the elements of email textbox,password textbox, and signin button
Enter below username and password then click sign in button
Username :  testtechproed@gmail.com
Password : Test1234!
Then verify that the expected user id  testtechproed@gmail.com
Verify the Addresses and Sign Out  texts are displayed
Find the number of total link on the page
Sign out from the page
 */

            }
        }
    }