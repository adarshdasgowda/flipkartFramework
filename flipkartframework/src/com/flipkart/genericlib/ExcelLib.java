package com.flipkart.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib 
{
	// read data from the Excel sheet
	public String getExcelData(String sheet, int rowNum, int colNum) throws Throwable
	{
		//get the location of the excel sheet
		FileInputStream fis = new FileInputStream(".//testData//Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of sheet 1
		Sheet sh = wb.getSheet("Sheet1");
		//get the control of row 2
		Row row = sh.getRow(2);
		//read data from cell of row 2
		String data = row.getCell(colNum).getStringCellValue();
		wb.close();
		return data;
	}
	
	// write data to the Excel sheet
	public void setExcelData(String sheet, int rowNum, int colNum, String data) throws Throwable
	{
		//get the location of the excel sheet
		FileInputStream fis = new FileInputStream(".//testData//Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of sheet 1
		Sheet sh = wb.getSheet("Sheet1");
		//get the control of row 3
		Row row = sh.getRow(3);
		//write data to cell of row 3
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(".//testData//Test Data.xlsx");
		wb.write(fos);
		wb.close();
	}

}
