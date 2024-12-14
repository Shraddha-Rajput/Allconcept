package com.qa.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert_1 {

	public static void main(String[] args) throws Throwable
	{
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		//click on sign button without enetering username and password
		driver.findElement(By.name("proceed")).click();
		
		//capturing alert text here getext belongs to alert
		String alertmessage = driver.switchTo().alert().getText(); //here we switchcing from html page to alert box
		System.out.println(alertmessage);
		
		//click on Ok button in alert dialog box 
		driver.switchTo().alert().accept();  //ok means accept
		driver.switchTo().alert().dismiss();   //cancel 
		
		//Outpur getting-Please enter a valid user name

		driver.quit();
		
		
		
		
		
		

	}

}
