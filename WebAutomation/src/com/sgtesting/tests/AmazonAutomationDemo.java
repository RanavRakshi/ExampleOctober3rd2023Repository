package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomationDemo 
{
	private static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		logIn();
		singOut();
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
			oBrowser.get("http://www.amazon.in/");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logIn()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("9591584644");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("continue")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("Ranav@4644");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("signInSubmit")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void singOut()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Hello, sign in']"));
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Sign Out']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
