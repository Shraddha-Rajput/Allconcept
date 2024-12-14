package com.qa_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Basic_Xpath
{
	//get specific row data column and print them
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(2000);
		
		//scehem and returns two columns in nutulfunds  in 1 colum icic name  2column 98
		//row will be fix(3) , column wil be change
		//getTExt will use to retrive visbledata
		String table1=  driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[1]")).getText();
		String table2=  driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[2]")).getText();

		System.out.println(table1);
		System.out.println(table2);
		
		System.out.println(table1+   " "+  table2);  //in same line will get both value of single row
		

		
		
		
	}

}
