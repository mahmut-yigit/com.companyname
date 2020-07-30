package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        System.out.println("RESULT : "+searchResult.getText());

        //Clicking on Shopping
        driver.findElement(By.partialLinkText("Shopping")).click();
        //Or I can use below combination
//        WebElement shopping=driver.findElement(By.partialLinkText("Shopping"));
//        shopping.click();
        driver.findElement(By.className("xsRis")).click();

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

//<div id="result-stats">Yaklaşık 46.900.000 sonuç bulundu<nobr>
//(0,43 saniye)&nbsp;</nobr></div>

/*
<a class="q qs" href="/search?q=porcelain+teapot&amp;rlz=1C1PDZP_en-gbGR810GR815&amp;
sxsrf=ALeKk015dDbxrrTiiX5S2l1h9JcDG9dOoA:1584908295350&amp;source=lnms&amp;
tbm=shop&amp;sa=X&amp;ved=2ahUKEwjUmsi_867oAhXSYMAKHUI3CTAQ_AUoAnoECA0QBA">
<span class="HF9Klc iJddsb" style="height:16px;width:16px"><svg focusable="false"
viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path
d="M21.11 2.89A3.02 3.02 0 0 0 18.95 2h-5.8c-.81 0-1.58.31-2.16.89L7.25 6.63 2.9
10.98a3.06 3.06 0 0 0 0 4.32l5.79 5.8a3.05 3.05 0 0 0 4.32.01l8.09-8.1c.58-.58.9-
1.34.9-2.16v-5.8c0-.81-.32-1.59-.89-2.16zM20 10.85c0 .28-.12.54-.32.74l-3.73 3.74-
4.36 4.36c-.41.41-1.08.41-1.49 0l-2.89-2.9-2.9-2.9a1.06 1.06 0 0 1 0-1.49l8.1-8.1c.2-
.2.46-.3.74-.3l5.8-.01A1.05 1.05 0 0 1 20 5.05v5.8zM16 6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.
9-2-2 .9-2 2-2z"></path></svg></span>Alışveriş</a>
 */