package com.thbs.qa.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.thbs.qa.constants.Constants;

public class ReadExcel {
	
	
	public static String readExcelData(int index,int rownum,int cellnum)
	{
		String value="";
		try{
		FileInputStream fis=new FileInputStream(Constants.EXCEL_PATH);
		Workbook wb= WorkbookFactory.create(fis);
		Cell cell = wb.getSheetAt(index).getRow(rownum).getCell(cellnum);
		value=cell.toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	
	public void prepareRegistrationData()
	{
		/*List<>
		RegisterCustomerdto regdto= new RegisterCustomerdto();
		String msisdn=ReadExcel.readExcelData(0, 0, 1);
		regdto.setMsisdn(msisdn);*/
		
	}
}


