package com.qa.File_handling;
import java.io.*;

public class FileHandling_1 {

	public static void main(String[] args) throws Throwable 
	{ 
		//create new file.
		File f= new File("C:/SeleniumScreenshot/file.txt");
		//File f= new File("D:/file.txt"); if we w have drive other than C then drietcky ctrat text file

		FileWriter fw = new FileWriter(f);  //wite some text in Allocating phuscal memory fro physical file
		BufferedWriter bw = new BufferedWriter(fw); //used to allocate memory to fw
		  bw.write("I ma auomation tetser");
		  bw.newLine();
		  bw.write("Will get soon good package in MNC soon");
		  bw.newLine(); //to go into new lien
		 bw.flush();
		  bw.write("Wait and watch");
		  bw.newLine(); //to go into new lien

		  bw.close();
		
				

	}

}
