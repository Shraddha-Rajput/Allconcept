package com.qa.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_method 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
         System.out.println("Title[1]" +driver.getTitle());

		//clcik gmail
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Title[2]" +driver.getTitle());  //Gmail

		driver.navigate().back();
		System.out.println("Title[3]" +driver.getTitle());  //ggooe

		driver.navigate().forward();
		System.out.println("Title[4]" +driver.getTitle());  //gmail

		driver.navigate().refresh();
		driver.close();



	}

}
