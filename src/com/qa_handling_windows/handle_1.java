package com.qa_handling_windows;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_1 {

	public static void main(String[] args) throws Throwable 
	{
//Switching to specific windows using arraylist when mutiple win is open

		WebDriver  driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.google.com/gmail/about/");  
		
		driver.get("https://www.google.com/gmail/about/"); //0 index PArent bydefault slenum will have control to parent
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Terms")).click();  // 1 index
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy")).click();  //2 index
		Thread.sleep(3000);
		driver.findElement(By.linkText("Google Products")).click(); //3
		Thread.sleep(4000);
          
		
		//Set<String> storeids=driver.getWindowHandles();
		//System.out.println(storeids);
		//we can se array lsit to get colelctio of llwindows into arraylisrt

		
		ArrayList<String> value = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(value);
		driver.switchTo().window(value.get(2)); //changing control as 2 index
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/a")).click();	
		
		Thread.sleep(3000);
		/*driver.switchTo().window(value.get(3));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Products"));
		*/
		
        
      
		Thread.sleep(3000);
	
		//switcch to parent wind
		
		driver.switchTo().window(value.get(0));   //isnide iwndow give value baribel holding all windows id
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
