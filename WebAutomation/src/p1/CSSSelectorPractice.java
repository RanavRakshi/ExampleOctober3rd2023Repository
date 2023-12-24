package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Login();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void Login()
	{
		try {
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("#pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector(""));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
