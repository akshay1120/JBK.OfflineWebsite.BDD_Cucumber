package com.jbk.pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.OperatorsPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class OperatorsPage  extends OperatorsPgObjRepo
{
	WebDriver driver;
	
	public OperatorsPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean contactNoLength()
	{	
		log.info("Faculties having 10 digit Mobile No. : ");
		
		ArrayList <String>actData = Utility.getListLengthXYZ(contactCol, personCol, 10);
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
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
	public boolean namesInAlphabeticalOrder()
	{
		ArrayList <String>actData = Utility.getListOfElements(personCol);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Darshit");
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		log.info("Expected List = " + expData);
		
		Collections.sort(actData);
		log.info("Actual List = " + actData);
		
		/*System.out.println(actData);
		
		for (String i : actData)
		{
			System.out.println(i);
		}*/
		
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
	public boolean prefferedWayToConnect_WhatsApp()
	{	
		log.info("Actual Faculties available on WhatsApp : ");
		
	  	ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Whats App");
	  	log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
		expData.add("Darshit");
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
	public boolean prefferedWayToConnect_PhoneCall()
	{	
		log.info("Actual Faculties available on Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingXYZ(prefferedWayToConnectCol, personCol, "Phone Call");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
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

	//5
	public boolean prefferedWayToConnect_WhatsApp_And_PhoneCall()
	{	
		log.info("Actual Faculties available on both WhatsApp & Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingABC_and_XYZ(prefferedWayToConnectCol, personCol, "Whats App", "Phone Call");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
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
	
	//6
	public boolean prefferedWayToConnect_WhatsApp_ButNot_PhoneCall ()
	{
		log.info("Actual Faculties available on WhatsApp but not on Phone Call : ");
		
		ArrayList <String>actData = Utility.getListContainingABC_not_XYZ(prefferedWayToConnectCol, personCol, "Whats App", "Phone Call");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Darshit");
		log.info("Expected List = " + expData);
		
		System.out.println("Faculties available on WhatsApp but not on Phone Call : ");
		
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
	
	//7
	public boolean facultiesAvailableOnMonday ()
	{	
		log.info("Actual Faculties available on Monday : ");
		
		ArrayList <String>actData = Utility.getListContainingXYZ(timingsCol, personCol, "Monday");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Kiran");
		expData.add("Neelam");
		expData.add("Seema");
		expData.add("Varsha");
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
	
	//8
	public boolean facultiesNotAvailableOnSunday ()
	{
		log.info("Actual Faculties not available on Sunday : ");
		
		ArrayList <String>actData = Utility.getListNotContainingXYZ(timingsCol, personCol, "Sunday");
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = new ArrayList <String>();
		expData.add("Neelam");
		expData.add("Seema");
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
	
	//9
	public boolean CompleteOperatorsTable () throws Exception
	{
		ArrayList <String>actData = Utility.getCompleteSheetData(headings, tableData);
		log.info("Actual List = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableData("Data.xlsx", "Operators");
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
