package com.sgtesting.seleniumassignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9AdvancedScenarioScenarios2 
{

	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		logIn();
		minimizeFlyWindow();
		createUser1();
		logOutAdmin();
		logInAsUser1();
		minimizeFlyWindow1();
		createUser2();
		logOutUser1();
		logInAsUser2();
		minimizeFlyWindow2();
		createUser3();
		logOutUser2();
		logInAsUser3();
		minimizeFlyWindow3();
		logOutUser3();
		logInAsUser21();
		modifyUser3();
		logOutUser21();
		logInAsUser31();
		logOutUser31();
		logInAsUser11();
		modifyUser2();
		logOutUser11();
		logInAsUser22();
		logOutUser22();
		logInAdmin();
		minimizeFlyWindowA1();
		modifyUser1();
		logOutAdmin1();
		logInAsUser12();
		logOutUser12();
		logInAsUser23();
		deleteUser3();
		logOutUser23();
		logInAsUser13();
		deleteUser2();
		logOutUser13();
		logInAdmin1();
		minimizeFlyWindowA2();
		deleteUser1();
		logOutAdmin12();
		closeApplication();
		
	}
	
	private static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
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

	private static void logIn()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
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

	private static void createUser1()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("asdfg@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("asdf@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("asdf@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutAdmin()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser1()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("asdf@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow1()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("qwer@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("qwer@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwer@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser1()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser2()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("qwer@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow2()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			oBrowser.findElement(By.name("email")).sendKeys("zxcv@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("zxcv@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser2()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser3()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindow3()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser3()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser21()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("qwer@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, User3']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("asdf@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("asdf@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser21()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser31()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("asdf@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser31()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser11()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("asdf@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void modifyUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, User2']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser11()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser22()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser22()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAdmin()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindowA1()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUser1()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("qwer@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwer@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutAdmin1()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser12()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("qwer@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*private static void minimizeFlyWindow12()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	private static void logOutUser12()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser23()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("zxcv@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, User3']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(1500);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logOutUser23()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAsUser13()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("qwer@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, User2']")).click();
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
	
	private static void logOutUser13()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logInAdmin1()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyWindowA2()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, User1']")).click();
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
	
	private static void logOutAdmin12()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
