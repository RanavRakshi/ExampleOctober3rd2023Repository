package com.sgtesting.folderassignment;

import java.io.File;

class RecursiveDirectories
{
	public static void recursiveDirectories(String folderpath)
	{
		try 
		{
			File f1=new File(folderpath);
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isDirectory()==true)
				{
					String folderName=f2[i].getAbsolutePath();
					System.out.println(folderName);
					recursiveDirectories(folderName);
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

public class Q5 {

	public static void main(String[] args) {

		RecursiveDirectories.recursiveDirectories("G:\\ECLIPSE\\eclipse");
	}

}
