package com.qa.data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_CollectionofLink {
	
	//count no of link in any webapge 

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	      //launch url
	     driver.get("https://www.google.com/");
	     Thread.sleep(4000);
	     
	     //get colelction of links in a webpage stored into html tag so will  use ehre list colelction
	     List<WebElement> Links = driver.findElements(By.tagName("a"));
	     //will print no of links
	     System.out.println("No of links in webpage   "+Links.size()); //11
	     
	  /*   //get name of all link
	     for (WebElement linkname : Links)  //will get all link nameone ny one
	     {
		
	    	String names= linkname.getText() ;
	        System.out.println(names);
		 }
	     
	 */
	     for(int i=0 ;i<Links.size();i++)
	     {
	    	 String names=Links.get(i).getText();
	    	 System.out.println(names);
	     }
	     
	     driver.quit();
	     
	   

	}

}
