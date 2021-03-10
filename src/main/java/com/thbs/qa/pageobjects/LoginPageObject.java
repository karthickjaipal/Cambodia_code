package com.thbs.qa.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thbs.qa.base.BasePage;

import junit.framework.Assert;

public class LoginPageObject extends BasePage {
	LoginPageObject loginpage;
	
	@FindBy(xpath="//input[@id='loginId']")
	private WebElement userId;
	
	@FindBy(xpath="//input[@id='userHash']")
	private WebElement password;
	
	@FindBy(xpath="//span[.='Login']")
	private WebElement loginbtn;
	
	public LoginPageObject()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname)
	{
		userId.sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	public HomePageObject login()
	{
		loginpage=new LoginPageObject();
		loginpage.enterUserName(prop.getProperty("username"));
		loginpage.enterPassword(prop.getProperty("password"));
		loginpage.clickLogin();
		Assert.assertTrue(driver.findElement(By.xpath("//li[@id='menu1']")).isDisplayed());
	    return new HomePageObject();
	}
	
	
	

}
