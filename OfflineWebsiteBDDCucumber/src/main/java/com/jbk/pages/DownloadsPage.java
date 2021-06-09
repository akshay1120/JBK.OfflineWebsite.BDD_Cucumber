package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DownloadsPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class DownloadsPage extends DownloadsPgObjRepo
{
	WebDriver driver;
	
	public DownloadsPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean operatingSystem_32bit()
	{
		log.info("Actual Vendors having Operating System of 32 bit : ");
		
		ArrayList <String>actData = Utility.getListEqualsXYZ(lowBitCol, vendorCol, "32bit");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Java Development Kit (JDK)");
		expData.add("Google Chrome");
		expData.add("Mozilla Firefox");
		expData.add("Gecko Driver for Latest firefox");
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
	public boolean common()
	{
		log.info("Actual Vendors having Operating System common : ");
		
		ArrayList <String>actData = Utility.getListEqualsXYZ(commonCol, vendorCol, "Common");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Selenium Server Source Jar");
		expData.add("Google Chrome Driver");
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
	
	//3
	public boolean none()
	{	
		System.out.println("Actual Vendors having none Operating System  : ");
		
		ArrayList <String>actData = Utility.getListContainingNoABC_and_NoXYZ(lowBitCol, commonCol, vendorCol , "32bit", "Common");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Selenium Server Standalon Jar");
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
	
	//4
	public boolean completeDownloadsTable() throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Downloads");
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
