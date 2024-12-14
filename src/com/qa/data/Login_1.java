package com.qa.data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Login_1 
{

	public static void main(String[] args) throws Throwable  
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
	
		
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//launch url
		driver.get("http://primusbank.qedgetech.com/");
	
		Thread.sleep(5000);
				
		//enetr user name and password
		driver.findElement(By.id("txtuId")).sendKeys("Admin");  //find elemnt belong to webdriver and its return tyep webdeemnt
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		


		Thread.sleep(5000);
		driver.quit();






	}

}
