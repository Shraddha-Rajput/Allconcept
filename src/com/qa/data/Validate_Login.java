package com.qa.data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Login
{ //Script to validate login functionlity in Ornage hRM 

	public static void main(String[] args) throws Throwable 
	{
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		//launch url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		//store username nad password in WebEment if we want to acees more then one webeelemnt mehtod will stor ein Welement
		//clear and  type usernmae two action perfomed wil store inseatd of calling again agaian dirver
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.clear();
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']")); //pasword is webelemnt object
		password.clear();
	    password.sendKeys("admin1234"); 
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);  //.click use also we can take from keywboard//kesyy.Enter 
		//direct attack as signle
	    
		//will check url before login and after entering wrong passwrd 
		//Valaidation as Expected url same with actal then logins
	// (After entering wrong password) https://opensource-demo.orangehrmlive.com/web/index.php/auth/login  
	//Correct password  https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
		
		
		String expectedurl="dashboard";
		String actualurl =driver.getCurrentUrl(); //Capture run time url use get Curent url //wrong url as invalid crediantials
		
		
		if(actualurl.contains(expectedurl))
		{
			System.out.println("Login suscessfully "   +  expectedurl   +"contains  " +actualurl);
		}
		else
			
		{
			//catupre erroe message as invalid crediantls]"
			Thread.sleep(3000);
			String errormessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
			
			System.out.println(errormessage   +  expectedurl +  "  "   +actualurl); 
 
		
		}
		
		Thread.sleep(3000);
		
		//if acruaal eeror odenst conatin dash text so will capture
		driver.quit();
		
		
		



	}

}
