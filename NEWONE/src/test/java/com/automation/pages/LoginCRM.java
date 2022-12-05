package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginCRM {
	WebDriver driver;

	public LoginCRM(WebDriver driver) {
		//super();
		this.driver = driver;
	}
	@FindBy(name="email") WebElement email1;
	@FindBy(name="password") WebElement password1;
	@FindBy(how = How.CSS, using="div[class~='submit']") WebElement classNames;
	
	public void LoginToCRM(String email11,String password11)
	{
		email1.sendKeys("purushothamallam332@gmail.com");
		password1.sendKeys("888@Hello");
		
		
		classNames.click();
		// niceeee
	}
}
