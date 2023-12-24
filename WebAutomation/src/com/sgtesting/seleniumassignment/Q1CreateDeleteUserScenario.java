package com.sgtesting.seleniumassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1CreateDeleteUserScenario 
{
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createUser();
		deleteUser();
		logOut();
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
			Thread.sleep(2000);
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
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser() 
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("asdfg@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demo, user1");
			oBrowser.findElement(By.name("password")).sendKeys("qwer@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwer@123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOut()
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
