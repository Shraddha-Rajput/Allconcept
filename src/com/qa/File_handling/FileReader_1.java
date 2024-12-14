package com.qa.File_handling;

import java.io.BufferedReader;
import java.io.FileReader;

//Read file data line by lien from existing notepad. its imp we should have alrwady existng file to read

public class FileReader_1 {

	public static void main(String[] args) throws Throwable  
	{

      FileReader fr= new FileReader("C:/SeleniumScreenshot/file2.txt");
       BufferedReader br = new BufferedReader(fr); //read file lin eny line we need to allocaat ememory  
    String str="";
    //read line by line file until it become not null
    
    while((str=br.readLine())!= null)  //we want condition read until not null sso use while 
    {
    	Thread.sleep(2000);
    	System.out.println(str);
    }
    //The condition is checking whether the result of br.readLine() is not null. It's also assigning the result of br.readLine() to the variable str in each iteration.
     br.close();
       
	}

}
