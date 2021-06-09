package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.objectRepository.AddUserPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;

public class AddUserPage extends AddUserPgObjRepo
{
	WebDriver driver;
	
	public AddUserPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	List <WebElement> list = null ;
	ArrayList <String> actDragDownOptions = new ArrayList <String>();
	ArrayList <String> expDragDownOptions = new ArrayList <String>();
	
	//1
	public void printingDragDownOptions()
	{
		expDragDownOptions.add("--Select State--");
		expDragDownOptions.add("Maharashtra");
		expDragDownOptions.add("Delhi");
		expDragDownOptions.add("HP");
		expDragDownOptions.add("Punjab");
		log.info("Expected List = " + expDragDownOptions);
		
		Select selectstate = new Select(selectState);
		
		list = selectstate.getOptions();
		
		actDragDownOptions = Utility.getListOfElements(list);
		log.info("Actual List = " + actDragDownOptions);
	}
	
	public boolean verifyPrintingDragDownOptions()
	{
		if(actDragDownOptions.equals(expDragDownOptions))
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
	public boolean printingDragDownOptExcel() throws Exception
	{
		ArrayList <String> expDragDownOptions  = ExcelUtility.getTableColData("Data.xlsx", "DragDown", 0, 0);
		log.info("Expected List = " + expDragDownOptions);
		
		Select selectstates = new Select(selectState);
		
		List <WebElement> list = selectstates.getOptions();
		
		ArrayList <String> actDragDownOptions = Utility.getListOfElements(list);
		log.info("Actual List = " + actDragDownOptions);
		
		if(actDragDownOptions.equals(expDragDownOptions))
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
	public void validAddUserData() throws Exception
	{
		Utility.sendkeys(userName, "Asj");
		Utility.sendkeys(mobile, "940000000000");
		Utility.sendkeys(email, "aj@gmail.com");
		Utility.sendkeys(course, "Java");
		Utility.click(genderMale);
		Utility.click(maharashtra);
		Utility.sendkeys(pass, "asdfgh");
		Utility.click(submitBtn);
		Thread.sleep(2000);
	}
		
	public boolean verifyValidAddUser() throws Exception
	{
		String actMsg = Utility.getAlertMsg_accept(driver);
		log.info("Actual Alert Message = " + actMsg);
		
		String expMsg = "User Added Successfully. You can not see added user.";
		log.info("expected Alert Message = " + expMsg);
		
		if(actMsg.equals(expMsg))
		{
			log.info("Actual and expected Alert Message matched");
			return true ;
		}
		else
		{
			log.info("Actual and expected Alert Message not matched");
			return false ;
		}
	}
}
