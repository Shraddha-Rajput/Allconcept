package com.qa_javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Not_Interacting {

	public static void main(String[] args) throws Throwable 
	{
		//without using sendkeys how we can send vlaues in Selnium? use javascript and use.value='' pass that valeu here

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver; 

		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");   
		Thread.sleep(5000);

		//driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Shraddha");
		//copy that js path here from Selector hub
		js.executeScript("document.querySelector(\"#input-firstname\").value='Shraddha' ");
		Thread.sleep(5000);

		//driver.findElement(By.name("lastname")).sendKeys("rajput");
		js.executeScript("document.querySelector(\"#input-lastname\").value='Rajput'" ); //in value we can pass value in textbox

		//wil scroll tpo vceratin pixel
		//js.executeScript("window.scrollBy",0,500);	
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scrol from top to bottom

		js.executeScript("document.querySelector(\"#input-email\").value='alltestcases123@gmail.com' ");
		Thread.sleep(3000);



		//driver.findElement(By.name("password")).sendKeys("Shraddha@123");
		//js.executeScript("document.querySelector(\"#input-password\").value='Shraddha@123' " );

		//whenn document.queryselctor menas css selctor is not working/coming will type document.getElementById('cpy id here')
		
		js.executeScript("document.getElementById('input-password').value='Shraddha@123' " );


		/*   
        driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		 */





	}

}
