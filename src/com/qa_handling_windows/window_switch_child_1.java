package com.qa_handling_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_switch_child_1
{
//Handle Mutiple child window
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		String parentid =driver.getWindowHandle();  // return prent id belong to webdriver
		System.out.println(parentid );  //parent id26BBE1BA31BBEF1B7DEFC9FF22A84810


		//click all  3 link
		driver.findElement(By.linkText("FLIGHTS")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("HOTELS")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("RAIL DRISHTI")).click();
		Thread.sleep(2000);


		//Get collection of all windows id  using windows handles will get  parent +child
		Set<String> allwindowids=driver.getWindowHandles();
		System.out.println(allwindowids);  //parent id will be same as above //26BBE1BA31BBEF1B7DEFC9FF22A84810

		//We want switch to  child wind dont want parent  remove selenium focus from psrent to child
		// we want multiple child use foreachloop
		for (String each: allwindowids)   //each holding all

		{

			if(!parentid.equals(each))  //not operator gives opposite output if false gives true //here falase siwych to child

	//Here above  parent id equalto child using not operator return false so wil siwtch to child

			{
				//switch to child 
				String pagetitle=driver.switchTo().window(each).getTitle(); //printin title
				System.out.println(pagetitle);
				Thread.sleep(2000);
				
				driver.close(); //close  all current hotel,flight an ddrisht windows

			}

		}
		
		//above for loop belongs to onlu child
		Thread.sleep(2000);
		driver.switchTo().window(parentid); //swicth back to parent
		Thread.sleep(2000);

		driver.quit();


	}





}
