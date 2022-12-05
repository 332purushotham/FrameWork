package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	//WebDriver driver;
	public static WebDriver startBrowser(WebDriver driver, String BrowserName, String AppUrl)
	{
		if(BrowserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else
		{
			
			System.out.println("not displayed any thing");
		}
		//driver.get("https://ui.freecrm.com/");
		driver.get(AppUrl);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
		}
	}
