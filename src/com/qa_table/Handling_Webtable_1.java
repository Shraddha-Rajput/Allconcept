package com.qa_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Webtable_1 
{
	//get collection of all rows and size of row in a table
	//get collection of all column in a table 

	public static void main(String[] args) throws Throwable 
	{

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(2000);

		// Store complete table  in WebEmeent object
		WebElement completeTable = driver.findElement(By.className("dataTable"));

		//1.get colelction of rows in  a atble
		List<WebElement> rows =completeTable.findElements(By.tagName("tr")); // from that table search all ements  methods use  withtag name tr
		System.out.println("NO OF ROWS " + rows.size());

		//Iterate all rows sin that row only columns are presnt so will iterat eall rows go tto 1,2,3,4 a
		for(int i=1 ; i<rows.size();i++)  //in first row mae heading rhathei i[0] not take
		{
			//getindex(1)= row number=1
			//2.get collection of column from rows
			// go to rowcollection and get index as 0 so in row  mae find kargeng element whose tag //td(column)

			List<WebElement> column= rows.get(i).findElements(By.tagName("td")); //getting coolumns daat from rows
			Thread.sleep(2000);
			System.out.println("No of rows"+    +i+  "  "   +"No of columns"  +column.size());   // i is index no of rows 

		}

		driver.close();
		
		
/*for (WebElement rowdata : rows)  //in this will not use getindex metho

		{

			List<WebElement> col= rowdata.findElements(By.tagName("td"));

			System.out.println("No of columns"  +col.size());

       yeah otuput wrongm aa rha in forach as not gettinmg indexnumbrer()getinddex with that unabel to print +i numnber
			     No of rowsNo of colmeun0
				No of rowsNo of colmeun2
				No of rowsNo of colmeun2
				No of rowsNo of colmeun2
				No of rowsNo of colmeun2

		}
 */






	}

}
