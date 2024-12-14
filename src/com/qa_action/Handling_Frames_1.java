package com.qa_action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Frames_1 {

	public static void main(String[] args) throws Throwable
	{
   //frames is advertisment by default frame index 0,1,2
		WebDriver  driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		Actions ac= new Actions(driver);
		Thread.sleep(2000);
        //collection of frames  (frmaes tagname "iframe")
		List<WebElement> allframe=driver.findElements(By.tagName("iframe"));
		 System.out.println("No of frames"+allframe.size());
		 
		 //allframes in html code.Here we switch from html to frame 
		driver.switchTo().frame(0); //here we have 1 frame
		
		//store source and target elemnt into  Webelement
		WebElement source=driver.findElement(By.id("draggable"));//store source object inot webelemnt
		WebElement target= driver.findElement(By.id("droppable"));
		
       // we  need to drag and drop methods belongs to action class create above object of acation class
		ac.dragAndDrop(source, target).perform();// WebElement source, WebElement target without perfrom action method it wonnt execue
		
		//switch from frame to  html as outside of ifrmae 
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sortable")).click(); //witout moveto ele,mt also we can nayhwere
        ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
        
        
        
        
	}

}
