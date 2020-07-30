package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;

public class Locators_xpath_practice {
    //Create main method and complete the following task.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //<input type="email" class="form-control" placeholder="Email"
        // data-test="email" name="session[email]" id="session_email">
        //Locate the email textbox by absolue xpath
        //This is absolue xpath: html/body/div/div/div/div/form/div[1]/input
        WebElement emailBox=driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailBox.sendKeys("testtechproed@gmail.com");


        //<input type="email" class="form-control" placeholder="Email" data-test="email"
        // name="session[email]" id="session_email">
        // Relative xpath: //tag[@attribute='value'];
        // tag name= input
        // attribute= type, class, placeholder, data-test, name, id
        //  //input[@type='email'];
        //  //input[@class='form-control'];
        //  //input[@placeholder='Email'];
        //  //input[@data-test='email'];
        //  //input[@name='session[email]'];
        //  //input[@id='session_email'];

         // Locate the password textbox by relative xpath
        WebElement passwordText=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        passwordText.sendKeys("Test1234!");

        //Locate the sing in button
        WebElement signInButton=driver.findElement(By.xpath("//input[@type='submit']"));
        signInButton.click();

        //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>
        //span[@class='navbar-text'];

        WebElement id = driver.findElement(By.xpath("//span[@class='navbar-text']"));
        System.out.println("ID : "+id.getText());

        //tagname[.='text name']; => certain tag, any attibute, certain exact text with space and all.
        //Example : //span[.='testtechproed@gmail.com']

        //<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
        //a[.='Addresses']

        //*[.='testtechproed@gmail.com']

        //4. //*[(text()='exact text with extra space and all')]; =>give me certain text on the page
        //Example: //*[(text()='testtechproed@gmail.com')]

        //5.//*[contains(text(),'piece of text')];
        //Example: //*[contains(text(),'testtechproed@gmail.com')]







    }
}
/*
1) Create a class : Locators_xpath
2) Create main method and complete the following task.
a) When user goes to http://a.testaddressbook.com/sign_in
b) Locate the elements of email textbox,password textbox, and signin button
c) Enter below username and password then click sign in button
    i.  Username :  testtechproed@gmail.com
    ii. Password : Test1234!
d) Then verify that the expected user id  testtechproed@gmail.com
e) Verify the Addresses and Sign Out  texts are displayed
f) Find the number of total link on the page
g) Sign out from the page
 */
/*
3/25/2020
Day 4: Locators_xpath intro
1. Absolute xpath: We start from teh root element. We have to go from parent to child in each step. We use /. This os not common. Prefer to use relative xpath since it short.
html/body/div/div/div/div/form/div[1]/input
This is absolute xpath for the email textbox. So we now can use the locator to find this element.
WebElement emailBox=driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
===========================================================
2. Relative xpath: When we are finding the relative xpath, we can start from any element in teh middle. So we don't have to start from the root element. We use //. Use relative xpath over absolute xpath.
1. //tag[@attibute='value'];=>certain tag, certain attibute, certain atribute value
value should be in ' ', not " "
<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
tag name  =input
attrute   =id, type, class, placeholder, data-test, name
//input[@type='email'];
//input[@class='form-control'];
//input[@placeholder='Email'];
//input[@data-test='email'];
//input[@name='session[email]'];
//input[@id='session_email'];
=========================
Finding name of Id using xpath
<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>
tagname   = span
attribute = class with value of navbar-text, data-test with value of current-user
xpath = //span[@class='navbar-text']; or xpath = //span[@data-test='current-user'];
driver.findElement(By.xpath("//span[@class='navbar-text']"));
=========================
2. //tagname[.='text name']; => certain tag, any attibute, certain exact text with space and all.
Example : //span[.='testtechproed@gmail.com']
=========================
3.//*[.='text name']; => any tag, any attribute, certain exact text with space and all.
Example : //*[.='testtechproed@gmail.com'];
=========================
4. //*[(text()='exact text with extra space and all')]; =>give me certain text on the page
Example: //*[(text()='testtechproed@gmail.com')]
=========================
5.//*[contains(text(),'piece of text')];
Example: //*[contains(text(),'testtechproed@gmail.com')]
 OR
//*[contains(text(),'chproed@gmail.com')]
 OR
//*[contains(text(),'techproed@gmail.c')]
=======================
6.//tag[@attribute1='value 1' or @attribute2='value2'] => Either first attribute-value pair must be correct, OR, second attribute-value pair must be correct OR both attribute-value pair must be correct
Example: //span[@class='navbar-text' or @attribute2='value2']
OR //span[@attribute1='value 1' or @data-test='current-user']
OR //span[@class='navbar-text' or @data-test='current-user']
 */