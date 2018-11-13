package com.dattu.Project.Automations;

import java.io.IOException;

import org.junit.Test;

public class Mystores extends DriverUtility {
	@Test
	public void createAccountpage() throws IOException
	{
	
			getdriver().get(Pojo.getconfigFile().getPropertyValue("stores"));
			logReportsUtility.logMsg("my stores page  application launched successfully");
			ExtentReportsUtility.ExtentReport("my stores page  application launched successfully");
	
	}

}
