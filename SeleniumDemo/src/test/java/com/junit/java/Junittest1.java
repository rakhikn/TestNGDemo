package com.junit.java;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junittest1 {
 
 WebDriver driver = null;

 @Test
 public void test() throws InterruptedException {
	//Class name = ChromeDriver
	   driver = new ChromeDriver();

	 driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
  driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest1 executed");
  Thread.sleep(2000);
  System.out.print("junittest1 class is executed");
  driver.quit();
 }
}