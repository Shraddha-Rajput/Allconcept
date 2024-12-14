package com.qa_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_table_Exist
{

	public static void main(String[] args) throws Throwable 
	
	{
		
		String expectedcountry="Italy";
		boolean presentitem= false;
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			Thread.sleep(2000);
			
		  WebElement completetable=driver.findElement(By.id("customers"));//first storing entoire taable  into wenelemn
			
		   List<WebElement>eachcell=completetable.findElements(By.tagName("tr"));
			System.out.println("NO OF ROWS" +eachcell.size());   //necceassry to use size method
			
			//iteraate allcolumn presen tin row use foreach
			
			for (WebElement row : eachcell) //
			
		  {
				List<WebElement>eachcolumn=row.findElements(By.tagName("td"));
				for (WebElement  column: eachcolumn) //thi sloop is just verifying table
				
				{
					String  actualtext =column.getText();
					System.out.println(actualtext  +"\n"); //printing all col
				
				 if(actualtext.equalsIgnoreCase(expectedcountry))  //check karega equal						
					{
						presentitem= true; 
						break;
					}
				}	//afte rthis loop will print
				
				   System.out.println("");
					System.out.println("==========================");
				
       }
			//will verify complelet tabel 
				if(presentitem) //true  ///afte rveirfy comaplte table only we wnat this to check
				{
					System.out.println(expectedcountry +"  " +"Item present in the county");
					
				}
				
				else
				{
					System.out.println(expectedcountry +"   " +"Item not present in the country");

				}
							
			Thread.sleep(2000);
			driver.close();
			
	}
} 


/*
 
 Checiking in each row of the column wheteht italy is present in county col o rnot
 *Italy   Item not present in the country  1 row
Italy   Item not present in the country    2.
Italy   Item not present in the country     3
Italy   Item not present in the country    4 rw
Italy   Item not present in the country    5
Italy   Item not present in the country    6
Italy  Item present in the county          7 row
 */
