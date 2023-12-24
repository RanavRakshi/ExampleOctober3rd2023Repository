package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxSgInsituteDemo {

	public static WebDriver sg=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeBrowser();
	}
	
	private static void launchBrowser()
	{
		try {
			sg=new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			sg.get("http://sgtestinginstitute.com/");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeBrowser()
	{
		try {
			sg.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
