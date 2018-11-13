package com.dattu.Project.Automations;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class chechboxes {
	@Test
	public void test()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> l=driver.findElements(By.cssSelector("input[type='checkbox']"));
		Iterator<WebElement> i=l.iterator();
		while(i.hasNext())
		{
			WebElement box=i.next(); 
			if(box.isEnabled())
			{
				box.click();
			}
		}
	}
	

}
