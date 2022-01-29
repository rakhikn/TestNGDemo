package com.demo.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GstTrackReturnStatus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Create driver object for chrome browser
				//Class name = ChromeDriver
				 ChromeDriver  driver = new ChromeDriver();
				 
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
				        
				       
				       if (getMonth .equals("DECEMBER 2021"))
					    {
				        	   
					    	 System.out.println("clicked on DECEMBER 2021");
					    
					      
				        
				        
				     WebElement calMain=driver.findElement(By.xpath(" /html/body/div[5]/div/div[1]/div[3]/div[1]/table/tbody"));
				     
				       List<WebElement> rows=calMain.findElements(By.tagName("tr"));
				     int total=rows.size();
				     
				     System.out.println("rows size:"+total);
				        //for(int i=0;i<total;i++)
				       for(WebElement row: rows) 	
				        {
				        	 List<WebElement> tds=row.findElements(By.tagName("td"));
				        	 
				        	 for(WebElement td: tds)
				        	 {
				        	
				            if(td.getText().equalsIgnoreCase("01"))
				            {
				                td.click();
				      System.out.println("Date is selected for fromDate");
				                break;
				            
				            }
				        	 
				        
				        	 else
							    	System.out.println("DECEMBER 2021 is not clicked ");
				        }}		
				        
				       WebElement cal1=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/form[2]/div/div[2]/div/span[2]/span"));
				        cal1.click();
				        System.out.println("clicked on calender for TODATE ");
				        Thread.sleep(4000);
				        WebElement calToDate=driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[3]/div[1]/table/tbody"));
					       
				       List<WebElement> rows1=calToDate.findElements(By.tagName("tr"));
				     int total1=rows1.size();
				     System.out.println("rows size:"+total1);
				        //for(int i=0;i<total;i++)
				       for(WebElement row: rows1) 	
				        {
				        	 List<WebElement> tds=row.findElements(By.tagName("td"));
				        	 
				        	 for(WebElement td: tds)
				        	 {
				        	
						      
				            if(td.getText().equalsIgnoreCase("08"))
				            {
				                td.click();
				      System.out.println("Date is selected for ToDate");
				                break;
				            }
				         
				            
				        }
				        }
				        Thread.sleep(10000);
			            WebElement search=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/form[2]/div/div[3]/button"));
				        search.click();
				        System.out.println("clicked on search BUTTON ");
				        Thread.sleep(4000);
				        
					    
				        WebElement statusTable=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div/table/tbody"));
				        List<WebElement> statusRows=statusTable.findElements(By.tagName("tr"));
					     int statusRowsSize=statusRows.size();
					     System.out.println("rows size:"+statusRowsSize);
					     
				        for(int i=1;i<=statusRowsSize;i++) {
				        	
				        	if(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div[1]/div/table/tbody/tr["+i+"]/td[6]")).getText().equals("Filed"))
				        	{
				        		System.out.println("Returns Filing Done");
				        	}
				        	else {
				        		System.out.println("Returns Filing not Done");
				        	}
				        	
				        }
				     
	
	}

	
	}
}
