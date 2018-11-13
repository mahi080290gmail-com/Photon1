package com.dattu.Project.Automations;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

public class OpenMrsProject extends DriverUtility {
	@Test
	public void openMrsLoginTest() throws IOException, InvalidFormatException, InterruptedException
	{
	
		getdriver().get(Pojo.getconfigFile().getPropertyValue("openmrs_url"));
		logReportsUtility.logMsg("Application is launched succsessfully");
		ExtentReportsUtility.ExtentReport("Application is launched succsessfully");
		Actionengine.sendkeysbyId(Pojo.getorFile().getPropertyValue("username_id"), "Admin");
		logReportsUtility.logMsg("username is entered successfully");
		ExtentReportsUtility.ExtentReport("username is entered successfully");
		Actionengine.sendkeysbyCss(Pojo.getorFile().getPropertyValue("password_css"), Pojo.getexcelFile().getcelldata("Sheet3", 0, 1));
		logReportsUtility.logMsg("password is enterd successfully");
		ExtentReportsUtility.ExtentReport("password is enterd successfully");
		Actionengine.clickbyXpath(Pojo.getorFile().getPropertyValue("Inpationtword_xpath"));
		logReportsUtility.logMsg("password is enterd successfully");
		ExtentReportsUtility.ExtentReport("password is enterd successfully");
		Actionengine.clickbyCss(Pojo.getorFile().getPropertyValue("login_css"));
		logReportsUtility.logMsg("login button is successfully clicked");
		ExtentReportsUtility.ExtentReport("login button is successfully clicked");
		Actionengine.clickbyXpath(Pojo.getorFile().getPropertyValue("rigpatience"));
		logReportsUtility.logMsg("rigisterpatience is successfullt clicked");
		ExtentReportsUtility.ExtentReport("rigisterpatience is successfullt clicked");
		Actionengine.sendkeysbyCss(Pojo.getorFile().getPropertyValue("given_css"), Pojo.getexcelFile().getcelldata("Sheet3", 1, 0));
		Actionengine.sendkeysbyCss(Pojo.getorFile().getPropertyValue("middle_css"), Pojo.getexcelFile().getcelldata("Sheet3", 1, 1));
		Actionengine.sendkeysbyCss(Pojo.getorFile().getPropertyValue("familyname_css"), Pojo.getexcelFile().getcelldata("Sheet3", 1, 2));
		Actionengine.clickbyCss(Pojo.getorFile().getPropertyValue("gender_css"));
		Actionengine.clickbyCss(Pojo.getorFile().getPropertyValue("male_css"));
		Actionengine.clickbyCss(Pojo.getorFile().getPropertyValue("birth_css"));
		Actionengine.sendkeysbyCss(Pojo.getorFile().getPropertyValue("day_css"), "08");
		Actionengine.clickbyCss(Pojo.getorFile().getPropertyValue("month_css"));
		Actionengine.dropdownbycss(Pojo.getorFile().getPropertyValue("month_css"), "March");
		
		
		
	}

}
