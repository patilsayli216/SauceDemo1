package com.SauceDemo.UtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelsheet 
{
	@Test
	public void excelSheet() throws IOException
	{
		String address = "C:\\Users\\DELL\\Documents\\SauceLo.xlsx";
		 
		 FileInputStream file = new FileInputStream(address);
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 
		 String username = sheet.getRow(0).getCell(0).getStringCellValue();
		 System.out.println("Username : "+ username);
		 
		 String password = sheet.getRow(1).getCell(0).getStringCellValue();
		 System.out.println("Password : " + password);
		 
	}

}
