package com.thbs.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.thbs.qa.constants.Constants;
import com.thbs.qa.constants.TimeConstants;

public class BasePage {
     public static Properties prop;
     public static WebDriver driver;
	
	public BasePage()
	{
		try{
	    prop =new Properties();
		File file=new File(Constants.FILEPATH);
		FileInputStream fis=new FileInputStream(file);
	    prop.load(fis);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	
	public static void initialization()
	{
		System.setProperty(Constants.CHROME_KEY, Constants.CHROME_VALUE);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeConstants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeConstants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
}
