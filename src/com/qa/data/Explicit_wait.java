package com.qa.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) 
	//Used to tell web driver to wait for certain conditions as Expected Conditions
	//Before throwing exceptioona s Element not visible exceptions

	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20); //webdriver wait  is a class
		
		WebElement elementlink= driver.findElement(By.linkText("Create new account"));
		 
		wait.until(ExpectedConditions.elementToBeClickable(elementlink));//stor webelemnt in use varirbale
		 elementlink.click();
		 
		 
		// WebElement visiblelink =driver.findElement(By.linkText("firstname"));
		// wait.until(ExpectedConditions.visibilityOf(visiblelink));
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));//already located
		 driver.findElement(By.name("firstname")).sendKeys("selenium");
		 //elementlink.sendKeys("Selenium"); wrongn
		 
		 driver.quit();
		
		
	}

}
