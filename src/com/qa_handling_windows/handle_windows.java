package com.qa_handling_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_windows {

	public static void main(String[] args) throws Throwable
	{

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.google.com/gmail/about/");
		//Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		                   js.executeScript("windows.location='https://www.google.com/gmail/about/' ");
		           		Thread.sleep(2000);
		           		
		           		//scroll to 
		           		
		           		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		           		Thread.sleep(2000);
		           	
		           	//	Scrol too certain pixel vertically
		           
		           		
		           		js.executeScript("window.scrollBy(0,900)" );

		                   
		                   //get parent id
		//String parentid=driver.getWindowHandle();
		//System.out.println(parentid); //get diff id everytime
		
		
		//clikc all three link
		Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy"));
		driver.findElement(By.linkText("Terms"));

		driver.findElement(By.linkText("Google Products"));
		//driver.findElement(By.linkText("Privacy"));

		
		
		
	   //get colelction of all window
		
		Set<String> allwindows= driver.getWindowHandles(); //return type set interface- set collection to handle window  their use list for rowser
		System.out.println(allwindows);
		driver.quit();

	}

}
