package com.automation.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.automation.pages.BaseClass;

public class HelperClass {
		// TODO Auto-generated constructor stub
	
		public static void getscreenShots(WebDriver driver) throws IOException
		{
		File file=	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:/workspace/NEWONE/Images/img1.jpg");
		//FileU.copyFile(file, dest);
	//	.copy(file, dest);
		FileUtils.copyFile(file, dest);
			
		}
	



}
