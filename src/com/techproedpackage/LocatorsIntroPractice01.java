package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntroPractice01 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
//<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailTexbox=driver.findElement(By.id("session_email"));
        emailTexbox.sendKeys("testtechproed@gmail.com");
        WebElement passwordTextbox=driver.findElement(By.id("session_password"));
//<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]"
// id="session_password">
        passwordTextbox.sendKeys("Test1234!");
//<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement singInButon=driver.findElement(By.name("commit"));
        singInButon.click();
//<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>
        WebElement userId = driver.findElement(By.className("navbar-text"));
        System.out.println("USER ID WEBELEMENT: "+userId);
        String actualUserId=userId.getText();
        System.out.println("USER ID TEXT: "+actualUserId);
        String expectedUserID="testtechproed@gmail.com";

        if (actualUserId.equals(expectedUserID)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ID IS: "+actualUserId);
            System.out.println("EXPECTED ID IS: "+expectedUserID);
        }
//Verify the Addresses and Sign Out  texts are displayed
        //By.linkText(); method will work for links only.
//<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
        WebElement addressLink=driver.findElement(By.linkText("Addresses"));
        String actualAddressLink=addressLink.getText();
        String expextedAddressLink="Addresses";
        if (actualAddressLink.equals(expextedAddressLink)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ADDRESS LINK IS: "+actualAddressLink);
            System.out.println("EXPECTED ADDRESS LINK IS: "+expextedAddressLink);
        }
        //Checking if Sign Out text is displayed as expected.
        String expectedSignout = "Sign Out";
        //String actualSignout = driver.findElement(By.linkText("Sign out")).getText();
// <a class="nav-item nav-link" data-test="sign-out" rel="nofollow" data-method="delete" href="/sign_out">Sign out</a>
        WebElement signOutElement=driver.findElement(By.linkText("Sign out"));
        String actualSignout=signOutElement.getText();
        if (actualSignout.equals(expectedSignout)){
            System.out.println("PASS: "+actualSignout);
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TEXT IS "+actualSignout);
            System.out.println("EXPEXTED TEXT IS "+expectedSignout);
        }
        //Find the number of total link on the page
        List<WebElement> listOfLinkElements=driver.findElements(By.tagName("a"));
        System.out.println("There are "+listOfLinkElements.size()+"links on the page");

        System.out.println("The first webelement : "+listOfLinkElements.get(0));
        System.out.println("The first text: "+listOfLinkElements.get(0));

        System.out.println("The second text: "+listOfLinkElements.get(1).getText());

        System.out.println("The third text: "+listOfLinkElements.get(2).getText());

        for (WebElement element:listOfLinkElements){
            System.out.println(element.getText());
        }
        //Print Addresses and Sign out link using partialLinkText
        WebElement addressByPartialLinkText=driver.findElement(By.partialLinkText("dresse"));
        String addressStringByPartialLinkText=addressByPartialLinkText.getText();
        System.out.println("Address by partial linktext: "+addressStringByPartialLinkText);

        //Sign out from the page
        //WebElement signOutElement=driver.findElement(By.linkText("Sign out"));
        signOutElement.click();
    }
}
