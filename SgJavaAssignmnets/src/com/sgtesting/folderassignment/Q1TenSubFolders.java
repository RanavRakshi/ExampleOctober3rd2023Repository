package com.sgtesting.folderassignment;

import java.io.File;

class Cfolder
{
	public static void createfolder()
	{
		File f1=new File("G:\\Java_Notes\\Example\\Demo");
		f1.mkdir();
	}
	
	public static void nestingfolder()
	{
		File f1=new File("G:\\Java_Notes\\Example\\Demo\\D1\\D2\\D3\\D4\\D5\\D6\\D7\\D8\\D9\\D10");
		f1.mkdirs();
	}
}

public class Q1TenSubFolders {

	public static void main(String[] args) {
		
		Cfolder.createfolder();
		Cfolder.nestingfolder();
		
	}

}
