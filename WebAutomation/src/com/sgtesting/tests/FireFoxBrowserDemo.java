package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {

	public static WebDriver oBrwser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeBrowser();
	}
	private static void launchBrowser()
	{
		try 
		{
			oBrwser=new FirefoxDriver();
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
			oBrwser.get("http://localhost/login.do");
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
			oBrwser.quit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
