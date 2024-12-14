 package com.qa_action;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_IMP_RightClick_Mouse
{/*
importnat- 1.Script to perfrom right click in Googllr page
           2. use robot to handle window GUI as action class will handle only webpage
           3.Store all mutiple iwndow into arraylist
           4.Give control using Getint methd in collection 
           5.AGain back to parent
*/
	

	public static void main(String[] args) throws Throwable 
	{
		WebDriver  driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Actions ac= new Actions(driver);  //handle webgui
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform(); //moving elemnt  and then right clik with contxt clcik
		Thread.sleep(2000);
		//mouse to open in new window as we can't use here keybaorddownArrowkey as its webaopge. willuse here ROBOT class too handle nwindow realted 

		/*ac.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(2000);

		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);

		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		 */


		//robot class used to handle window GUI like Open in NEw window
		Robot rb= new Robot(); //handle window GUI
		//use rbot class to click down arrow 2 times (ooen in new window)

		
		//VK_CONTROL
		
		rb.keyPress(KeyEvent.VK_DOWN); //pressing down 1 time
		rb.keyRelease(KeyEvent.VK_DOWN); //releasing down arrow 

		rb.keyPress(KeyEvent.VK_DOWN);  //pressing down 2 time
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		//robot work done

		Thread.sleep(2000);

		//Whenebr will get mutiple windpow will handle and store into  arraylist

		ArrayList<String> arr= new ArrayList<String>(driver.getWindowHandles()); //store all widow in one colelcion varible
		driver.switchTo().window(arr.get(1));//method in collection as getint

		Thread.sleep(2000);
		//switch to child class and click sign in
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Sign in']"))).click().build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("alltestcases123");
		Thread.sleep(2000);
		driver.close();  //closing child

		//we want to give control back to parent 
		driver.switchTo().window(arr.get(0)); //swich to aprent
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform(); //in parent click in image link
		Thread.sleep(2000);
	   driver.close();  //clsoing parent




	}

}
