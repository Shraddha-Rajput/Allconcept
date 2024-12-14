package com.qa_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Keyboard_Action_1 
{
  //action used to  perfom mouse nad keyboard action
	//Script to perform keybaord action in google page
	public static void main(String[] args) throws Throwable 
	{
	
			WebDriver  driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver.manage().window().maximize();

			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			Actions ac= new Actions(driver);  //belongs to webdriver
			
			//enter some value into textbox
			driver.findElement(By.id("APjFqb")).sendKeys("selenium openings");
			Thread.sleep(2000);
			
			//use down arrow key (3 times)from keyboard for selenium openings in chennai 
			//Sendkeys-This method is used to set keystorke .whenevr we want to enter kybaor dbutton  use first this
            //perform method belongs to action class to execute any task of key or mouse will use perform()
			// press 3 times down arrow to select down chennai text

			ac.sendKeys(Keys.ARROW_DOWN).perform(); //here using Keys . to acces hkeybaord method
			Thread.sleep(2000);

			ac.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);

			ac.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
			
  //to press Enter key 
			ac.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);

			
			
	}

}
