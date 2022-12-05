package com.automation.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.ExcelDataProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider ex;
	public ConfigDataProvider cd;
	public ExtentReports er;
	public ExtentTest logger;
	@BeforeSuite
	public void setUpSuite() throws IOException {
		 ex=new ExcelDataProvider();
		 //this is one two
		cd=new ConfigDataProvider();
		File file=new File("D:/workspace/NEWONE/Reports/learn_automation1.html");
		 ExtentSparkReporter reporter=new ExtentSparkReporter(file);
		er=new ExtentReports();
		er.attachReporter(reporter);
		//ExtentTest logger=er.createTest("LoginTest");
		
		er.flush();
	}
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startBrowser(driver,cd.getBrowser(),cd.getUrl());
		
	}
	
}
