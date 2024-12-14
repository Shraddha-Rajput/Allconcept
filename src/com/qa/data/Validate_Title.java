package com.qa.data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Title 
{

	public static void main(String[] args) throws Throwable
	
	{
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    
    WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     
      //launch url
     driver.get("https://www.google.com/");
     
     Thread.sleep(5000);
     
     //Verify expected title with actual title
     
     String expected_title= "Yahoo";
     String actual_title= driver.getTitle(); 
    
    if(expected_title.equalsIgnoreCase(actual_title))
    {
    	
    	System.out.println("  Title is matching  "  +expected_title+  " match "   +actual_title  );
    	//expected value holding the value of the title
    }

    else
    {
    	
    	System.out.println(" Title is not matching " +expected_title+  " not match  "   +actual_title );
    	
    }
    
    driver.quit();
	}

}
