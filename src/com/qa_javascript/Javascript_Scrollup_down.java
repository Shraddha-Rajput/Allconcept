 package com.qa_javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Scrollup_down 
{
    //use window.scrollTo means scrolling browser 
	//use document.means scroll webapge  not browser
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://www.amazon.in/' ");  //launching url usig javascript
	    driver.manage().window().maximize();
		// scroll from top to botton vertically  here  window means(browser) not webapge
		//here starting value is 0 .how much heigth till that scroll
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		//Scroll botttom to top()
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");//broswer  scroll hoga from botom to jitna scroll hoga jitni height
		Thread.sleep(3000);
		
		//scroll to ceratin pixel from  starting (0)sae 900 tak
		js.executeScript("window.scrollBy(0,900)"); //certain pixe
		Thread.sleep(3000);
		driver.quit();

	
	}

}
