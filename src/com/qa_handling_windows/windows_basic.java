package com.qa_handling_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_basic {

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
		
		
		
		driver.quit();
		
		
	}

}
