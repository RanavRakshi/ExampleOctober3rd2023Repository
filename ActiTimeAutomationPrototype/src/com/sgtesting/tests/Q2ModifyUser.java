package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Q2ModifyUser 
{
	public static WebDriver oBrowser=null;

	@Test(priority = 1)
	public void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Assert.assertNotNull(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	public void navigate()
	{
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3,dataProvider = "adminLoginData")
	public void logIn(String user,String pass)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pass);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	public void minimizeFlyWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
			String oEle=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertEquals("display: none;", oEle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5,dataProvider = "createUserData")
	public void createUser(String FN,String LN,String email,String user,String pass,String pwd)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(FN);
			oBrowser.findElement(By.name("lastName")).sendKeys(LN);
			oBrowser.findElement(By.name("email")).sendKeys(email);
			oBrowser.findElement(By.name("username")).sendKeys(user);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, User1']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6,dataProvider = "modifyUserData")
	public void modifyUser(String memail)
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys(memail);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, User1']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 7)
	public void deleteUser()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, User1']"));
			Assert.assertFalse(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 8)
	public void logOut()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 9)
	public void closeBrowser()
	{
		try {
			oBrowser.quit();
			oBrowser=null;
			Assert.assertNull(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="adminLoginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@DataProvider(name="createUserData")
	public Object[][]getUserData()
	{
		return new Object[][] {{"User1","Demo","asdfg@gmail.com","DemoUser1","asdf@123","asdf@123"}};
	}
	
	@DataProvider(name="modifyUserData")
	public Object[][] getmodifyUserData()
	{
		return new Object[][] {{"zxcvb@gmail.com"}};
	}
}
