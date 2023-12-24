package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxActiTimeLoginLogoutDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		logout();
		closeBrowser();
	}

	private static void launchBrowser()
	{
		try {
			oBrowser=new FirefoxDriver();
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeBrowser()
	{
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
