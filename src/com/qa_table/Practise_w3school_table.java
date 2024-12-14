package com.qa_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_w3school_table
{

	public static void main(String[] args) throws Throwable 

	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);

		WebElement table = driver.findElement(By.id("customers"));
         //String tabaledata=table.getText();
         //System.out.println(tabaledata);
         
		//get allrow in tabel only 
		List<WebElement> row=table.findElements(By.tagName("tr"));
		Thread.sleep(2000);
		System.out.println("No of rows :-" +row.size()); 
		
		//iterate all rowcolmn data
		for (WebElement eachrow : row) 
		{
			List<WebElement> column=eachrow.findElements(By.tagName("td")); //in row only col are present
			Thread.sleep(2000);
			//all col data
			for (WebElement eachcol : column)
			{
				 String columndata=eachcol.getText();
				 System.out.println(columndata+"\n");
				
			}
			System.out.println("");
			System.out.println("=========================="); //pritn line before it goes to 2 row

		}
		
		Thread.sleep(2000);
		driver.close();

	}


}
