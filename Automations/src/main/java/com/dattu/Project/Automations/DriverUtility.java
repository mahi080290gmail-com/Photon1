package com.dattu.Project.Automations;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
//import io.github.bonigarcia.wdm.WebDriverManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class DriverUtility {
private static WebDriver driver;
private static ExtentReports er;
private static ExtentTest et;

@Parameters("browser")
@BeforeSuite
public void launchBrowser(String browser)
{
	er=new ExtentReports("D:\\ExtentReportPhoton.html");
	
	if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver d=new FirefoxDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
}
@BeforeMethod
public void beforeMethod(Method m)
{
	et=er.startTest(m.getName());
	
}
public static WebDriver getdriver()
{
	return driver;

}
public static ExtentReports getEr()
{
	return er;
	
}
public static ExtentTest getEt()
{
	return et;
	
}

@AfterMethod
public void aftermethod(ITestResult result) throws IOException
{
	String path=ScreenshotUtility.screenshotCapture(driver, result.getName());

if(ITestResult.FAILURE==result.FAILURE)
{
	ExtentReportsUtility.ExtentReport("Below Screenshot"+et.addScreenCapture(path));
	
}
er.flush();
er.endTest(et);


	
}
}
