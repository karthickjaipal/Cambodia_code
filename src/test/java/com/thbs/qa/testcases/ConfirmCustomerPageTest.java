package com.thbs.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thbs.qa.base.BasePage;
import com.thbs.qa.generic_methods.WebElementMethods;
import com.thbs.qa.pageobjects.ConfirmCustomerPageObject;
import com.thbs.qa.pageobjects.HomePageObject;
import com.thbs.qa.pageobjects.LoginPageObject;

public class ConfirmCustomerPageTest extends BasePage {
	LoginPageObject loginpage;
	HomePageObject homepage;
	ConfirmCustomerPageObject confirmationpage;
	WebElementMethods webElementMethods=new WebElementMethods();
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPageObject();
		homepage=loginpage.login();
		homepage.clickCustomerManagement();
		confirmationpage= homepage.clickConfirmCustomer();
		Reporter.log("#############################################################",true);
		Reporter.log("Test case Execution Started !!!!",true);
	}
	
	@Test
	public void confirmCustomer_TC_001()
	{
		Reporter.log("Starting Smart Life level 1 Confirmation",true);
		Reporter.log("Entering the msisdn",true);
		confirmationpage.enterMsisdn("070013876");
		Reporter.log("Selecting the product to confirm",true);
		confirmationpage.clickSearch();
		confirmationpage.enterOfferCoverId(2);
		Reporter.log("Clicking on confirmation",true);
		confirmationpage.clickConfirm();
		confirmationpage.clickConfirmationYes();
		Assert.assertTrue(webElementMethods.isElementDisplayed(driver.findElement(By.xpath("//div[@id='message_div']"))));
	}
	
	@Test
	public void confirmCustomer_TC_002()
	{
		Reporter.log("Starting Smart Life level 2 Confirmation",true);
		Reporter.log("Entering the msisdn",true);
		confirmationpage.enterMsisdn("070134119");
		Reporter.log("Selecting the product to confirm",true);
		confirmationpage.clickSearch();
		confirmationpage.enterOfferCoverId(3);
		Reporter.log("Clicking on confirmation",true);
		confirmationpage.clickConfirm();
		confirmationpage.clickConfirmationYes();
		Assert.assertTrue(webElementMethods.isElementDisplayed(driver.findElement(By.xpath("//div[@id='message_div']"))));
	}
	
	@Test
	public void confirmCustomer_TC_003()
	{
		Reporter.log("Starting Smart hospital Confirmation",true);
		Reporter.log("Entering the msisdn",true);
		confirmationpage.enterMsisdn("070715634");
		Reporter.log("Selecting the product to confirm",true);
		confirmationpage.clickSearch();
		confirmationpage.enterOfferCoverId(4);
		Reporter.log("Clicking on confirmation",true);
		confirmationpage.clickConfirm();
		confirmationpage.clickConfirmationYes();
		Assert.assertTrue(webElementMethods.isElementDisplayed(driver.findElement(By.xpath("//div[@id='message_div']"))));
	}
	
	@AfterMethod
	public void tearDown()
	{   
		Reporter.log("Test case Execution Ended !!!!",true);
		Reporter.log("#############################################################",true);
		driver.quit();
	}

}
