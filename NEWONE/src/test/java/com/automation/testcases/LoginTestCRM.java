package com.automation.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginCRM;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.HelperClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginTestCRM extends BaseClass {

//	ExcelDataProvider ex;
@Test
public void loginApp() throws IOException
{
	
	  logger=er.createTest("LoginTest");
	  logger.log(Status.INFO, "Login to amazon");
	  logger.log(Status.PASS, "Title verified");
	//driver=BrowserFactory.startBrowser(driver, "chrome", "https://ui.freecrm.com/");
	LoginCRM loginCRM=PageFactory.initElements(driver, LoginCRM.class);
	loginCRM.LoginToCRM(ex.getData("Login", 0, 0),ex.getData("Login", 0, 1));
	HelperClass.getscreenShots(driver);
}
}
