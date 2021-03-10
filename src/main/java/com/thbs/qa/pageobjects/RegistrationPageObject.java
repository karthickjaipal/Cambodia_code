package com.thbs.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thbs.qa.base.BasePage;
import com.thbs.qa.constants.TimeConstants;
import com.thbs.qa.util.GenericMethods;

public class RegistrationPageObject extends BasePage {
	
	WebDriverWait wait=new WebDriverWait(driver,TimeConstants.EXPLICIT_WAIT);
	
	@FindBy(xpath="//input[@id='msisdn']")
	private WebElement msisdn ;
	
	@FindBy(xpath="//div[@id='search-icon']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//input[@id='custName']")
	private WebElement cusFirstName;
	
	@FindBy(xpath="//input[@id='sname']")
	private WebElement cusSurName;
	
	@FindBy(xpath="//input[@id='gender']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@id='gender' and @value='M']")
	private WebElement Male;
	
	@FindBy(xpath="//input[@id='gender' and @value='F']")
	private WebElement Female;
	
	@FindBy(xpath="//input[@id='age']")
	private WebElement cusAge;
	
	@FindBy(xpath="//input[@id='nid']")
	private WebElement nid;
	
	@FindBy(xpath="//input[@id='smsLanguage']")
	private WebElement smslang;
	
	@FindBy(xpath="//input[@id='smsLanguage' and @value='English']")
	private WebElement Englishlang;
	
	@FindBy(xpath="//input[@id='smsLanguage' and @value='Khmer']")
	private WebElement Khmerlang;
	
	@FindBy(xpath="//input[@id='offerId']")
	private WebElement product;
	
	@FindBy(xpath="//input[@id='offerId' and @value='1']")
	private WebElement Life_product;
	
	@FindBy(xpath="//input[@id='offerId' and @value='2']")
	private WebElement Hospital_product;
	
	@FindBy(xpath="//select[@id='offerCoverIdLife']")
	private WebElement lifeCover;
	
	@FindBy(xpath="//input[@id='isInsuredRelative']")
	private WebElement addbeneficiary;
	
	@FindBy(xpath="//input[@id='isInsuredRelative' and @value='1']")
	private WebElement lifeBeneficiary;
	
	@FindBy(xpath="//input[@id='isInsuredRelative' and @value='0']")
	private WebElement lifeNominee;
	
	@FindBy(xpath="//input[@id='irdMsisdn']")
	private WebElement lifeBeneficiaryMsisdn;
	
	@FindBy(xpath="//input[@id='irdRelName']")
	private WebElement lifeBeneficiaryName;
	
	@FindBy(xpath="//input[@id='irdRelSurName']")
	private WebElement lifeBeneficiarySurName;
	
	@FindBy(xpath="//input[@id='irdRelAge']")
	private WebElement lifeBeneficiaryAge;
	
	@FindBy(xpath="//input[@id='irdGender']")
	private WebElement lifeBeneficiaryGender;
	
	@FindBy(xpath="//input[@id='irdNid']")
	private WebElement lifeBeneficiaryNID;
	
	@FindBy(xpath="//input[@id='irdGender' and @value='M']")
	private WebElement lifeBeneficiaryMale;
	
	@FindBy(xpath="//input[@id='irdGender' and @value='F']")
	private WebElement lifeBeneficiaryFemale;
	
	@FindBy(xpath="//select[@id='irdRelation']")
	private WebElement lifeBeneficiaryRelation;
	
    @FindBy(xpath="//input[@id='insMsisdn']")
	private WebElement lifeNomineeMsisdn;
	
	@FindBy(xpath="//input[@id='insRelName']")
	private WebElement lifeNomineeName;
	
	@FindBy(xpath="//input[@id='insRelSurName']")
	private WebElement lifeNomineeSurName;
	
	@FindBy(xpath="//input[@id='insRelAge']")
	private WebElement lifeNomineeAge;
	
	@FindBy(xpath="//input[@id='insGender']")
	private WebElement lifeNomineeGender;
	
	@FindBy(xpath="//input[@id='insNid']")
	private WebElement lifeNomineeNID;
	
	@FindBy(xpath="//input[@id='insGender' and @value='M']")
	private WebElement lifeNomineeMale;
	
	@FindBy(xpath="//input[@id='insGender' and @value='F']")
	private WebElement lifeNomineeFemale;
	
	@FindBy(xpath="//select[@id='insRelation']")
	private WebElement lifeNomineeRelation;
	
	@FindBy(xpath="//li[@id='saveBtn']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//li[@id='clearBtn']")
	private WebElement clearBtn;
	
	@FindBy(xpath="//li[@id='popup_ok']")
	private WebElement confirmationOK;
	
	@FindBy(xpath="//li[@id='popup_cancel']")
	private WebElement confirmationCancel;
	
	public RegistrationPageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMsisdn(String Msisdn)
	{
		wait.until(ExpectedConditions.visibilityOf(msisdn)).sendKeys(Msisdn);
	}
	
	public void clickSearch()
	{
		wait.until(ExpectedConditions.visibilityOf(searchBtn)).click();
		
	}
	
