package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchAhmetBy {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//    •3.Search for “porcelain teapot”
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();
//    •4.Then click on "Best Sellers"
        WebElement bestSeller = driver.findElement(By.linkText("Best Sellers"));
        bestSeller.click();
//    •5.Then print how many starts the first product have
//    WebElement stars = driver.findElement(By.name("a-size-small a-link-normal"));                  // Sir I can not do this
//   System.out.println(stars.getText());
//    •5.Then click on first product
        WebElement firstProduct = driver.findElement(By.linkText("The Mirror and the Light (The Wolf Hall Trilogy)"));
        firstProduct.click();
//    •6.Then print the first product name
        WebElement firstProductTitle = driver.findElement(By.id("productTitle"));
        //System.out.println(firstProductTitle);                                                //Sir here i can not do this part without String .
        String firstProductName = firstProductTitle.getText();
        System.out.println("First product name: "+firstProductName);
//    •7.Then click on "Add to Card" button
        WebElement addToCardButton = driver.findElement(By.id("buy-now-button"));
        addToCardButton.click();
//    •8.Then verify the "Sing-In" text is visible. Use if-else statement to veryfy the    expexted tex
        WebElement actualSignIntext = driver.findElement(By.linkText(""));                      //Sir i couldn.t find Sing in element and i dont know that how i can find
        String actualStringSignIntext = actualSignIntext.getText();




    }
}