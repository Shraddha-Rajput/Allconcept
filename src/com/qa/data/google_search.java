package com.qa.data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class google_search {

	public static void main(String[] args) throws Throwable {

		
				WebDriver driver = new ChromeDriver();
			    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver.manage().window().maximize();
				
				
				driver.get("chrome://settings/search");
				//Store listbox/dropdown into slect class
				Thread.sleep(3000);
				Select listbox = new Select(driver.findElement(By.className("md-select"))); //listbox
				//listbox holding all mehtod of seelct class
				
				
				//use Listcollectionto get collection of object
				List<WebElement> items = listbox.getOptions(); //getoptions return type list
				
				Thread.sleep(2000);
				System.out.println("Totalitems in drodpown " + items.size()); //size count no of elemnt
			/*	
			//pritn all name of every elemnt use for loop
				for (WebElement names : items)
				
				{
					Thread.sleep(2000);
					System.out.println(names.getText()); //names hlding index 
				}
			*/	
				driver.quit();

			}


}
