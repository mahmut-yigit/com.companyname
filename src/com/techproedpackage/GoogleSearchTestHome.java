package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTestHome {
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();
        WebElement searchResult = driver.findElement(By.id("result-stats"));
        System.out.println("RESULT: "+searchResult.getText());
        //Clicking on Shopping
        driver.findElement(By.partialLinkText("Shopping")).click();
        //Or I can use below combination
       //WebElement shoping = driver.findElement(By.partialLinkText("Shopping"));
        //shopping click;
        driver.findElement(By.className("HF9Klc iJddsb")).click();
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
<input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d" aria-autocomplete="both"
aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox"
spellcheck="false" title="Αναζήτηση" value="" aria-label="Αναζήτηση" data-ved="0ahUKEwiX8IHLm7DoAhWoxYUKHQ4yBSgQ39UDCAQ">
 */
/*
<div id="result-stats">Περίπου 71.900.000 αποτελέσματα<nobr> (0,61 δευτερόλεπτα)&nbsp;</nobr></div>
 */
/*
<div class="hdtb-mitem hdtb-msel hdtb-imb" aria-hidden="true"><span class="HF9Klc iJddsb" style="height:16px;width:16px"><svg focusable="false" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path d="M8.65 8.04l-1.4-1.41 3.74-3.74c.58-.58 1.35-.89 2.16-.89h5.8c.82 0 1.58.31 2.16.89L19.69 4.3c-.2-.2-.47-.31-.74-.31l-5.8.01c-.28 0-.54.1-.74.3L8.65 8.04z" fill="#EA4335"></path><path d="M5.8 18.2l-2.9-2.9c-1.19-1.19-1.19-3.12 0-4.32l4.36-4.36 1.4 1.41-4.35 4.37c-.41.41-.41 1.08 0 1.49l2.9 2.9L5.8 18.2z" fill="#FBBC04"></path><path d="M21.11 2.89L19.69 4.3c.21.21.31.48.31.75v5.8c0 .28-.12.54-.32.74l-3.73 3.74-4.36 4.36c-.41.41-1.08.41-1.49 0l-2.89-2.9L5.8 18.2l2.89 2.9c.6.6 1.38.9 2.16.9.78 0 1.56-.29 2.16-.89l4.36-4.36 3.73-3.74c.58-.58.9-1.34.9-2.16v-5.8c0-.81-.32-1.59-.89-2.16z" fill="#4285F4"></path><circle cx="16" cy="8" fill="#34A853" r="2"></circle></svg></span>Αγορές</div>
 */
