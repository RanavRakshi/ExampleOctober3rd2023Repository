package com.sgtesting.folderassignment;

import java.io.File;

class Createfolder
{
	public static void createfolder(String a[])
	{
		File f1=new File("G:\\Java_Notes\\Example\\Weekday");
		for(String day:a)
		{
			File f2=new File (f1,day);
			f2.mkdirs();
		}
	}
}
public class Q2WeekdaySubFolder {

	public static void main(String[] args) {
		
		
		String s[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Createfolder.createfolder(s);
	}

}
