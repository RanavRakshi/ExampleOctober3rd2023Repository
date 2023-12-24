package com.sgtesting.tests.pomscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.tests.pom.ActiTimePage;


public class Q5CreateCustomeProjectAndDelete 
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

	@Test(priority = 5,dataProvider = "createCustomerData")
	public void createCustomer(String cus,String desc)
	{
		try {
			oPage.getTASKS().click();
			Thread.sleep(1000);
			oPage.getAddNewButton().click();
			Thread.sleep(1000);
			oPage.getNewCustomerButon().click();
			Thread.sleep(1000);
			oPage.getcustomerLightBox_nameField().sendKeys(cus);
			Thread.sleep(1000);
			oPage.getcustomerLightBox_descriptionField().sendKeys(desc);
			Thread.sleep(1000);
			oPage.getcreateCustomer().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getconfirmCustomer().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6,dataProvider = "createProjectData")
	private static void createProject(String pro)
	{
		try {
			oPage.getTASKS().click();
			Thread.sleep(1000);
			oPage.getAddNewButton().click();
			Thread.sleep(1000);
			oPage.getnewProject().click();
			Thread.sleep(1000);
			oPage.getprojectPopup_projectNameField().sendKeys(pro);
			Thread.sleep(1000);
			oPage.getcreateProject().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getconfirmProject().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * @Test(priority = 7) private static void deleteProject() { try {
	 * oPage.getconfirmProject().click(); Thread.sleep(1000);
	 * oPage.getprojectEditButton().click(); Thread.sleep(1000);
	 * oPage.getprojectActionButton().click(); Thread.sleep(1000);
	 * oPage.getprojectDeleteButton().click(); Thread.sleep(1000);
	 * oPage.getdeletePermanently().click(); Thread.sleep(3000); } catch (Exception
	 * e) { e.printStackTrace(); } }
	 */
	
	@Test(priority = 7)
	private static void deleteCustomer()
	{
		try {
			oPage.getconfirmCustomer().click();
			Thread.sleep(1000);
			oPage.getcustomerEditButton().click();
			Thread.sleep(1000);
			oPage.getActions().click();
			Thread.sleep(1000);
			oPage.getDeleteButton().click();
			Thread.sleep(1000);
			oPage.getdeletePermanently().click();
			Thread.sleep(4000);
			//Assert.assertFalse(oPage.getconfirmCustomer().isDisplayed());
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
	
	@DataProvider(name="createProjectData")
	public Object[][]getProjectData()
	{
		return new Object[][] {{"LoginPageBuild"}};
	}
}

