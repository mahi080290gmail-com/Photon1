package com.dattu.Project.Automations;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.fr.Et;

public class ExtentReportsUtility extends DriverUtility{

	public static void ExtentReport(String msg)
	{
		getEt().log(LogStatus.INFO, msg);
		
	}
}
