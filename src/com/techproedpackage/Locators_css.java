package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_css {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailBox=driver.findElement(By.cssSelector("input[type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordBox=driver.findElement(By.cssSelector("input[id='session_password']"));
        passwordBox.sendKeys("Test1234!");
        WebElement signinButton=driver.findElement(By.cssSelector("input[name='commit']"));
        signinButton.click();

    }
}

/*Create a class : Locators_css
Create main method and complete the following task.
When user goes to http://a.testaddressbook.com/sign_in
Locate the elements of email textbox,password textbox, and signin button
Enter below username and password then click sign in button
Username :  testtechproed@gmail.com
Password : Test1234!
USE CSS SELECTOR TO LOCATE ELEMENTS*/

/*
css = tagName[attribute name='value’']
driver.findElement(By.cssSelector("input[name='session[email]']"));
css="tagName#id value" or just css="#id value"=>This works for id value only
driver.findElement(By.cssSelector("input#session_email"));
css="tagName.class value" or just css=".class value"=>This works for class value only
driver.findElement(By.cssSelector("input.form-control"));
 */