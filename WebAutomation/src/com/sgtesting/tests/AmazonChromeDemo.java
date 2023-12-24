package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonChromeDemo 
{
	
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigateAmazon();
		closeBrowser();
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
	
	private static void navigateAmazon()
	{
		try 
		{
			//oBrowser.navigate().to("https://www.amazon.in/");
			oBrowser.get("http://www.amazon.in/");
			Thread.sleep(9000);
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
			oBrowser.quit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
