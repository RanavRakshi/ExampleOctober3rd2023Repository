package com.sgtesting.seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowser 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		popUpBrowsers();
	}
	
	private static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void popUpBrowsers()
	{
		try {
			WebElement oEle=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before click on the link, # of PopUps are: "+getPopUpsCount());
			oEle.click();
			Thread.sleep(2000);
			System.out.println("After click on the link, # of PopUps are: "+getPopUpsCount());
			if(getPopUpsCount()>0)
			{
				handlePopUps();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int getPopUpsCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void handlePopUps()
	{
		String parentBrowser=null;
		Object popUps[];
		try {
			parentBrowser=oBrowser.getWindowHandle();
			System.out.println("ParentBrowser: "+parentBrowser);
			popUps=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popUps.length;i++)
			{
				String childBrowser=popUps[i].toString();
				System.out.println("ChildBrowser: "+childBrowser);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				String title=oBrowser.getTitle();
				System.out.println("Child browser Title: "+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("Child Browser URL: "+url);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
