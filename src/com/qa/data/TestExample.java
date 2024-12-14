package com.qa.data;

import org.openqa.selenium.WebDriver;  //interface it will not chnage
import org.openqa.selenium.chrome.ChromeDriver;



public class TestExample 
{

	public static void main(String[] args) throws Throwable 
	{ //throwable

		// System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		//creating instance object fro chrome browser
		WebDriver driver= new ChromeDriver();  //driver is obejct
		//Webdriver_Project/msedgedriver.exe"

		driver.manage().window().maximize();
		//launch url in the browser
		driver.get("https://www.google.com/");
		Thread.sleep(000);  //susped tool for 5 sec from executio

		driver.manage().deleteAllCookies();  //performnce fats

		Thread.sleep(5000);
		driver.close();



	}

}
