package com.qa_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Webtable_2 
{
//print 1 row  1 column and 2 column .here will use inside maain(row)foreach loop wil use 2for loop for column for loo
	 
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(2000);
		
		// Store complete table  in WebEmeent object
		WebElement completeTable = driver.findElement(By.className("dataTable"));

		
		//get all rows
		List<WebElement>rows =completeTable.findElements(By.tagName("tr")); // rw colelction holdign all rows(table ame search kargea tr )
		System.out.println("NO  OF ROWs" +rows.size());
		
		
		for (WebElement eachrow : rows) //get each row column date 
		
		{   //iterate alll colum
			    List<WebElement> column = eachrow.findElements(By.tagName("td")); //us row mae 1 col store column colection
			     for (WebElement eachcolumn : column)
				
				{    //print every column data
					 String columndata =eachcolumn.getText();
					 System.out.println(columndata+"\n"); // giving next liine after 1 column single row use "\n"
					
				}
		
					 System.out.println();
					 //System.out.println("===========================");

			
	}
		Thread.sleep(2000);
		driver.close();
		     
		     
	}

}

/*
 outplut
 
NO  OF ROWs26
 firt row first colum-Aditya Birla Sun Life PSU Equity Fund Schme-Direct plan
 first row 2 column is value -Return-99.76

     Nippon India CPSE ETF - Growth - Regular Plan
107.54
*/