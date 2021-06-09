package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.UsefulLinksPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;
import com.utility.WindowHandlingUtility;

public class UsefulLinksPage extends UsefulLinksPgObjRepo
{
	WebDriver driver;
	
	public UsefulLinksPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	ArrayList <String>actNewWindowTitles = new ArrayList<>();
	ArrayList <String>expNewWindowTitles = new ArrayList<>();
	
	//1
	public boolean clickGO() throws Exception
	{
		ArrayList<String>actData = WindowHandlingUtility.getWindowsTitles(driver , clickCol);
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Page not found | javabyKiran");
		expData.add("Live Videos | javabyKiran");
		expData.add("Page not found | javabyKiran");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
		{
			log.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected list not matched");
			return false ;
		}		
	}
	
	//2
	public void clickGoExcel() throws Exception 
	{
		actNewWindowTitles = WindowHandlingUtility.getWindowsTitles(driver , clickCol);
		log.info("Actual List = " + actNewWindowTitles);
		
		expNewWindowTitles = ExcelUtility.getTableColData("Data.xlsx", "GoLinks", 0, 0);
		log.info("Expected List = " + expNewWindowTitles);
	}	
	
	public boolean verifyClickGoExcel()
	{
		if(actNewWindowTitles.equals(expNewWindowTitles))
		{
			log.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected list not matched");
			return false ;
		}		
	}
	
	//3
	public boolean complete_UsefulLinksTable() throws Exception 
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(tableHead, tableData);
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "UsefulLinks");
		log.info("Expected List = " + expData);
		
		if(actData.equals(expData))
		{
			log.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected list not matched");
			return false ;
		}		
	}
}
