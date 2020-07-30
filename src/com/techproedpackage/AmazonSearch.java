package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.co.uk/");
        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        // autocomplete="off" placeholder="" class="nav-input" dir="auto" tabindex="9">
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();

        //4.Then click on "Best Sellers"
        WebElement bestSeller = driver.findElement(By.linkText("Best Sellers"));
        bestSeller.click();

        //5.Then click on first product
       //<div class="p13n-sc-truncated" aria-hidden="true" data-rows="4">
        // The Mirror and the Light (The Wolf Hall Trilogy)</div>
        WebElement product=driver.findElement(By.className("p13n-sc-truncated"));
        product.click();

        //6.Then print the first product name
        //<span id="productTitle" class="a-size-large">Slime: The new children’s book from No.
        // 1 bestselling author David Walliams.</span>
        WebElement firstProductTitle = driver.findElement(By.id("productTitle"));
        String firstProductName =firstProductTitle.getText();
        System.out.println("first product name is "+firstProductName);

        //Then click on "Add to Card" button
        //<input id="add-to-cart-button" name="submit.add-to-cart" title="Pre-order this item today"
        // data-hover="Select <b>__dims__</b> from the left<br> to add to Basket" class="a-button-input"
        // type="submit" value="Pre-order: Add to Basket" aria-labelledby="submit.add-to-cart-announce">
        WebElement addToCardButton=driver.findElement(By.id("add-to-cart-button"));
        addToCardButton.click();

        //8.Then verify the "Sing-In" text is visible. Use if-else statement to veryfy the expexted
        //text
        //<h1 class="a-spacing-small"> Sign-In </h1>

        WebElement signInText=driver.findElement(By.partialLinkText("Sign-In"));
        String actualSingInText=signInText.getText();
        String expectedSignInText="Sing-In";
        if (actualSingInText.equals(expectedSignInText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("EXPECTED SIGN IN IS: "+expectedSignInText);
            System.out.println("ACTUAL SIGN IN IS: "+actualSingInText);
            System.out.println("ACTUAL SIGN IN IS: "+actualSingInText);
        }








    }
}


