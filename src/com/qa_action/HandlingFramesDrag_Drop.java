package com.qa_action;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFramesDrag_Drop {

	public static void main(String[] args) throws Throwable
	{
// Script To find location of Webelement
		
		WebDriver  driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		Actions ac= new Actions(driver);
		Thread.sleep(2000);
        //collection of frames  (frmaes tagname "iframe")
		
		driver.switchTo().frame(0);  //important to swotch to frma
		WebElement source=driver.findElement(By.id("draggable"));//store source object inot webelemnt
		WebElement destination= driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		//get loaction of above webelemnt
		
		int x=destination.getLocation().getX(); // getX() return type int   here we use using destiantion variable as from here destiantion location from we need to get location not use soucrec
		int y=destination.getLocation().getY();  //Y coordinate
       System.out.println(x+ "  "  +y);   //146X  18 Y coordinate

		
		ac.dragAndDropBy(source, x, y).perform();
	
		 
		
		
	}

}
