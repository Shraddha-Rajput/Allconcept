package com.qa_javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_jacscript_btw_element {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//driver.get("https://demo.opencart.com/");
		//driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		// driver.findElement(By.linkText("Register")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
     JavascriptExecutor js =(JavascriptExecutor)driver; //No ned of use but use as shwoing belwo comment not intercating
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");   
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Shraddha");
		Thread.sleep(5000);

		//driver.findElement(By.name("lastname")).sendKeys("rajput");
		js.executeScript("document.querySelector(\"#input-lastname\").value='Rajput'" ); //in value we can pass value in textbox
 //without sendkeys how u can sens cvlaues in Selnium? use javascript nad use.value mthod
		driver.findElement(By.name("email")).sendKeys("alltestcases123@gmail.com");
		
		//js.executeScript("document.getElementById('input-password').value='Shraddha@123' " ); whem qeury css selctor nti working


		driver.findElement(By.name("password")).sendKeys("Shraddha@123");

		driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

//Suppose IF WE  GETTIGN ERROR AS ELEMNT CLICK INTERCEPTED EXCEPTION THEN WE NEDD TO USE JAVASCRIPT.eg shwoing
	//will copy JS path 
		js.executeScript("window.scrollBy", 0.400);
		
	/*	//Agree checkbox we can copy jpath means Jav
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(2000);
	*/	

	}

}
