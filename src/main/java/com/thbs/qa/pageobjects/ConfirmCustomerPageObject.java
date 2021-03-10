package com.thbs.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thbs.qa.base.BasePage;
import com.thbs.qa.constants.TimeConstants;

public class ConfirmCustomerPageObject extends BasePage {
	WebDriverWait wait=new WebDriverWait(driver,TimeConstants.EXPLICIT_WAIT);
	
	@FindBy(xpath="//input[@id='msisdn']")
	private WebElement msisdn;
	
	@FindBy(xpath="//div[@id='search-icon']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//input[@id='offerCoverId']")
	private WebElement Product;
	
	@FindBy(xpath="//input[@id='offerCoverId' and @value='2']")
	private WebElement smartLife1;
	
	@FindBy(xpath="//input[@id='offerCoverId' and @value='3']")
	private WebElement smartLife2;
	
	@FindBy(xpath="//input[@id='offerCoverId' and @value='4']")
	private WebElement smartHospital;
	
	@FindBy(xpath="//li[@id='saveBtn']")
	private WebElement confirmBtn;
	
	@FindBy(xpath="//li[@id='backBtn']")
	private WebElement backBtn;
	
	@FindBy(xpath="//li[@id='popup_ok']")
	private WebElement confirmationYes;
	
	@FindBy(xpath="//li[@id='popup_cancel']")
	private WebElement confirmationNo;
	
	public ConfirmCustomerPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMsisdn(String mobilenumber)
	{
		wait.until(ExpectedConditions.visibilityOf(msisdn)).sendKeys(mobilenumber);
		
	}
	
	public void clickSearch()
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
	}
	
	public void enterOfferCoverId(int val)
	{
		if(val==2)
		{
			wait.until(ExpectedConditions.visibilityOf(smartLife1)).click();
		}
		else if(val==3)
		{
			wait.until(ExpectedConditions.visibilityOf(smartLife2)).click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(smartHospital)).click();
		}
	}
	
	public void clickConfirm()
	{
		wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
	}
	
	public void clickBack()
	{
		wait.until(ExpectedConditions.elementToBeClickable(backBtn)).click();
	}
	
	public void clickConfirmationYes()
	{
		wait.until(ExpectedConditions.visibilityOf(confirmationYes)).click();
	}
	
	public void clickConfirmationNo()
	{
		wait.until(ExpectedConditions.visibilityOf(confirmationNo)).click();
	}
}
