package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook xssf;
	public ExcelDataProvider() throws IOException {
	File file=new File("D:/workspace/NEWONE/TestData/Data.xlsx");
	FileInputStream fis=new FileInputStream(file);
	 xssf=new XSSFWorkbook(fis);
	 
}
	public String getData(String SheetName,int row,int column)
	{
		
		return xssf.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}
}


