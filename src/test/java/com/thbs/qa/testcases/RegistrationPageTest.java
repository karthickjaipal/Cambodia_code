package com.thbs.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thbs.qa.base.BasePage;
import com.thbs.qa.generic_methods.WebElementMethods;
import com.thbs.qa.pageobjects.HomePageObject;
import com.thbs.qa.pageobjects.LoginPageObject;
import com.thbs.qa.pageobjects.RegistrationPageObject;
import com.thbs.qa.util.ReadExcel;

public class RegistrationPageTest extends BasePage {
	LoginPageObject loginpage; 
	HomePageObject homepage;
	RegistrationPageObject registerpage;
	WebElementMethods webmethods=new WebElementMethods();

	public RegistrationPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPageObject();
		homepage=loginpage.login();
		registerpage=homepage.clickRegisterCustomer();
		Reporter.log("#############################################################",true);
		Reporter.log("Test case Execution Started !!!!",true);
	}

	@Test
	public void registerCustomer_TC_001()
	{
		try{
			
			
			Reporter.log("Starting Life(1+1) registration.....",true);
			String val=ReadExcel.readExcelData(0,0,1);
			System.out.println(val);
			
			registerpage.enterMsisdn("070013876");
			registerpage.clickSearch();
			Reporter.log("Entering customer details.....",true);
			registerpage.enterFirstName("TestLife");
			registerpage.enterSurName("Test");
			registerpage.enterGender("F");
			registerpage.enterAge(25);
			registerpage.selectLanguage("English");
			Reporter.log("Selected Smart Life......");
			registerpage.selectOfferId(1);
			Reporter.log("Selected Smart Life cover level......",true);
			registerpage.selectLifeCoverLevel(2);
			//To input as 1 in case of Life(1+1)
			Reporter.log("Entering Life Insured relative details.....",true);
			registerpage.selectBeneficiary(1);
			registerpage.enterLifeBeneficiaryMsisdn("070125856");
			registerpage.enterLifeBeneficiaryName("Testlife");
			registerpage.enterLifeBeneficiarySurName("ben");
			registerpage.enterLifeBeneficiaryAge(25);
			registerpage.selectBeneficiaryGender("M");
			registerpage.selectLifeBeneficiaryRelation("Spouse");
			registerpage.clickSaveBtn();
			registerpage.clickConfirmationYes();
			Assert.assertTrue(webmethods.isElementDisplayed(driver.findElement(By.xpath("//div[@class='pagetitle']/h3[.='Success']"))));
			Reporter.log("Life(1+1) registration completed",true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void registerCustomer_TC_002()
	{
		try
		{
			Reporter.log("Starting Life(1+0) registration.....",true);
			registerpage.enterMsisdn("070134119");
			registerpage.clickSearch();
			Reporter.log("Entering customer details.....",true);
			registerpage.enterFirstName("TestLife");
			registerpage.enterSurName("Test");
			registerpage.enterGender("F");
			registerpage.enterAge(25);
			registerpage.selectLanguage("English");
			Reporter.log("Selected Smart Life......");
			registerpage.selectOfferId(1);
			Reporter.log("Selected Smart Life cover level......",true);
			registerpage.selectLifeCoverLevel(2);
			//To input as 1 in case of Life(1+1)
			Reporter.log("Entering Life Nominee details.....",true);
			registerpage.selectBeneficiary(2);
			registerpage.enterLifeNomineeMsisdn("070125856");
			registerpage.enterLifeNomineeName("Testlife");
			registerpage.enterLifeNomineeSurName("ben");
			registerpage.enterLifeNomineeAge(25);
			registerpage.selectNomineeGender("M");
			registerpage.selectLifeNomineeRelation("Spouse");
			registerpage.clickSaveBtn();
			registerpage.clickConfirmationYes();
			Assert.assertTrue(webmethods.isElementDisplayed(driver.findElement(By.xpath("//div[@class='pagetitle']/h3[.='Success']"))));
			Reporter.log("Life(1+0) registration completed",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Test
	public void registerCustomer_TC_003()
	{
		try{
			Reporter.log("Starting Life(1+1) registration.....",true);
			String val=ReadExcel.readExcelData(0,0,1);
			System.out.println(val);
			registerpage.enterMsisdn("070163876");
			registerpage.clickSearch();
			Reporter.log("Entering customer details.....",true);
			registerpage.enterFirstName("TestLife");
			registerpage.enterSurName("Test");
			registerpage.enterGender("F");
			registerpage.enterAge(25);
			registerpage.selectLanguage("English");
			Reporter.log("Selected Smart Life......");
			registerpage.selectOfferId(1);
			Reporter.log("Selected Smart Life cover level......",true);
			registerpage.selectLifeCoverLevel(3);
			//To input as 1 in case of Life(1+1)
			Reporter.log("Entering Life Insured relative details.....",true);
			registerpage.selectBeneficiary(1);
			registerpage.enterLifeBeneficiaryMsisdn("070125856");
			registerpage.enterLifeBeneficiaryName("Testlife");
			registerpage.enterLifeBeneficiarySurName("ben");
			registerpage.enterLifeBeneficiaryAge(25);
			registerpage.selectBeneficiaryGender("M");
			registerpage.selectLifeBeneficiaryRelation("Spouse");
			registerpage.clickSaveBtn();
			registerpage.clickConfirmationYes();
			Assert.assertTrue(webmethods.isElementDisplayed(driver.findElement(By.xpath("//div[@class='pagetitle']/h3[.='Success']"))));
			Reporter.log("Life(1+1) registration completed",true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void registerCustomer_TC_004()
	{
		try{
			Reporter.log("Starting Life(1+0) registration.....",true);
			registerpage.enterMsisdn("070017619");
			registerpage.clickSearch();
			Reporter.log("Entering customer details.....",true);
			registerpage.enterFirstName("TestLife");
			registerpage.enterSurName("Test");
			registerpage.enterGender("F");
			registerpage.enterAge(25);
			registerpage.selectLanguage("English");
			Reporter.log("Selected Smart Life......");
			registerpage.selectOfferId(1);
			Reporter.log("Selected Smart Life cover level......",true);
			registerpage.selectLifeCoverLevel(3);
			//To input as 1 in case of Life(1+1)
			Reporter.log("Entering Life Nominee details.....",true);
			registerpage.selectBeneficiary(2);
			registerpage.enterLifeNomineeMsisdn("070125856");
			registerpage.enterLifeNomineeName("Testlife");
			registerpage.enterLifeNomineeSurName("ben");
			registerpage.enterLifeNomineeAge(25);
			registerpage.selectNomineeGender("M");
			registerpage.selectLifeNomineeRelation("Spouse");
			registerpage.clickSaveBtn();
			registerpage.clickConfirmationYes();
			Assert.assertTrue(webmethods.isElementDisplayed(driver.findElement(By.xpath("//div[@class='pagetitle']/h3[.='Success']"))));
			Reporter.log("Life(1+0) registration completed",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void registerCustomer_TC_005()
	{
		try{
			Reporter.log("Starting HP registration.....",true);
			registerpage.enterMsisdn("070715634");
			registerpage.clickSearch();
			Reporter.log("Entering customer details.....",true);
			registerpage.enterFirstName("TestHP");
			registerpage.enterSurName("Test");
			registerpage.enterGender("F");
			registerpage.enterAge(25);
			registerpage.selectLanguage("English");
			Reporter.log("Selected Smart HP......");
			registerpage.selectOfferId(2);
			registerpage.clickSaveBtn();
			registerpage.clickConfirmationYes();
			Assert.assertTrue(webmethods.isElementDisplayed(driver.findElement(By.xpath("//div[@class='pagetitle']/h3[.='Success']"))));
			Reporter.log("HP registration completed.....",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown()
	{   
		Reporter.log("Test case Execution Ended !!!!",true);
		Reporter.log("#############################################################",true);
		driver.quit();
	}

}
