package com.nest.utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	private static XSSFWorkbook book;
	private static XSSFSheet sheet;
	
	public static String readDetails(int row,int col) throws IOException
	{
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\TEST.xlsx");
		book=new XSSFWorkbook(file);
		sheet= book.getSheetAt(0);
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
}
