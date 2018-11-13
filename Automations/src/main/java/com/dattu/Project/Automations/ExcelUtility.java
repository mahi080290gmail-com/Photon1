package com.dattu.Project.Automations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
private static FileInputStream fip;
private static Workbook wb;

public ExcelUtility(String file) throws InvalidFormatException, IOException {
fip = new FileInputStream(file);
wb=WorkbookFactory.create(fip);
}
public static String getcelldata(String Sheetname, int rowno, int columno)
{
	Sheet sh=wb.getSheet(Sheetname);
	Row r=sh.getRow(rowno);
	Cell c=r.getCell(columno);
	String value=c.getStringCellValue();
	return value;
	
}

	
}