	public void enterFirstName(String fname)
	{
		wait.until(ExpectedConditions.visibilityOf(cusFirstName)).sendKeys(fname);
		
	}
	
	public void enterSurName(String sname)
	{
		
		wait.until(ExpectedConditions.visibilityOf(cusSurName)).sendKeys(sname);
		
	}
	
	public void enterGender(String val)
	{
		String gen=gender.getAttribute("value");
		if(gen.equalsIgnoreCase(val))
		{
			wait.until(ExpectedConditions.visibilityOf(Male)).click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(Female)).click();
			
		}
	}
	
	public void enterAge(int val)
	{
		Integer age_value =new Integer(val);
		wait.until(ExpectedConditions.visibilityOf(cusAge)).sendKeys(age_value.toString());
	}
	
	public void enterNid(String val)
	{
		wait.until(ExpectedConditions.visibilityOf(nid)).sendKeys(val);
	}
	
	public void selectLanguage(String val)
	{
		String lang_option=smslang.getAttribute("value");
		if(lang_option.equalsIgnoreCase(val))
		{
			wait.until(ExpectedConditions.visibilityOf(Englishlang)).click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(Khmerlang)).click();
		}
		
	}
	
	public void selectOfferId(int val)
	{
		String offerid=product.getAttribute("value");
		Integer offer_id =new Integer(offerid);
		if(offer_id.intValue()==val)
		{
			wait.until(ExpectedConditions.visibilityOf(Life_product)).click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(Hospital_product)).click();
		}
	}
	
	public void selectLifeCoverLevel(int val)
	{
		if(val==2)
		{
		    GenericMethods.selectDropDownOption(lifeCover, "2");
		}
		else
		{
			GenericMethods.selectDropDownOption(lifeCover, "3");
		}
	}
	
	public void selectBeneficiary(int val)
	{
		String benValue=addbeneficiary.getAttribute("value");
		Integer ben=new Integer(benValue);
		if(ben.intValue()==val)
		{
			wait.until(ExpectedConditions.visibilityOf(lifeBeneficiary)).click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(lifeNominee)).click();
		}
	}
	
	public void enterLifeBeneficiaryMsisdn(String ben_msisdn)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeBeneficiaryMsisdn)).sendKeys(ben_msisdn);
	}
	
	public void enterLifeBeneficiaryName(String ben_fname)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeBeneficiaryName)).sendKeys(ben_fname);
	}
	
	public void enterLifeBeneficiarySurName(String ben_sname)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeBeneficiarySurName)).sendKeys(ben_sname);
	}
	
	public void enterLifeBeneficiaryAge(int ben_age)
	{
		Integer benAge=new Integer(ben_age);
		wait.until(ExpectedConditions.visibilityOf(lifeBeneficiaryAge)).sendKeys(benAge.toString());
	}
	
	public void selectBeneficiaryGender(String val)
	{
		String gen=lifeBeneficiaryGender.getAttribute("value");
		if(gen.equalsIgnoreCase(val))
		{
			wait.until(ExpectedConditions.visibilityOf(lifeBeneficiaryMale)).click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(lifeBeneficiaryFemale)).click();
		}
	}
	
	public void enterLifeBeneficiaryNID(String nid)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeBeneficiaryNID)).sendKeys(nid);
	}
	
	public void selectLifeBeneficiaryRelation(String val)
	{
		GenericMethods.selectDropDownOption(lifeBeneficiaryRelation, val);
	}
	
	public void enterLifeNomineeMsisdn(String ben_msisdn)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeNomineeMsisdn)).sendKeys(ben_msisdn);
		
	}
	
	public void enterLifeNomineeName(String ben_fname)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeNomineeName)).sendKeys(ben_fname);
		
	}
	
	
	public void enterLifeNomineeSurName(String ben_sname)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeNomineeSurName)).sendKeys(ben_sname);
		
	}
	
	public void enterLifeNomineeAge(int ben_age)
	{
		Integer benAge=new Integer(ben_age);
		wait.until(ExpectedConditions.visibilityOf(lifeNomineeAge)).sendKeys(benAge.toString());
		
	}
	
	public void selectNomineeGender(String val)
	{
		String gen=lifeNomineeGender.getAttribute("value");
		if(gen.equalsIgnoreCase(val))
		{
			wait.until(ExpectedConditions.visibilityOf(lifeNomineeMale)).click();
			
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(lifeNomineeFemale)).click();
	    }
	}
	
	public void enterLifeNomineeNID(String nid)
	{
		wait.until(ExpectedConditions.visibilityOf(lifeNomineeNID)).sendKeys(nid);
	}
	
	public void selectLifeNomineeRelation(String val)
	{
		GenericMethods.selectDropDownOption(lifeNomineeRelation, val);
	}
	
	public void clickSaveBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(SaveBtn)).click();
	}
	
	public void clickClearBtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(clearBtn)).click();
	}
	
	public void clickConfirmationYes()
	{
		wait.until(ExpectedConditions.visibilityOf(confirmationOK)).click();
	}
	
	public void clickConfirmationNo()
	{
		wait.until(ExpectedConditions.visibilityOf(confirmationCancel)).click();
		
	}
	

}
