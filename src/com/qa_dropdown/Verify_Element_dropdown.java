package com.qa_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Element_dropdown 
{ //verify book is presnet in list box or nts

	public static void main(String[] args) throws Throwable 
	{

		String itempresent ="books";
		boolean itemexist=  false  ;  //initailly false no item 

		WebDriver  driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//Store listbox/dropdown into slect class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox"))); //listbox
		//listbox holding all mehtod of seelct class


		//use Listcollectionto get collection of object
		List<WebElement> allitems = listbox.getOptions(); //getoptions return type list
		System.out.println("Totalitems in drodpown " + allitems.size()); //size count no of elemnt


		Thread.sleep(3000);
		for (WebElement store : allitems)

		{   
			String actualitem = store.getText();
			System.out.println(actualitem);
			//veirfy actual item  with the  item presnt
			Thread.sleep(2000);

			if(actualitem.equalsIgnoreCase(itempresent))

			{
				itemexist= true;      //itemexist holding tur/flase 
				break; //coming out if itme presnt
			}

		}

		// after verifying only will   print  statremnt as true or flase after for loop as item presnt/not

		if(itemexist)  //true
		{
			System.out.println("Item is presnt in list"+itempresent); //matching then stop

		}

		else
		{
			System.out.println("Item is  not  presnt in list " + itempresent); //matching then stop

		}

		Thread.sleep(2000);

		driver.quit();


		//matches with book if book is presne tin between will stop wwont excute all otersnamws
	}


}
