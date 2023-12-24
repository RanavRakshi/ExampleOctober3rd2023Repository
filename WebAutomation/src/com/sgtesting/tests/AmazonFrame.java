package com.sgtesting.tests;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFrame {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		searchMobile();

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
			oBrowser.get("http://www.amazon.in/");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void searchMobile()
	{
		try {
			oBrowser.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");;
			Thread.sleep(1000);
			oBrowser.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
			Thread.sleep(3000);
			
			JavascriptExecutor js=(JavascriptExecutor)oBrowser;
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
