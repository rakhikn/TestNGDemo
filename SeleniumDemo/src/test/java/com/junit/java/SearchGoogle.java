package com.junit.java;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SearchGoogle {
  
    WebDriver driver;   
    @Test
    public void searchKeys(String kyWrd, String kyWrd1){
            System.out.println("----This is the beginning of our test----");
            driver = new ChromeDriver();
    driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            System.out.println("----Let us start searching the keywords----");
            //Entering keyword in search box and searching it
            WebElement srchBox = driver.findElement(By.name("q"));
            srchBox.sendKeys(kyWrd + " " + kyWrd1 + "\n");
            //Printing the title of the new page
            String title = driver.getTitle();
            System.out.println("The title is : " +title);
            driver.quit();
    }
  }


