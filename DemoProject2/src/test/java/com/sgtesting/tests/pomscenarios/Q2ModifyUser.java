package com.sgtesting.tests.pomscenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.tests.pom.ActiTimePage;


public class Q2ModifyUser 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	@Test(priority = 1)
	public void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3,dataProvider = "adminLoginData")
	public void login(String user,String pwd)
	{
		try {
			oPage.getUserName().sendKeys(user);
			oPage.getPassword().sendKeys(pwd);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void minimizeFlyWindow()
	{
		try {
			oPage.getMinimizeFlyOutWindow().click();
			Thread.sleep(1000);
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5,dataProvider = "createUserData")
	public void createUser(String FN,String LN,String email,String user,String pass,String pwd) 
	{
		try {
			oPage.getUSERSSection().click();
			Thread.sleep(2000);
			oPage.getAddUserButton().click();
			Thread.sleep(2000);
			oPage.getFirstNameTextBox().sendKeys(FN);
			oPage.getLastNameTextBox().sendKeys(LN);
			oPage.getEmailTextBox().sendKeys(email);
			oPage.getUserName().sendKeys(user);
			oPage.getPassword1().sendKeys(pass);
			oPage.getpasswordCopy().sendKeys(pwd);
			Thread.sleep(2000);
			oPage.getCreateUser().click();
			Thread.sleep(4000);	
			Assert.assertTrue(oPage.getConfirmUser().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6,dataProvider = "modifyUserData")
	public void modifyUser(String memail)
	{
		try {
			oPage.getConfirmUser().click();
			Thread.sleep(1000);
			oPage.getEmailTextBox().clear();
			Thread.sleep(1000);
			oPage.getEmailTextBox().sendKeys(memail);
			Thread.sleep(1000);
			oPage.getsaveChanges().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getConfirmUser().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void deleteUser()
	{
		try {
			oPage.getConfirmUser().click();
			Thread.sleep(2000);
			oPage.getuserDataLightBox_deleteBtn().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			Assert.assertFalse(oPage.getConfirmUser().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void logOut()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
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
