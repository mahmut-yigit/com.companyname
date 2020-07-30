package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_xpath {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //Locate the email textbox by absolute xpath
        WebElement emailBox=driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailBox.sendKeys("testtechproed@gmail.com");

        //Locate the password textbox by relative xpath
        WebElement passwordText=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        passwordText.sendKeys("Test1234!");

        //Locate the sing in button
        WebElement signInButton=driver.findElement(By.xpath("//input[@type='submit']"));
        signInButton.click();

        //locating the id
        WebElement id=driver.findElement(By.xpath("//span[@class='navbar-text']"));
        System.out.println("ID : "+id.getText());

    }
}
/*
Create a class : Locators_xpath
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
/*
Create a class : Locators_xpath
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