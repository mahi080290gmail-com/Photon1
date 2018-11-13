package com.dattu.Project.Automations;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Toolsqa extends DriverUtility
{
@Test
public void toolsqaTest() throws IOException
{
	getdriver().get(Pojo.getconfigFile().getPropertyValue("stores"));
	ExtentReportsUtility.ExtentReport("toolsqa application is launched successfully"+getdriver().getTitle());
	List<WebElement> links=Actionengine.listOfElementsbycss(Pojo.getorFile().getPropertyValue("Listofcss"));
	ExtentReportsUtility.ExtentReport("webelements stored in list successfully");
	Iterator<WebElement> it= links.iterator();
	while(it.hasNext()) 
	{
	WebElement w= it.next();
	String text="Tools";
	if(w.getText().equalsIgnoreCase(text))
	{
		Actionengine.mouseHourbywebelement(w);
		
		List<WebElement> links1=Actionengine.listOfElementsbycss(Pojo.getorFile().getPropertyValue("Listofeatures"));
		Iterator<WebElement> It1=links1.iterator();
		while(It1.hasNext())
		{
			WebElement w1=It1.next();
			String text1="BDD Frameworks";
			if(w1.getText().equalsIgnoreCase(text1))
			{
				Actionengine.mouseHourbywebelement(w1);
				Actionengine.clickbyxpath(Pojo.getorFile().getPropertyValue("cucumberlinkXpath"));
				Actionengine.clickbyxpath(Pojo.getorFile().getPropertyValue("cucumberbasis"));
				Actionengine.clickbyxpath(Pojo.getorFile().getPropertyValue("linkxpath"));
			}

		}
		
		
		
	}
	}
	
}
}
