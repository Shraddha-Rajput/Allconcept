package com.qa_javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class javascript_1
{
	//Its javascript and from javscriptwe naviagte ///documnt-webapge  ,widnow-browser ko scroll
	//retruning title,domain,url in run time from webapge
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		JavascriptExecutor js = (JavascriptExecutor)driver ;
		//JavscriptExecuotr js =(Javscriptexecuotr ) driverobject;  //Javscriptexecuotr  is inte
		//lauch browser
		js.executeScript("window.location='https://www.google.com/'"); 
		Thread.sleep(3000);

		//whene we want to return anything from webapge then only use return document
		//print  title name  and length
		
		String pagetitle= js.executeScript("return document.title").toString();//retruning from webapge so use documtn
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());

		//print domain name and length
		String domain= js.executeScript("return document.domain").toString(); 
		System.out.println(domain);
		System.out.println(domain.length());

		//print url name and length
		String url= js.executeScript("return document.URL").toString();
		System.out.println(url);
		System.out.println(url.length());


		driver.close();
	}

}                    

