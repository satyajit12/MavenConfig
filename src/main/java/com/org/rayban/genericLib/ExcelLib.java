package com.org.rayban.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {

	public String getData(String Filepath,String sheetname,int rownumber,int cellvalue) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(Filepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row rw = sh.getRow(rownumber);
	DataFormatter dataformat = new DataFormatter();
	Cell cell = rw.getCell(cellvalue);
	String cellValue1 = dataformat.formatCellValue(cell);
	return cellValue1;
	
	
	}
	
	public String getStringData(String Filepath,String sheetname,int rownumber,int cellvalue) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(Filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row rw = sh.getRow(rownumber);
		String cellValue1 =  rw.getCell(cellvalue).getStringCellValue();
		return cellValue1;
	
	}
	
	
}
