package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //Check all teh checkbox if it is checked or uncheck
        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        //isSelected() method returns true if box is selected. It returns false, if box is not selected
        if (!checkbox1.isSelected()){//the first checkbox is not selected=>true
            checkbox1.click();
        }else{
            System.out.println("Already checkbox1 is Checked");
        }
        WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (!checkbox2.isSelected()){//checkbox 2 is not selected=>false
            checkbox2.click();
        }else {
            System.out.println("Already checkbox 2 is selected");
        }

    }
}

/*Create a class : CheckBox_RadioButton
Create main method and complete the following task.
Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes
Then click on checkbox1 if box is not selected
Then click on checkbox2 if box is not selected */
