package com.demo.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	 ChromeDriver  driver;
  @Test
  public void f() throws Exception {
	    driver = new ChromeDriver();
		 
		//Implement the method of web drive
		 
		 driver.get("https://www.gst.gov.in/"); WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/ul/li/a"));
		 element.click();
		 System.out.println("clicked on login");
		 Thread.sleep(5000);
		 driver.findElement(By.id("username")).sendKeys("rishi_fftcs");
		 System.out.println("Entered Username");
		 driver.findElement(By.id("user_pass")).sendKeys("BittuRishu@2530");
		 System.out.println("Entered pasword");
		 Thread.sleep(20000);
		 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div/div/div/form/div[6]/div/button")).click();
		 System.out.println("clicked on login");
		 
		 Thread.sleep(5000);
		
		 
	  
  }
  @BeforeClass
  public void beforeMethod() throws InterruptedException { 
	  driver.findElement(By.xpath("//*[@id=\"adhrtableV\"]/div/div/div[2]/a[2]")).click();
		 String alertText=driver.findElement(By.xpath("//*[@id=\"adhrtableV\"]/div/div/div[2]/a[2]")).getText();
		 System.out.println("print alert message :"+alertText);
		 
		 System.out.println("Clicked on remind me later alert");
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/a")).click();
			 System.out.println("Clicked on Services");
			
			 //RETURNS MOUSEHOVER ACTION
			 WebElement ele = driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/ul/li[4]/a"));

			//Creating object of an Actions class
			Actions action = new Actions(driver);

			//Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			System.out.println("MOUSE HOVERS on Returns");
			driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/ul/li[4]/ul/li[3]/a")).click();
			 System.out.println("Clicked on TRACK STATUS");
			 
			// RETURNFILING PERIOD=/html/body/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/label[2]
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/label[2]")).click();
			 System.out.println("Clicked on radio button Return Filing Period");
			 Thread.sleep(3000);
			
			 
			//working with calendar
		        WebElement cal=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/form[2]/div/div[1]/div/span[2]/span"));
		        cal.click();
		        System.out.println("clicked on calender for Todate");
		        Thread.sleep(4000);
		        
		       //previous month
		        WebElement previousMonth=driver.findElement(By.xpath(" /html/body/div[5]/div/div[1]/div[3]/div[1]/div[1]/a"));
			    
		        previousMonth.click();
		        System.out.println("CLICKED ON PREVIOUS MONTH");
		        Thread.sleep(4000);
		        
		        
		        WebElement compareMonth= driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[3]/div[1]/div[2]"));
		      String getMonth=compareMonth.getText();
		      System.out.println("get comparemonth"+ getMonth);
		        
		    
	  
  }

   @AfterClass
  public void afterClass() {
	   
	   
  }
   

  
}
