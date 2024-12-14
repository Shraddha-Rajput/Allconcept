package com.qa_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselection_Deselect 
{//we an use deselect method in mulitslection(choose more than 1 valie in drodpwon)

	public static void main(String[] args) throws Throwable 
	{
	
		WebDriver  driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();
		
		
		driver.get("file:///C:/Users/princ/Downloads/20230202_lyst1436/MultiListboxHtmlpage.html");
		
		
		//Store thsi dropd down
		//driver.get("C:\\Users\\princ\\OneDrive\\Documents\\RPA\\AUTOMATION\\ONLINE RANGA REDDY");
		Thread.sleep(2000);
		
		
		Select listbox= new Select(driver.findElement(By.name("multiSelection")));
		 boolean verify =listbox.isMultiple();  //true 
		 System.out.println(verify);
		 
		  List <WebElement> count= listbox.getOptions();
		             // System.out.println(count.size());   //12 optiosn in this drodpwn with size we can coun
	              
		//select 8 elements from 11
		for(int i=0; i<8;i++)
		{
			
			Thread.sleep(2000);
			listbox.selectByIndex(i);
			
		}
		
		//deselect items appllciable only if we have mutlitlist
		
		   Thread.sleep(3000);
		   listbox.deselectByIndex(2);
		   listbox.deselectByVisibleText("White");
		   listbox.deselectAll();
		
		   driver.quit();
		
	}

}
