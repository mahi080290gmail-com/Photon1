package com.dattu.Project.Automations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionengine extends DriverUtility {
static Actions actions=new Actions(getdriver());


public static void sendkeysbyId(String Idvalue, String data)
{
	getdriver().findElement(By.id(Idvalue)).sendKeys(data);
}
	public static void sendkeysbyXpath(String Xpathvalue, String data)
	{
		getdriver().findElement(By.xpath(Xpathvalue)).sendKeys(data);
	}
	public static void sendkeysbyCss(String Cssvalue, String data)
	{
		getdriver().findElement(By.cssSelector(Cssvalue)).sendKeys(data);
	}
	public static void clickbyCss(String Cssvalue)
	{
		getdriver().findElement(By.cssSelector(Cssvalue)).click();
	}
	public static void clickbyId(String Idvalue)
	{
		getdriver().findElement(By.id(Idvalue)).click();
	
	}
	public static void clickbyLink(String link)
	{
		getdriver().findElement(By.linkText(link)).click();
	}

	public static void clickbyXpath(String Xpathvalue)
	{
		getdriver().findElement(By.xpath(Xpathvalue)).click();
	}
	public static void mousehourbyId(String Idvalue)
	{
		WebElement e =getdriver().findElement(By.id(Idvalue));
		actions.moveToElement(e).perform();
	}
	public static void mousehourbyCss(String Cssvalue)
	{
		WebElement e =getdriver().findElement(By.cssSelector(Cssvalue));
		actions.moveToElement(e).perform();
	}
	public static void mousehourbyXpath(String Xpathvalue)
	{
		WebElement e =getdriver().findElement(By.xpath(Xpathvalue));
		actions.moveToElement(e).perform();
	}
	public static void dropdownbycss(String css,String input)
	{
		WebElement e=DriverUtility.getdriver().findElement(By.cssSelector(css));
		Select s=new Select(e);
		s.selectByValue(input);
	}
	public static void dropdownbyXpath(String xpath,String input)
	{
		WebElement e=DriverUtility.getdriver().findElement(By.xpath(xpath));
		Select s=new Select(e);
		s.selectByValue(input);
	}
	public static void dropdownbyId(String id,String input)
	{
		WebElement e=DriverUtility.getdriver().findElement(By.id(id));
		Select s=new Select(e);
		s.selectByValue(input);
	}
	public static void keyboardClick(WebElement e)
	{
		e.sendKeys(Keys.TAB,Keys.ENTER);
	}
	public static void mouseHourbywebelement( WebElement e)
	{
		actions.moveToElement(e).perform();
}
	public static void clickbywebelement( WebElement e)
	{
		e.click();//
}
	public static List listOfElementsbycss( String css)
	{
		List<WebElement> elements=DriverUtility.getdriver().findElements(By.cssSelector(css));
		return elements;
		
	
	}
	public static List listOfElementsbyxpath( String xpath)
	{
		List<WebElement> elements=DriverUtility.getdriver().findElements(By.cssSelector(xpath));
		return elements;
		
	
	}
	public static void OperationOnWebElement(String Argument,WebElement e1)
	{
		JavascriptExecutor js=(JavascriptExecutor)getdriver();
		js.executeScript(Argument,e1);//	
	}
	public static void scrlingPage(String argument)
	{
		JavascriptExecutor js=(JavascriptExecutor)getdriver();
		js.executeScript(argument);//
	}
	public static void clickbyxpath(String xpath)
	{
		DriverUtility.getdriver().findElement(By.xpath(xpath)).click();
	}
	
}

