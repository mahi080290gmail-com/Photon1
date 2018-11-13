package com.dattu.Project.Automations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void test() throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("https://github.com/bonigarcia/webdrivermanager");
		ScreenshotUtility.screenshotCapture(d, "hh");
	}
	@Test
	public void test1() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://github.com/bonigarcia/webdrivermanager");
		ScreenshotUtility.screenshotCapture(d, "hh");
	}

}
