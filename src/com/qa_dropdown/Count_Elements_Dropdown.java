package com.qa_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_Elements_Dropdown 
{
	//counting element sin list box  saya amzoan
	public static void main(String[] args) throws Throwable 
	{
		WebDriver  driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");


		//Store listbox/dropdown into slect class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox"))); //listbox
		//listbox holding all mehtod of seelct class


		//use Listcollectionto get collection of object
		List<WebElement> items = listbox.getOptions(); //getoptions return type list

		System.out.println("Totalitems in drodpown " + items.size()); //size count no of elemnt

		//pritn all name of every elemnt use for loop
		for (WebElement names : items)

		{
			Thread.sleep(2000);
			System.out.println(names.getText()); //names hlding index 
		}

		driver.quit();

	}

}
