package com.techproedpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearchTestLast {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();
        WebElement searchResult = driver.findElement(By.id("result-stats"));
        System.out.println("RESULT : " + searchResult.getText());
        //Clicking on Shopping
        driver.findElement(By.partialLinkText("Shopping")).click();
        //Or I can use below combination
//        WebElement shopping=driver.findElement(By.partialLinkText("Shopping"));
//        shopping.click();
        driver.findElement(By.className("xsRiS")).click();
    }
}