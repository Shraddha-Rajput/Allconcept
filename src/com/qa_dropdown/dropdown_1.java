package com.qa_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_1 {

	public static void main(String[] args) throws Throwable
	{
//seelecting itemns in list box
     WebDriver  driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	
    driver.findElement(By.linkText("Create new account")).click();
    
    Thread.sleep(2000);
    //Store listbox into seelct class.All things are predeined in list box
    //access all the method of select class from below 
// Selectbyvisible text method is used to select items in a list box
    
    //use getoption

     Select birthdatelist = new Select(driver.findElement(By.name("birthday_day")));
     Select birthdaymonthlist = new Select(driver.findElement(By.name("birthday_month")));
     Select birthdayearlist = new Select(driver.findElement(By.name("birthday_year")));
     
     birthdatelist.selectByVisibleText("21"); //access date by slecet b y sisbel etxt
     birthdaymonthlist.selectByVisibleText("Dec") ; //type same month as in th elist we cant change eas its predeined
      
     //number
     birthdayearlist.selectByIndex(30);    //wt item  in 30  will get 1998 is 30 
     System.out.println(birthdayearlist.getFirstSelectedOption().getText());  //select first elent and then print
     
     //verify date is single or multislection
 
     Boolean value= birthdatelist.isMultiple();  //false
     System.out.println(value);
     
     driver.close();
     
     
     
     
     
     
     
     
     
     
     
     
     

    
    
    
    
   
   
	
	}

}
