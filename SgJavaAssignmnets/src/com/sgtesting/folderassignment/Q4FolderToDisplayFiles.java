package com.sgtesting.folderassignment;

import java.io.File;
import java.util.Arrays;

class PNGFile
{
	public static void dispalypngfile()
	{
		File f1=new File("G:\\Java_Notes\\Example\\Question4");
		File[]pngFiles=f1.listFiles();
		if(pngFiles !=null)
		{
			Arrays.sort(pngFiles);
			System.out.println("The .png files in the folder are:");
			for(File f:pngFiles)
			{
				if(f.getName().endsWith(".png"))
				{
					System.out.println(f.getName());
				}
			}
		}
		else
		{
			System.out.println("There is no such type files in the folder");
		}
	}		
}

class XLSXFile
{
	public static void dispalyxlsxfile()
	{
		File f1=new File("G:\\Java_Notes\\Example\\Question4");
		File[]xlsxFiles=f1.listFiles();
		if(xlsxFiles !=null)
		{
			Arrays.sort(xlsxFiles);
			System.out.println("The .xlsx files in the folder are:");
			for(File f:xlsxFiles)
			{
				if(f.getName().endsWith(".xlsx"))
				{
					System.out.println(f.getName());
				}
			}
		}
		else
		{
			System.out.println("There is no such type files in the folder");
		}
	}		
}

class TXTFile
{
	public static void dispalytxtfile()
	{
		File f1=new File("G:\\Java_Notes\\Example\\Question4");
		File[]txtFiles=f1.listFiles();
		for(int i=0;i<txtFiles.length;i++)
		{
			if(txtFiles[i].isFile()==true)
			{
				if(txtFiles[i].getName().endsWith(".xlsx"))
				{
					System.out.println(txtFiles[i].getPath());
				}
			}
		}
	}		
}
	
class Rename
{
	public static void renameFile()
	{
		File f1=new File("G:\\Java_Notes\\Example\\Question4\\New Text Document.txt");
		File f2=new File("G:\\Java_Notes\\Example\\Question4\\Text Document.txt");
		boolean v1=f1.renameTo(f2);
		System.out.println("Whether file has renamed: "+v1);
	}	
}

class DeleteFile
{
	public static void deleteFile()
	{
		File f2=new File("G:\\Java_Notes\\Example\\Question4\\Screenshot (7) - Copy.png");
		boolean v1=f2.delete();
		System.out.println("Whether file has Deleted: "+v1);
	}
}



public class Q4FolderToDisplayFiles {

	public static void main(String[] args) {

		PNGFile.dispalypngfile();
		System.out.println("***************");
		XLSXFile.dispalyxlsxfile();
		System.out.println("***************");
		TXTFile.dispalytxtfile();
		System.out.println("***************");
		Rename.renameFile();
		System.out.println("***************");
		DeleteFile.deleteFile();
	}

}
