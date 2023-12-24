package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Q4CreateModifyDeleteCustomer 
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
	
	@Test(priority = 2,dataProvider = "navigateURL")
	public void navigate(String URL) 
	{
		try {
			oBrowser.get(URL);
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3,dataProvider = "adminLoginData")
	public void login(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
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
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5,dataProvider = "createCustomerData")
	public void createCustomer(String cus,String desc)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(cus);
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys(desc);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Ranav ']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void modifyCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='Ranav ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void deleteCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='Ranav ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(1000);
			/*
			 * WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Ranav ']"));
			 * Assert.assertFalse(oEle.isDisplayed());
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 8)
	public void logOutAdmin()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
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
	
	@DataProvider(name="navigateURL")
	public Object[][] getAppURL()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	
	@DataProvider(name="adminLoginData")
	public Object [][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@DataProvider(name="createCustomerData")
	public Object[][]getCustomerData()
	{
		return new Object[][] {{"Ranav","Good Programmer"}};
	}
}

