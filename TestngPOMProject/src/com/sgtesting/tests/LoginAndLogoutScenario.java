package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.pages.ActiTimePage;

public class LoginAndLogoutScenario {
	
	public static WebDriver obrowser=null;
	public static ActiTimePage oPage=null;
	
	@Test(priority =1 )
	public void launchBrowser()
	{
		try {
			obrowser=new ChromeDriver();
			oPage=new ActiTimePage(obrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2,dataProvider = "URLData")
	public static void navigate(String url)
	{
		try {
			obrowser.get(url);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3,dataProvider = "logInData")
	public static void login(String user,String pwd)
	{
		try {
			oPage.getUserName().sendKeys(user);
			oPage.getPassword().sendKeys(pwd);
			oPage.getLogin().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	public static void minimizeFlyOutWindow()
	{
		try {
			oPage.getMinimizeFlyOutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	public static void logOut()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	public static void closeApplication()
	{
		try {
			obrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="URLData")
	public Object[][]getURL()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	
	@DataProvider(name="logInData")
	public Object[][]getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
}
