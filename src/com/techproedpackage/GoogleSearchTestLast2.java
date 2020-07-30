package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class GoogleSearchTestLast2 {
    public static void main(String[] args){
    System.setProperty("webdriver.chromedriver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();
        WebElement searchResult = driver.findElement(By.id("result-stats"));
        System.out.println("Result "+searchResult.getText());

    }
}
/*Create a new class : GoogleSeachTest
        Create main method and complete the following task.
        When user goes to https://www.google.com/
        Search for “porcelain teapot”
        And print how many related results displayed on Google
        And click on Shopping
        Then click on the first result
        Then when user click on the first “Visit site” link
        Then the link should open*/

/*
<input class="gLFyf gsfi" maxlength="2048" name="q" type="text"
jsaction="paste:puy29d" aria-autocomplete="both" aria-haspopup="false"
autocapitalize="off" autocomplete="off" autocorrect="off" autofocus=""
role="combobox" spellcheck="false" title="Ara" value="" aria-label="Ara"
data-ved="0ahUKEwiD-q-PvrDoAhUH2KQKHRyDC5IQ39UDCAQ">
 */

/*
<div id="result-stats">Yaklaşık 51.200.000 sonuç bulundu<nobr>
(0,54 saniye)&nbsp;</nobr></div>
 */