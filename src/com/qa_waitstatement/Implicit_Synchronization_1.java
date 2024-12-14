package com.qa_waitstatement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Synchronization_1 {

	public static void main(String[] args)  
	
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//along with the webapge all the weblement will load .will use implict soon affter loadng url
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );//giivng 10 sec fro all ements
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		//driver.quit();
		
		
		

	}

}
