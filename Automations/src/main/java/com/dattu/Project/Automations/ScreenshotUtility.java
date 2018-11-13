package com.dattu.Project.Automations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ScreenshotUtility {

	public static String screenshotCapture(WebDriver driver, String imageName) throws IOException
	{
		//File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destfile="D:\\"+imageName+".jpeg";
		//File destination=new File(destfile);
		//FileUtils.copyFile(srcfile, destination);
		Shutterbug.shootPage(driver).save(destfile);;
		return destfile;
	}
}
