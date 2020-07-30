package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page_pRACTICE {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

       //<input type="email" class="inputtext login_form_input_box" name="email"
        // id="email" data-testid="royal_email">
        WebElement emailTextBox=driver.findElement(By.cssSelector("input[id='email']"));//css=input[id='email']
        emailTextBox.sendKeys("testusername");

        //<input type="password" class="inputtext login_form_input_box" name="pass"
        // id="pass" data-testid="royal_pass">
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input#pass"));//css=input#pass
        passwordTextBox.sendKeys("testpassword");

        //locate teh login button
        //<input value="Log In" aria-label="Log In" data-testid="royal_login_button"
        // type="submit" id="u_0_b">
        //WebElement loginButton=driver.findElement(By.cssSelector("input#u_0_b"));
        //loginButton.click();

        //<input type="radio" class="_8esa" name="sex" value="1" id="u_0_6">
        //WebElement female=driver.findElement(By.cssSelector("input#u_0_6"));//input#u_0_6
        WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));

        //<input type="radio" class="_8esa" name="sex" value="2" id="u_0_7">
        //WebElement male=driver.findElement(By.cssSelector("input#u_0_7"));//css=input#u_0_7
        WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        male.click();

        //<input type="radio" class="_8esa" name="sex" value="-1" id="u_0_8">
        //WebElement custom=driver.findElement(By.cssSelector("input#u_0_8"));//input#u_0_8
        WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

        //Find the webelements of "Sign Up"
        //<h2 class="_8est">Sign Up</h2>
        WebElement signUp=driver.findElement(By.xpath("//h2[@class='_8est']"));
        System.out.println(signUp.getText());//"//h2[@class='_8eso _3ma']"

        //"Connect with friends and the world around you on Facebook."
        //<h2 class="_8eso _3ma">Connect with friends and the world around you on Facebook.</h2>
        WebElement friends= driver.findElement(By.xpath("//h2[@class='_8eso _3ma']"));
        System.out.println(friends.getText());

        //Locate and send text to "First name"=testfirstname
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text"
        // name="firstname" value="" aria-required="true" placeholder="" aria-label="First name"
        // id="u_0_m" aria-describedby="js_4m5" aria-invalid="true">
        WebElement firstName=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        firstName.sendKeys("testfirstname");//"//input[@id='u_0_o']"

        //Last name
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text"name="lastname"
        // value="" aria-required="true" placeholder="" aria-label="Last name" id="u_0_q">
        WebElement lastName=driver.findElement(By.xpath("//input[@id='u_0_q']"));
        lastName.sendKeys("testlastname");//input[@id='u_0_o']

        //"Mobiel number or email"
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text"
        // name="reg_email__" value="" aria-required="true" placeholder=""
        // aria-label="Mobile number or email" id="u_0_t">
        WebElement email=driver.findElement(By.xpath("//input[@id='u_0_t']"));
        email.sendKeys("test@gmail.com");//input[id='u_0_r']

        //"New Password"
        //<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password"
        // autocomplete="new-password" name="reg_passwd__" aria-required="true" placeholder=""
        // aria-label="New password" id="u_0_w">
        WebElement Password=driver.findElement(By.xpath("//input[@id='u_0_y']"));//input[@type='password']
        Password.sendKeys("testpassword");






    }
}
/*
Create a class : Face_Login_Page
1. go to https://www.facebook.com/
2. Test if below username and password is valid.
username="testusername"
password="testpassword"
Step 1. locate the username box
Step 2/ locate the password box
Step 3. locate teh signin button
Ste4 4. click on the sign in button
 */
/*
Using the same class
1.Find the webelements of
"Sign Up"
"Connect with friends and the world around you on Facebook."
2.Locate and send text to
"First name"=testfirstname
"Last name"=testlastname
"Mobiel number or email"=test@gmail.com
"New Password"=testpassword
 */