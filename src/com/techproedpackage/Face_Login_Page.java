package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //<input type="email" class="inputtext login_form_input_box"
        // name="email" id="email" data-testid="royal_email">
        //driver.get("https://www.facebook.com/");

        //locating email box using css locator
        WebElement emailTextbox=driver.findElement(By.cssSelector("input#email"));
        emailTextbox.sendKeys("testusername");

        //locating pass box using css locator
        WebElement passwordTextbox=driver.findElement(By.cssSelector("input#pass"));
        passwordTextbox.sendKeys("testuserpass");
        //locating teh login button
//        WebElement loginButton=driver.findElement(By.cssSelector("input#u_0_b"));
//        loginButton.click();

        //Locate the radio buttons for all of them
//On radio buttons, we can only pick one option
        WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        male.click();
        WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

        //        Using the same class
//        1.Find the webelements of
//        "Sign Up"
//        "Connect with friends and the world around you on Facebook."
//        2.Locate and send text to
//        "First name"=testfirstname
//        "Last name"=testlastname
//        "Mobiel number or email"=test@gmail.com
//        "New Password"=testpassword

       //<h2 class="_8est">Sign Up</h2>   //tag[@attibute='value']  h2[@class='_8est']
       WebElement signUp=driver.findElement(By.xpath("//h2[@class='_8est']"));
       System.out.println(signUp.getText());

        //tag[@attibute='value']  h2[@class='_8eso _3ma']
       //<h2 class="_8eso _3ma">Connect with friends and the world around you on Facebook.</h2>
        // WebElement signUp=driver.findElement(By.cssSelector("h2._8est"));
        WebElement friends=driver.findElement(By.xpath("//h2[@class='_8eso _3ma']"));
        System.out.println(friends.getText());

        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" //input[@type='text']
        // name="firstname" value="" aria-required="true" placeholder="" aria-label="First name" id="u_0_o">

        WebElement firstName = driver.findElement(By.xpath("//input[@id='u_0_o']"));//input[@id='u_0_o']
        //WebElement firstName =driver.findElement(By.cssSelector("input#u_0_o"));
        firstName.sendKeys("testfirstname");

        // <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text"
        // name="lastname" value="" aria-required="true" placeholder=""
        // aria-label="Last name" id="u_0_q">

        WebElement lastName = driver.findElement(By.xpath("//input[@id='u_0_q']")); //input[@type='text']
        //WebElement lastName=driver.findElement(By.cssSelector("input#u_0_q")); //input[@id='u_0_q']
        lastName.sendKeys("testlastname");

        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text"
        // name="reg_email__" value="" aria-required="true" placeholder=""
        // aria-label="Mobile number or email" id="u_0_t">

        WebElement email=driver.findElement(By.xpath("//input[@id='u_0_t']"));   //input[@id='u_0_t']
       // WebElement email=driver.findElement(By.cssSelector("input#u_0_t"));
        email.sendKeys("test@gmail.com");

        //<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password"
        // autocomplete="new-password" name="reg_passwd__" aria-required="true" placeholder=""
        // aria-label="New password" id="u_0_y">

        WebElement password=driver.findElement(By.xpath("//input[@id='u_0_y']"));  //input[@type='password']
        //WebElement password=driver.findElement(By.cssSelector("input#u_0_y"));
        password.sendKeys("testpassword"); //input[@id='u_0_y']







    }
}

/*Create a class : Face_Login_Page
1. go to https://www.facebook.com/
2. Test if below username and password is valid.
username="testusername"
password="testpassword"
Step 1. locate the username box
Step 2/ locate the password box
Step 3. locate teh signin button
Ste4 4. click on the sign in button*/



/*Using the same class
1.Find the webelements of
"Sign Up"
"Connect with friends and the world around you on Facebook."
2.Locate and send text to
"First name"=testfirstname
"Last name"=testlastname
"Mobiel number or email"=test@gmail.com
"New Password"=testpassword*/


