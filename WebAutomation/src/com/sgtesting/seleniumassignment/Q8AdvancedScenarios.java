package com.sgtesting.seleniumassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8AdvancedScenarios 
{
	public static WebDriver OBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		logIn();
		minimizeFlyWindow();
		createUsers();
		logOut();
		logInAsUser1();
		minimizeFlyWindow1();
		logOutUser1();
		logInAsUser2();
		minimizeFlyWindow2();
		logOutUser2();
		logInAsUSer3();
		minimizeFlyWindow3();
		logOutUser3();
		logInAsAdmin();
		minimizeFlyWindow4();
		modifyUsersEmail();
		logOutAdmin();
		logInAsUser11();
		logOutUser11();
		logInAsUser21();
		logOutUser21();
		logInAsUSer31();
		logOutUser31();
		logInAsAdmin1();
		minimizeFlyWindow41();
		deleteUsers();
		logOutAdmin1();
		closeApplication();

	}

	private static void launchBrowser()
	{
		try {
			OBrowser=new ChromeDriver();
			OBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try {
			OBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logIn()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow()
	{
		try {
			OBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUsers()
	{
		try {
			// click Users to create user
			OBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			// adding user1
			OBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("firstName")).sendKeys("User1");
			OBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			OBrowser.findElement(By.name("email")).sendKeys("asdfg@gmail.com");
			OBrowser.findElement(By.name("username")).sendKeys("User1");
			OBrowser.findElement(By.name("password")).sendKeys("asdf@123");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("asdf@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

			// adding user2
			OBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("firstName")).sendKeys("User2");
			OBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			OBrowser.findElement(By.name("email")).sendKeys("qwer@gmail.com");
			OBrowser.findElement(By.name("username")).sendKeys("User2");
			OBrowser.findElement(By.name("password")).sendKeys("qwer@123");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("qwer@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

			// adding user3
			OBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("firstName")).sendKeys("User3");
			OBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			OBrowser.findElement(By.name("email")).sendKeys("zxcv@gmail.com");
			OBrowser.findElement(By.name("username")).sendKeys("User3");
			OBrowser.findElement(By.name("password")).sendKeys("zxcv@123");
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOut()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logInAsUser1()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("asdf@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow1()
	{
		try {
			OBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOutUser1()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logInAsUser2()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("qwer@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow2()
	{
		try {
			OBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOutUser2()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logInAsUSer3()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("User3");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow3()
	{
		try {
			OBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOutUser3()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logInAsAdmin()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow4()
	{
		try {
			OBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUsersEmail()
	{
		try {
			//to access users
			OBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			//modify User1 password
			OBrowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("password")).sendKeys("qwer@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("qwer@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);

			//modify user2 password
			OBrowser.findElement(By.xpath("//span[text()='Demo, User2']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("password")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);

			//modify user3 password
			OBrowser.findElement(By.xpath("//span[text()='Demo, User3']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			OBrowser.findElement(By.name("password")).sendKeys("asdf@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("passwordCopy")).sendKeys("asdf@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOutAdmin()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser11()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("qwer@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOutUser11()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logInAsUser21()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOutUser21()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logInAsUSer31()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("User3");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("asdf@123");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logOutUser31()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsAdmin1()
	{
		try {
			OBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			OBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			OBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyWindow41()
	{
		try {
			OBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUsers()
	{
		try {
			OBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			// delete User1
			OBrowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert=OBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1500);
			
			//delete User2
			OBrowser.findElement(By.xpath("//span[text()='Demo, User2']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert2=OBrowser.switchTo().alert();
			String content1=oAlert2.getText();
			System.out.println(content1);
			oAlert2.accept();
			Thread.sleep(1500);
			
			//delete User3
			OBrowser.findElement(By.xpath("//span[text()='Demo, User3']")).click();
			Thread.sleep(1000);
			OBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert3=OBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(1500);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutAdmin1()
	{
		try {
			OBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try {
			OBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
