package com.junit.java;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

 
public class JUnitAnnotations {
 
    int a=10;
    int b=5;
    Object c;
    
    
    @BeforeClass
    public static void SetUpClass()
    {
            //Initialization code goes here
            System.out.println("This is @BeforeClass annotation");
    }
 
    
    @Before
    public void SetUp()
    {   
            // Setting up the test environment
            System.out.println("This is @Before annotation");
    }
 
    
    @Test
    public void Addition()
    {   
            c= a+b;
            assertEquals(15,c);
            System.out.println("This is first @Test annotation method= " +c);
    }
 /***   @Test
    public void Multiplication()
    {   
            c=a*b;
            assertEquals(50,c);
            System.out.println("This is second @Test annotation method= " +c);
    }
   ***/ 
    
    @After
    public void TearDown()
    {
            // Cleaning up the test environment
            c= null;
            System.out.println("This is @After annotation");
    }
 
    
    @AfterClass
    public static void TearDownClass()
    {
            //Release your resources here
            System.out.println("This is @AfterClass annotation");
    }
    
    @Ignore
    public void IgnoreMessage()
    {
       String info = "JUnit Annotation Blog" ;
       assertEquals(info,"JUnit Annotation Blog");
       System.out.println("This is @Ignore annotation");
    }
   
 
}  