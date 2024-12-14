  package com.qa_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws Throwable 
	{
		//Movetoelement()-This method is used to move your mouse to  paritciluar ement in webape


			WebDriver driver= new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			Actions ac= new Actions(driver);
			
			//use escape key to close the log in page
			ac.sendKeys(Keys.ESCAPE).perform();
			//mouse to electronic
			ac.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Electronics']//div//div[@class='_2GaeWJ']"))).perform();  //mouse mthod 
			
			//mouse to all link  and then clcik
			ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();  //first clcik and then perfrom mthod 
			Thread.sleep(2000);
                //ac.pause(2000); //belong to action class only we can use
			
			//mouse to Baby and kisds
			ac.moveToElement(driver.findElement(By.className("_1kidPb"))).perform();
			Thread.sleep(2000);
			
			//clcik on toys
			ac.moveToElement(driver.findElement(By.linkText("Toys"))).click().perform();
	
	}

}
