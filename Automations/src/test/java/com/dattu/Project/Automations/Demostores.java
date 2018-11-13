package com.dattu.Project.Automations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demostores extends DriverUtility {

@Test
public void demostoresTest() throws IOException
{
	getdriver().get(Pojo.getconfigFile().getPropertyValue("DemostoresUrl"));
	Actionengine.mousehourbyCss(Pojo.getorFile().getPropertyValue("css"));
	Actionengine.clickbyCss(Pojo.getorFile().getPropertyValue("FreeDownload"));
}
}
