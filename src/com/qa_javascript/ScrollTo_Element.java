package com.qa_javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_Element {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://www.amazon.in/' ");  //launching url usig javascript
	    driver.manage().window().maximize();
	    
	    WebElement store=driver.findElement(By.linkText("France"));
	    store.click();
	}

}
