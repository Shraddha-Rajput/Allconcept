package com.qa.File_handling;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//read run time text from google
public class WriteWebelement {

	public static void main(String[] args) throws Throwable {

		//File f= new File("C:/SeleniumScreenshot/file2.txt");//noteapd file
		File f= new File("C:/SeleniumScreenshot/file2.doc");  //read word file just change .extension

		FileWriter fw = new FileWriter(f);  //write into f
		BufferedWriter bw= new BufferedWriter(fw); //if we wan to write file we nedd to create memory ofr fw

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		//get the current text  visible in run tie 
		String par1= driver.findElement(By.xpath("//p[contains(text(),'Primus Bank dates back to 1955 when Primus North C')]")).getText();

		String par2= driver.findElement(By.xpath("//p[contains(text(),'In 1975, the Malta Government purchased 25% of')]")).getText();
		bw.write(par1);   //hamae [ar1 lhhna pehla

		bw.newLine();
		bw.newLine();

		bw.write(par2);
		bw.newLine();
		bw.newLine();

		bw.flush();
		bw.close();
        driver.close();





	}

}
