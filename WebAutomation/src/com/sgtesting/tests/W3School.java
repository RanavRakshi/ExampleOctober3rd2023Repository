package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		CloseBrowser();
	}

	private static void launchBrowser()
	{
		try 
		{
			oBrowser=new ChromeDriver();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try 
		{
			oBrowser.get("https://www.w3schools.com/");
			Thread.sleep(5000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CloseBrowser()
	{
		try {
			oBrowser.quit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
