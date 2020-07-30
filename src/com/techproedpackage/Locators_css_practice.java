package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_css_practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //email text box
        //<input type="email" class="form-control" placeholder="Email"
        // data-test="email" name="session[email]" id="session_email">
       //WebElement emailBox= driver.findElement(By.cssSelector("input[type='email']"));
        //emailBox.sendKeys("testtechproed@gmail.com");
        WebElement emailBox=driver.findElement(By.xpath("//input[@type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");

        //password
        //<input class="form-control" placeholder="Password" data-test="password"
        // type="password" name="session[password]" id="session_password">
        //css=input[type='password']
        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys("Test1234!");
        //WebElement passwordBox = driver.findElement(By.xpath("//input[@id='session_password']"));
        //passwordBox.sendKeys("Test1234!");

        //sign in button
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary"
        // data-test="submit" data-disable-with="Sign in">
        WebElement signInButton=driver.findElement(By.cssSelector("input[type='submit']"));
        signInButton.click();
        //WebElement signInButton=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        //signInButton.click();

        //1. css = tagName[attribute name='value'];
        //2. css = "tagName#id value" or just css="#id value"
        //3. css = "tagName.class value" or just css=".class value"
        //css = input[type='email'] or css=input[class='form-control']
        //css = "input#session_email" or css="#session_email"
        //css = "input.form-control" or css=".form-control"

        /*
        What is the differences between xpath and css?
        Which one do you prefer to use? xpath or css?
1. xpath more common.(important)
2. sytaxes are different, but the logic is similar.
3. In your opinion, css is easier to write. In my framework, we are using css more.
4. css is faster (important). You may not even notice the diffences.
5. xpath may change based on the browser. It means, when your xpath works on chrome,
 it may not work on firefox. So if we are doing cross browser testing,
 then it is better to use css. (important)
         */



    }
}
/*
1) Create a class : Locators_css
2) Create main method and complete the following task.
a. When user goes to http://a.testaddressbook.com/sign_in
b. Locate the elements of email textbox,password textbox, and signin button
c. Enter below username and password then click sign in button
i. Username :  testtechproed@gmail.com
ii.Password : Test1234!
USE CSS SELECTOR TO LOCATE ELEMENTS
 */

/*
<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
1. css = tagName[attribute name='value’];
   css = input[type='email']   OR  css = input[class='form-control']
2. css="tagName#id value"      OR just css="#id value"  =>This works for id value only
   css="input#session_email"   OR      css="#session_email"
3.  css="tagName.class value" OR just css=".class value"=>This works for class value only
    css="input.form-control"  OR just css=".form-control"
 */