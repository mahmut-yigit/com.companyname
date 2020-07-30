package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton_Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //Check all teh checkbox if it is checked or uncheck

        // xpath=//input[@type='checkbox'][1]
        //checkbox1   <input type="checkbox"> css=input[type='checkbox']
        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        if(!checkbox1.isSelected()){
            checkbox1.click();
        }else {
            System.out.println("Already checkbox is checked");
        }
        //checkbox2  <input type="checkbox"> css=input[type='checkbox']
        WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }else{
            System.out.println("Already selected");
        }

    }
}
/*
Create a class : CheckBox_RadioButton
Create main method and complete the following task.
Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes
Then click on checkbox1 if box is not selected
Then click on checkbox2 if box is not selected
 */