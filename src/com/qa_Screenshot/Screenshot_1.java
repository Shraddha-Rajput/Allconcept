package com.qa_Screenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_1 {

	public static void main(String[] args) throws Throwable
	{//Script to take ss with date and time pattern

		WebDriver  driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		//take help of java to creta timestamp date

		Date dt= new Date();//import java.util
		//DateFormat owndate= new SimpleDateFormat();//deafile patten
		DateFormat owndate= new SimpleDateFormat("dd_MM_YY hh_mm_ss");// we can chnage date format any
		String datestore = owndate.format(dt); //will store in string 
		
		//take ss and store in one varible.  As ss is  file only  as jpg is file only .here selenium itself is taking ss
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //import file java.io(input/output ,taking ss of webdriver object

		//store that taken ss in our system local drive
		// FileUtils.copyFile(shot,new File("C://Users//princ//OneDrive//Documents//RPA")); //filesorue nad file dest//Errorexists but is a directory

		//FileUtils.copyFile(screen,new File("C://SeleniumScreenshot/homepage.png"));  //selenium will create automaticallyfolder and will give in which manner follow
		
		//add (concat) taht date into ss
		//Automatcially Folder will ve created by gievn name in C dirve and ss name as homepage
   	FileUtils.copyFile(screen,new File("C://SeleniumScreenshot/"+datestore+ " _ "+"homepage.png"));//FileUtils is aclasss ,cpyfle(src,destination)
		//whatever ss will take newly only will overide wilth wxisting one so wil use date 
 driver.quit();
	}

}
