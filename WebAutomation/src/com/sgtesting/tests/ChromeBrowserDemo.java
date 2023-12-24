package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo 
{
	public static WebDriver oBrowser=null;
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
			oBrowser=new ChromeDriver(); // --> it launches the Browser
			oBrowser.manage().window().maximize(); //--> it Maximize the Browser Window
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
			oBrowser.get("http://localhost/login.do"); //--> it Navigate to the particular page
		//  oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			Thread.sleep(5000); // --> it sets the time limit for the particular page
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeBrowser()
	{
		try 
		{
			oBrowser.quit(); //--> it closes the Browser
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
