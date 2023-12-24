package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Q9AdvancedScenarioScenarios2 
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
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority =3, dataProvider = "loginData")
	public void logIn(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority =4)
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

	@Test(priority =5, dataProvider = "createUser1Data")
	public void createUser1(String Fn,String Ln,String em,String Us,String pass,String pwd)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(Fn);
			oBrowser.findElement(By.name("lastName")).sendKeys(Ln);
			oBrowser.findElement(By.name("email")).sendKeys(em);
			oBrowser.findElement(By.name("username")).sendKeys(Us);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority =6)
	public void logOutAdmin()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority =7, dataProvider = "loginUser1Data")
	public void logInAsUser1(String User,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(User);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority =8)
	public void minimizeFlyWindow1()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(1000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority =9, dataProvider = "createUser2Data")
	public void createUser2(String Fn,String Ln,String em,String Us,String pass,String pwd)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(Fn);
			oBrowser.findElement(By.name("lastName")).sendKeys(Ln);
			oBrowser.findElement(By.name("email")).sendKeys(em);
			oBrowser.findElement(By.name("username")).sendKeys(Us);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, Thilak']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void logOutUser1()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 11,dataProvider = "loginUser2Data")
	public void logInAsUser2(String User,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(User);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void minimizeFlyWindow2()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(1000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 13, dataProvider = "createUser3Data")
	public void createUser3(String Fn,String Ln,String em,String Us,String pass,String pwd)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(Fn);
			oBrowser.findElement(By.name("lastName")).sendKeys(Ln);
			oBrowser.findElement(By.name("email")).sendKeys(em);
			oBrowser.findElement(By.name("username")).sendKeys(Us);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, Ravi']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
	public void logOutUser2()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 15,dataProvider = "loginUser3Data")
	public void logInAsUser3(String User,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(User);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	public void minimizeFlyWindow3()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void logOutUser3()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 18,dataProvider = "loginUser21Data")
	public void logInAsUser21(String User,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(User);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 19, dataProvider = "modifyUser3Data")
	public void modifyUser3(String pass,String pwd)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ravi']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, Ravi']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 20)
	public void logOutUser21()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 21,dataProvider = "loginUser31Data")
	public void logInAsUser31(String User,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(User);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 22)
	public void logOutUser31()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 23,dataProvider = "loginUser11Data")
	public void logInAsUser11(String User,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(User);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 24,dataProvider = "modifyUser2Data")
	public void modifyUser2(String pass,String pwd)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Thilak']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, Thilak']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 25)
	public void logOutUser11()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 26,dataProvider = "loginUser22Data")
	public void logInAsUser22(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 27)
	public void logOutUser22()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 28,dataProvider = "loginAdminData")
	public void logInAdmin(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*@Test(priority = 29)
	public void minimizeFlyWindowA1()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	@Test(priority = 29,dataProvider = "modifyUser1Data")
	public void modifyUser1(String pass,String pwd)
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 30)
	public void logOutAdmin1()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 31,dataProvider = "loginUser12Data")
	public void logInAsUser12(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 32)
	public void logOutUser12()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 33,dataProvider = "loginUser23Data")
	public void logInAsUser23(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 34)
	public void deleteUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ravi']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(1500);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']"));
			Assert.assertNotEquals("Demo, Ranav", oEle);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 35)
	public void logOutUser23()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 36,dataProvider = "loginUser12Data")
	public void logInAsUser13(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 37)
	public void deleteUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Thilak']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert2=oBrowser.switchTo().alert();
			String content1=oAlert2.getText();
			System.out.println(content1);
			oAlert2.accept();
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 38)
	public void logOutUser13()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 39,dataProvider = "loginAdminData")
	public void logInAdmin1(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*@Test(priority = 40)
	public void minimizeFlyWindowA2()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	@Test(priority = 40)
	public void deleteUser1()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 41)
	public void logOutAdmin12()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 42)
	public void closeApplication()
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

	@DataProvider(name = "loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}

	@DataProvider(name ="createUser1Data")
	public Object[][]getUser1Data()
	{
		return new Object[][] {{"Ranav","Demo","qwer@gmail.com","Ranavrakshi","qwer@123","qwer@123"}};
	}

	@DataProvider(name = "loginUser1Data")
	public Object[][] getLoginUser1Data()
	{
		return new Object[][] {{"Ranavrakshi","qwer@123"}};
	}

	@DataProvider(name ="createUser2Data")
	public Object[][]getUser2Data()
	{
		return new Object[][] {{"Thilak","Demo","qwer@gmail.com","Thilakthili","asdf@123","asdf@123"}};
	}
	@DataProvider(name = "loginUser2Data")
	public Object[][] getLoginUser2Data()
	{
		return new Object[][] {{"Thilakthili","asdf@123"}};
	}

	@DataProvider(name ="createUser3Data")
	public Object[][]getUser3Data()
	{
		return new Object[][] {{"Ravi","Demo","qwer@gmail.com","Raviraj","zxcv@123","zxcv@123"}};
	}
	@DataProvider(name = "loginUser3Data")
	public Object[][] getLoginUser3Data()
	{
		return new Object[][] {{"Raviraj","zxcv@123"}};
	}

	@DataProvider(name = "loginUser21Data")
	public Object[][] getLoginUser21Data()
	{
		return new Object[][] {{"Thilakthili","asdf@123"}};
	}

	@DataProvider(name ="modifyUser3Data")
	public Object[][]getUser31Data()
	{
		return new Object[][] {{"asdf@123","asdf@123"}};
	}

	@DataProvider(name = "loginUser31Data")
	public Object[][] getLoginUser31Data()
	{
		return new Object[][] {{"Raviraj","asdf@123"}};
	}

	@DataProvider(name = "loginUser11Data")
	public Object[][] getLoginUser11Data()
	{
		return new Object[][] {{"Ranavrakshi","qwer@123"}};
	}

	@DataProvider(name ="modifyUser2Data")
	public Object[][]getUser21Data()
	{
		return new Object[][] {{"qwer@123","qwer@123"}};
	}

	@DataProvider(name = "loginUser22Data")
	public Object[][] getLoginUser22Data()
	{
		return new Object[][] {{"Thilakthili","qwer@123"}};
	}

	@DataProvider(name = "loginAdminData")
	public Object[][] getLoginAdminData()
	{
		return new Object[][] {{"admin","manager"}};
	}

	@DataProvider(name ="modifyUser1Data")
	public Object[][]getUser11Data()
	{
		return new Object[][] {{"zxcv@123","zxcv@123"}};
	}

	@DataProvider(name = "loginUser12Data")
	public Object[][] getLoginUser12Data()
	{
		return new Object[][] {{"Ranavrakshi","zxcv@123"}};
	}

	@DataProvider(name = "loginUser23Data")
	public Object[][] getLoginUser23Data()
	{
		return new Object[][] {{"Thilakthili","qwer@123"}};
	}
}
