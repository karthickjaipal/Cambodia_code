package com.thbs.qa.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thbs.qa.base.BasePage;

public class HomePageObject extends BasePage {
	
	@FindBy(xpath="//li[@id='menu1']")
	private WebElement homeMenu;
	
	@FindBy(xpath="//li[@id='menu5']")
	private WebElement customerManagement;
	
	@FindBy(xpath="//li[@id='submenu22']")
	private WebElement registerCustomer;
	
	@FindBy(xpath="//li[@id='submenu23']")
	private WebElement deregisterCustomer;
	
	@FindBy(xpath="//li[@id='submenu47']")
	private WebElement confirmCustomer;
	
	
	public HomePageObject()
    {
		PageFactory.initElements(driver, this);
    }
	
	public void clickHomeMenu()
	{
		homeMenu.click();
	}
	
	public void clickCustomerManagement()
	{
		customerManagement.click();
	}
	
	public RegistrationPageObject clickRegisterCustomer()
	{
		homeMenu.click();
		customerManagement.click();
		registerCustomer.click();
		return  new RegistrationPageObject();
	}
	
	public RegistrationPageObject clickDeregisterCustomer()
	{
		homeMenu.click();
		customerManagement.click();
		deregisterCustomer.click();
		return  new RegistrationPageObject();
	}
	
	public ConfirmCustomerPageObject clickConfirmCustomer()
	{
		homeMenu.click();
		customerManagement.click();
		confirmCustomer.click();
		return  new ConfirmCustomerPageObject();
	}

	
	
	
}
