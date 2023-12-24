package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenario 
{

	public static WebDriver oBowser=null;
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
			oBowser=new ChromeDriver();
			oBowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			oBowser.get("http://localhost/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			oBowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyWindow()
	{
		try {
			oBowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try {
			oBowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBowser.findElement(By.name("firstName")).sendKeys("User1");
			oBowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBowser.findElement(By.name("email")).sendKeys("demo123@gmail.com");
			oBowser.findElement(By.name("username")).sendKeys("Useer1Demo");
			oBowser.findElement(By.name("password")).sendKeys("wgywhfvdgf");
			oBowser.findElement(By.name("passwordCopy")).sendKeys("wgywhfvdgf");
			Thread.sleep(2000);
			oBowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try {
			oBowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
			Thread.sleep(2000);
			oBowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBowser.switchTo().alert();
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
			oBowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeBrowser()
	{
		try {
			oBowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
