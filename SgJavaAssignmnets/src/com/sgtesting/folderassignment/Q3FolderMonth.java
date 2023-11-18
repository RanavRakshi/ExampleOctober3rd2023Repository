package com.sgtesting.folderassignment;

import java.io.File;

class Createfolder1
{
	public static void createfolder(String a[])
	{
		File f1=new File("G:\\Java_Notes\\Example\\Month");
		for(String month:a)
		{
			File f2=new File (f1,month);
			f2.mkdirs();
		}
	}
}

public class Q3FolderMonth {

	public static void main(String[] args) {

		String s[]= {"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sep","Oct","Nov","Dec"};
		Createfolder1.createfolder(s);
	}

}
