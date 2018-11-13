package com.dattu.Project.Automations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartValidation extends DriverUtility {
	@Test
	public void test() throws IOException
	{
		Actions a=new Actions(getdriver());
		getdriver().get(Pojo.getconfigFile().getPropertyValue("flipkart_url"));
		Actionengine.clickbyxpath(Pojo.getorFile().getPropertyValue("flipkartsignup"));
		Actionengine.sendkeysbyXpath(Pojo.getorFile().getPropertyValue("entermobilenum"), "9000684061");

	}

}
