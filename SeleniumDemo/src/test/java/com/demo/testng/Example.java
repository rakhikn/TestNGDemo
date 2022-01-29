package com.demo.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example {
	WebDriver driver ;
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
		}
	

	@Test
	public void f() throws InterruptedException	
	{//Class name = ChromeDriver
		   driver = new ChromeDriver();
		 
		//Implement the method of web drive
		 
		 driver.get("https://www.gst.gov.in/");
		
		//Get the title and print it
		 System.out.println(driver.getTitle());
	
		 WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/ul/li/a"));
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
			//click on calender button
			 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/form[2]/div/div[1]/div/span[2]/span")).click();
			 System.out.println("Clicked on calendar");
			 Thread.sleep(3000);
		
			 
			//*[@id="dtp_5e56m"]/div/div[1]/div[3]/div[1]/div[1]/a/i
			  driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[3]/div[1]/div[1]/a/i")).click();
			 
			 System.out.println("Clicked on previous month");
			 Thread.sleep(3000);
			 
			
			 //check  weather clicked on expected month
			 String expectedmonth= driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[3]/div[1]/div[2]")).getText();
			 System.out.println("month"+expectedmonth);
			if(expectedmonth.equals("DECEMBER 2021"))
			{
				System.out.println("Clicked on December");
				
				 
				 WebElement calMain=driver.findElement(By.xpath(" /html/body/div[5]/div/div[1]/div[3]/div[1]/table/tbody"));
			     
			       List<WebElement> rows=calMain.findElements(By.tagName("tr"));
			     int total=rows.size();
			     
			     System.out.println("rows size:"+total);
			        //for(int i=0;i<total;i++)
			     monthIteration:
			       for(WebElement row: rows) 	
			        {
			        	 List<WebElement> tds=row.findElements(By.tagName("td"));
			        	 
			        	 for(WebElement td: tds)
			        	 {
			        	
			            if(td.getText().equalsIgnoreCase("01"))
			            {
			                td.click();
			                System.out.println("Date is selected for fromDate");
			                break monthIteration;
			            
			            }
			        	 
			        	 else
						    	System.out.println("01 date is not clicked ");
			        }}		
			}
			}
	@AfterMethod
	public void afterMethod() {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
	}