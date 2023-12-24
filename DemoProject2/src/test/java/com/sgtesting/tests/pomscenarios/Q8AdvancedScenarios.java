package com.sgtesting.tests.pomscenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.tests.pom.ActiTimePage;


public class Q8AdvancedScenarios 
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

	@Test(priority = 3,dataProvider = "loginData")
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

	@Test(priority = 5,dataProvider = "createUsersData")
	private static void createUsers(String Fn,String Ln,String em,String Us,String pass,String pwd)
	{
		try {
			// click Users to create user
			oPage.getUSERSSection().click();
			Thread.sleep(1000);
			// adding users
			oPage.getAddUserButton().click();
			Thread.sleep(1000);
			oPage.getFirstNameTextBox().sendKeys(Fn);
			oPage.getLastNameTextBox().sendKeys(Ln);
			oPage.getEmailTextBox().sendKeys(em);
			oPage.getUserName().sendKeys(Us);
			oPage.getPassword1().sendKeys(pass);
			oPage.getpasswordCopy().sendKeys(pwd);
			Thread.sleep(1000);
			oPage.getCreateUser().click();
			Thread.sleep(3000);
			String val=Ln+", "+Fn;
			WebElement users=oBrowser.findElement(By.xpath("//span[text()='"+val+"']"));
			Assert.assertTrue(users.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void logOut()
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

	@Test(priority = 7,dataProvider = "loginUser1Data")
	public void logInAsUser1(String user,String pass)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pass);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getWelcomeToActiTIME().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void minimizeFlyWindow1()
	{
		try {
			oPage.getStartExploringActiTIME().click();
			Thread.sleep(2000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void logOutUser1()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10,dataProvider = "loginUser2Data")
	public void logInAsUser2(String user,String pass)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pass);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getWelcomeToActiTIME().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void minimizeFlyWindow2()
	{
		try {
			oPage.getStartExploringActiTIME().click();
			Thread.sleep(2000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void logOutUser2()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 13,dataProvider = "loginUser3Data")
	public void logInAsUSer3(String user,String pass)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pass);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getWelcomeToActiTIME().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
	public void minimizeFlyWindow3()
	{
		try {
			oPage.getStartExploringActiTIME().click();
			Thread.sleep(2000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 15)
	public void logOutUser3()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority =16, dataProvider = "loginData")
	public void adminLogin(String user,String pwd)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pwd);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void minimizeFlyWindow4()
	{
		try {
			oPage.getMinimizeFlyOutWindow().click();
			Thread.sleep(1000);
			oPage.getMinimizeFlyOutWindow().click();
			Thread.sleep(1000);
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 18,dataProvider = "modifyUsersPassData")
	public void modifyUsersPassword(String pass,String pwd,String pass1,String pwd1,String pass2,String pwd2)
	{
		try {
			//to access users
			oPage.getUSERSSection().click();
			Thread.sleep(1000);
			//modify Users password
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']")).click();
			Thread.sleep(1000);
			oPage.getPassword1().clear();
			Thread.sleep(1000);
			oPage.getpasswordCopy().clear();
			Thread.sleep(1000);
			oPage.getPassword1().sendKeys(pass);
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys(pwd);
			Thread.sleep(1000);
			oPage.getsaveChanges().click();
			Thread.sleep(3000);
			
			//modify user2 password
			oBrowser.findElement(By.xpath("//span[text()='Demo, Thilak']")).click();
			Thread.sleep(1000);
			oPage.getPassword1().clear();
			Thread.sleep(1000);
			oPage.getpasswordCopy().clear();
			Thread.sleep(1000);
			oPage.getPassword1().sendKeys(pass1);
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys(pwd1);
			Thread.sleep(1000);
			oPage.getsaveChanges().click();
			Thread.sleep(3000);

			//modify user3 password
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ravi']")).click();
			Thread.sleep(1000);
			oPage.getPassword1().clear();
			Thread.sleep(1000);
			oPage.getpasswordCopy().clear();
			Thread.sleep(1000);
			oPage.getPassword1().sendKeys(pass2);
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys(pwd2);
			Thread.sleep(1000);
			oPage.getsaveChanges().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void logOutAdmin()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 20,dataProvider = "loginUser11Data")
	public void logInAsUser11(String user,String pass)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pass);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 21)
	public void logOutUser11()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 22,dataProvider = "loginUser21Data")
	public void logInAsUser21(String user,String pass)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pass);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 23)
	public void logOutUser21()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 24,dataProvider = "loginUser31Data")
	public void logInAsUSer31(String user,String pass)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pass);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 25)
	public void logOutUser31()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 26,dataProvider = "loginData")
	public void logInAsAdmin1(String user,String pwd)
	{
		try {
			oPage.getUserName().sendKeys(user);
			Thread.sleep(1000);
			oPage.getPassword().sendKeys(pwd);
			Thread.sleep(1000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			Assert.assertTrue(oPage.getEnterTimeTrack().isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 27)
	public void minimizeFlyWindow41()
	{
		try {
			oPage.getMinimizeFlyOutWindow().click();
			Thread.sleep(1000);
			oPage.getMinimizeFlyOutWindow().click();
			Thread.sleep(1000);
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 28)
	public void deleteUsers()
	{
		try {
			oPage.getUSERSSection().click();
			Thread.sleep(1000);
			// delete User1
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']")).click();
			Thread.sleep(1000);
			oPage.getuserDataLightBox_deleteBtn().click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1500);
			WebElement users=oBrowser.findElement(By.xpath("//span[text()='Demo, Ranav']"));
			Assert.assertFalse(users.isDisplayed());
			
			//delete User2
			oBrowser.findElement(By.xpath("//span[text()='Demo, Thilak']")).click();
			Thread.sleep(1000);
			oPage.getuserDataLightBox_deleteBtn().click();
			Alert oAlert2=oBrowser.switchTo().alert();
			String content1=oAlert2.getText();
			System.out.println(content1);
			oAlert2.accept();
			Thread.sleep(1500);
			WebElement users1=oBrowser.findElement(By.xpath("//span[text()='Demo, Thilak']"));
			Assert.assertFalse(users1.isDisplayed());
			
			//delete User3
			oBrowser.findElement(By.xpath("//span[text()='Demo, Ravi']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(1500);
			WebElement users2=oBrowser.findElement(By.xpath("//span[text()='Demo, Ravi']"));
			Assert.assertFalse(users2.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 29)
	public void logOutAdmin1()
	{
		try {
			oPage.getLogout().click();
			Thread.sleep(1000);
			String title=oPage.getheaderName().getText();
			Assert.assertEquals("Please identify yourself",title);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 30)
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

	@DataProvider(name ="createUsersData")
	public Object[][]getUsersData()
	{
		return new Object[][] {{"Ranav","Demo","qwer@gmail.com","Ranavrakshi","qwer@123","qwer@123"},{"Thilak","Demo","qwer@gmail.com","Thilakthili","asdf@123","asdf@123"},{"Ravi","Demo","qwer@gmail.com","Raviraj","zxcv@123","zxcv@123"}};
	}
	
	@DataProvider(name="loginUser1Data")
	public Object[][]getUser1LoginData()
	{
		return new Object[][] {{"Ranavrakshi","qwer@123"}};
	}

	@DataProvider(name="loginUser2Data")
	public Object[][]getUser2LoginData()
	{
		return new Object[][] {{"Thilakthili","asdf@123"}};
	}
	
	@DataProvider(name="loginUser3Data")
	public Object[][]getUser3LoginData()
	{
		return new Object[][] {{"Raviraj","zxcv@123"}};
	}
	
	@DataProvider(name ="modifyUsersPassData")
	public Object[][]getModifyUsersPassData()
	{
		return new Object[][] {{"asdf@123","asdf@123","zxcv@123","zxcv@123","qwer@123","qwer@123"}};
	}
	
	@DataProvider(name="loginUser11Data")
	public Object[][]getUser11LoginData()
	{
		return new Object[][] {{"Ranavrakshi","asdf@123"}};
	}
	
	@DataProvider(name="loginUser21Data")
	public Object[][]getUser21LoginData()
	{
		return new Object[][] {{"Thilakthili","zxcv@123"}};
	}
	
	@DataProvider(name="loginUser31Data")
	public Object[][]getUser31LoginData()
	{
		return new Object[][] {{"Raviraj","qwer@123"}};
	}
}
