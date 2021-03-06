package com.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandlingUtility 
{
	WebDriver driver;
	
	// 1 
	public static String getWindowTitle(WebDriver driver , WebElement Element) throws Exception 
	{
		String parent = driver.getWindowHandle();
		
		Element.click();
		Thread.sleep(2000);
		
		String actWindowTitle = null ;
	
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				actWindowTitle = driver.getTitle();
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		return actWindowTitle ;
	}
	
	// 2
	public static String getWindowUrl(WebDriver driver , WebElement Element) throws Exception 
	{
		String parent = driver.getWindowHandle();
		
		Element.click();
		Thread.sleep(2000);
		
		String actWindowUrl = null ;
	
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				actWindowUrl = driver.getCurrentUrl();
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		return actWindowUrl ;
	}
	
	// 3
	public static ArrayList <String> getWindowsUrls(WebDriver driver , List<WebElement> listWbEle ) throws Exception 
	{
		ArrayList <String> actNewWindowUrls  = new ArrayList <String>();

		String parent = driver.getWindowHandle();
		
		for (WebElement element : listWbEle)
		{
			element.click();
			Thread.sleep(1000);
		}
		
		//WaitUtility.explicitWaitWindow(10, listWbEle.size()+1);
		
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				actNewWindowUrls.add(driver.getCurrentUrl());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		return actNewWindowUrls ;
	}
	
	// 4
	public static ArrayList <String> getWindowsTitles(WebDriver driver , List<WebElement> listWbEle) throws Exception 
	{
		ArrayList <String> actNewWindowTitles  = new ArrayList <String>();

		String parent = driver.getWindowHandle();
		
		for (WebElement element : listWbEle)
		{
			element.click();
			Thread.sleep(2000);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		//WaitUtility.explicitWaitWindow(10, listWbEle.size()+1);
		
		Set <String> allWindows = driver.getWindowHandles();
		
		for(String child : allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				actNewWindowTitles.add(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		return actNewWindowTitles ;
	}
}
