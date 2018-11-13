  package com.dattu.Project.Automations;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Pojo {


 private static String configfile="C:\\Users\\dattu\\git\\repository2\\mahesh\\Automations\\src\\main\\java\\com\\dattu\\Project\\Automations\\obejectRepository\\config.properties";
 private static String orfile="C:\\Users\\dattu\\git\\repository2\\mahesh\\Automations\\src\\main\\java\\com\\dattu\\Project\\Automations\\obejectRepository\\oR.properties";
 private static String excelfile="C:\\Users\\dattu\\git\\repository2\\mahesh\\Automations\\src\\main\\java\\com\\dattu\\Project\\Automations\\obejectRepository\\Book1.xlsx";
 
 
 public static propertiesUtility getconfigFile() throws IOException 
 {
	 
	 propertiesUtility pr = new propertiesUtility(configfile);
	return pr;
 }
 public static propertiesUtility getorFile() throws IOException 
 {
	 propertiesUtility pr = new propertiesUtility(orfile);
	return pr;
 }
 public static ExcelUtility getexcelFile() throws IOException, InvalidFormatException
 {
	ExcelUtility pr = new ExcelUtility(excelfile);
	return pr;
	 
 }
 
}
