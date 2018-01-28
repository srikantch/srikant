package com.action;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xlapi 
{
	public String getdata(String Shname,int rowNum,int columnName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String s="D:\\MNP CODE FILE\\mnp code file2\\Gmail\\TestData\\testdata1.xlsx";
		FileInputStream fis=new FileInputStream(s);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(Shname);
		Row rw=sh.getRow(rowNum);
		String data=rw.getCell(columnName).getStringCellValue();
		return data;
		
	}
	public void setdata(String sname,int rownum,int columnname,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String s="D:\\MNP CODE FILE\\mnp code file2\\Gmail\\TestData\\testdata1.xlsx";
		FileInputStream fis=new FileInputStream(s);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sname);
		Row rw=sh.getRow(rownum);
		Cell cal=rw.createCell(columnname);
		cal.setCellType(cal.CELL_TYPE_STRING);
		FileOutputStream fos=new FileOutputStream(s);
		cal.setCellValue(data);
		wb.write(fos);
		wb.close();
	}

}
