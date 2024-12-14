package com.qa_waitstatement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait_1 
{
	
	//defien the max amt of tiem to wait for cetrtian condiiton and its freqyecnt to check for condition
	//with more flexiblity  in pooling time and ignoring exception

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.firebox.driver", "firebox.exe");

		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver) 
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("q")).sendKeys("Selenium");
		driver.findElement(By.xpath("q")).sendKeys(Keys.ENTER); //on smae will clcik and open selenium



		//usage of fleunt wiat we can use generic mehtod


		WebElement element= mywait.until(new Function<WebDriver,WebElement >()
		{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//a[normalize-space()='WebDriver']"));
			}

		});
		element.click();
	}

}
