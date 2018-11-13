package com.dattu.Project.Automations;

import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Tc001 extends DriverUtility {
	@Test(priority=2)
	public void test1(){
		DriverUtility.getdriver().get("https://www.facebook.com/");
		Shutterbug.shootPage(getdriver()).save();
	}
	@Test(priority=3)
	public void test2()
	{
		DriverUtility.getdriver().get("https://www.flipkart.com/");Shutterbug.shootPage(getdriver()).save();
	}
	@Test(priority=1)
	public void test3()
	{
		System.out.println("hai");
	}

}
