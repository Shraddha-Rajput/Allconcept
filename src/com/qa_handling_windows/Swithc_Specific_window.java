package com.qa_handling_windows;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swithc_Specific_window {

	public static void main(String[] args) throws Throwable 
	{

		//How will give Control to specific windows? Interview questions

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.irctc.co.in/nget/train-search");//0 index
		Thread.sleep(3000);

		//click all  3 link
		driver.findElement(By.linkText("FLIGHTS")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("HOTELS")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("RAIL DRISHTI")).click();
		Thread.sleep(3000);

		//collection of allwindows idsincluidn parent use Arraylist as welll as Set here use Arraylist

		//With arraylist will get control to soeicf iwndow use get index

		ArrayList<String> allids= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(allids);  

		//which windows target ,by deaafult 0 index to parent//Specificc valeu from collection use get method
          Thread.sleep(2000);
           
		driver.switchTo().window(allids.get(3)); //get specific wind using index from allides mae sae go to index 2s 
		//focus on Hotel accoridng to ids starting number
        Thread.sleep(2000);
		//driver.findElement(By.tagName("Search Hotel")).click(); 
       
       //switcch to aprent
       Thread.sleep(2000);
        driver.switchTo().window(allids.get(0));
        Thread.sleep(2000);

		driver.quit();




		/*
As 0 -parent  1-FLight   2-hotel  3 -drishti
Accordingn to our code is should be Drishti as 3 index not hotel

[594089B9CFBA4830AAEC6DB59AC4E60F,   //1


668B1FFE02C15312C9C7218A8ABCA986,    //3  seleium will Take this as 3 mso focus here hotels not drishti

		
B0D2470DEE94C0F4EBF2862E3AD8DB2E,  //0


629A865E4D7C5BEEDE4C94B3ACF3F001]  //2


		 */
	}

}
