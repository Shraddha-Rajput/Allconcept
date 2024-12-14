package com.qa_waitstatement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait
{
//Used to tell web driver to wait for specified element for certain conditions 
	//here wait till we clic link

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//create object for webdriver wait class
		WebDriverWait wt= new WebDriverWait(driver, 20);
		
		//1.wait until link is clickable
		WebElement elementlink=driver.findElement(By.linkText("Create new account"));
		wt.until(ExpectedConditions.elementToBeClickable(elementlink)).click(); //we have store webelemnt
		
		//eelementlink.click();
		//wt.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();
		
		//2.hey slenium wiat until my firstname texbox is not visble to u
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))); //here we are not strong into webeelmt directly located
	//	WebElement textbox=\driver.findElement(By.name("firstname"));  //dont store webelent alread locateds 
        driver.findElement(By.name("firstname")).sendKeys("Selenium"); 
	}

}
