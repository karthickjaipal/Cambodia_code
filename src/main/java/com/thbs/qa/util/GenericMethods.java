package com.thbs.qa.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.thbs.qa.base.BasePage;


public class GenericMethods extends BasePage {
	
	public static void selectDropDownOption(WebElement ele, String val)
	{
		Select sel=new Select(ele);
		sel.selectByValue(val);
	}
	
	

}
