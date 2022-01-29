package com.junit.java;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Parameterized.class)
public class SearchGoogleTest {
    private String kyWrd1;
    private String kyWrd2;
    private String kyWrd3;
    WebDriver driver;   
    public SearchGoogleTest(String kyWrd1, String kyWrd2, String kyWrd3){
            this.kyWrd1 = kyWrd1;
            this.kyWrd2 = kyWrd2;
            this.kyWrd3 = kyWrd3;
              
    }
 
    @Before
    public void init(){
       //     searchGoogle = new SearchGoogle();
            }
    @Parameterized.Parameters
    public static Collection data(){
            return Arrays.asList(new Object[][]{{"Selenium","Delhi","Automation"},{"QTP","Bangalore","Manual"},{"LoadRunner","Chennai","cucumber"}});
    }   
    @Test
    public void testSearch(){
        System.out.println("----This is the beginning of our test----");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("----Let us start searching the keywords----");
        //Entering keyword in search box and searching it
        WebElement srchBox = driver.findElement(By.name("q"));
        srchBox.sendKeys(kyWrd1 + " " + kyWrd2 +" "+ kyWrd3+ "\n");
        //Printing the title of the new page
        String title = driver.getTitle();
        System.out.println("The title is : " +title);
        driver.quit();
    }
    
   
}