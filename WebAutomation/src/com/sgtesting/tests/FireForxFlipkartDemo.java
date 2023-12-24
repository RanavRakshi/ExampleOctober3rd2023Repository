package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireForxFlipkartDemo 
{

	public static WebDriver obj=null;
	
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		closeBrowser();
	}
	
	private static void launchBrowser()
	{
		try 
		{
			obj=new FirefoxDriver();
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
			obj.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeBrowser()
	{
		try 
		{
			obj.quit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
