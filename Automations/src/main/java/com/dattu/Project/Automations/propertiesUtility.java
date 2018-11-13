package com.dattu.Project.Automations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Stack;

public class propertiesUtility {
private static FileInputStream fip;
private static Properties pr;
public propertiesUtility(String filepath) throws IOException {
	fip =new FileInputStream(filepath);
	pr=new Properties();
	pr.load(fip);
	
}
public static String getPropertyValue(String key) 
{
	String value=pr.getProperty(key);
	return value;
}

}
