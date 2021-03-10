package com.thbs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.thbs.qa.base.BasePage;
import com.thbs.qa.pageobjects.LoginPageObject;

import junit.framework.Assert;

public class LoginPageTest extends BasePage {
	LoginPageObject loginpage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void checkLogin()
	{
		loginpage=new LoginPageObject();
		loginpage.login();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
