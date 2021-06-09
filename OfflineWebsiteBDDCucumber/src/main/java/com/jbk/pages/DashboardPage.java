package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DashboardPgObjRepo;
import com.utility.ExcelUtility;
import com.utility.Utility;
import com.utility.WindowHandlingUtility;

public class DashboardPage extends DashboardPgObjRepo
{
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{	
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/dashboard.html" ; 
		log.info("Expected Url = " + expectedUrl);
		
		String actualUrl = Utility.getCurrentUrl(driver);
		log.info("Actual Url = " + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			log.info("Actual and Expected Url matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Url not matched");
			return false ;
		}
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("actual Title = " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			log.info("Actual and Expected title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected title not matched");
			return false ;
		}
	}
	
	
	//4
	public boolean mainHeading() 
	{
		String actMainHeading = Utility.getText(mainHead);
		log.info("actual Main Heading = " + actMainHeading);
		
		String expMainHeading = "Dashboard Courses Offered" ;
		log.info("expected Main Heading = " + expMainHeading);
		
		if(actMainHeading.equals(expMainHeading))
		{
			log.info("Actual and Expected Main Heading matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Main Heading not matched");
			return false ;
		}
	}

	//5
	public boolean userImage() 
	{	
		if(Utility.displayed(userImg)==true)
		{
			log.info("User Image is displayed");
			return true ;
		}
		else
		{
			log.info("User Image is not displayed");
			return false ;
		}
	}
	
	//8
	public boolean navigationMenuText() 
	{	
		ArrayList <String> actNavigationMenuText = Utility.getListOfElements(navMenu);
		log.info("actual Navigation Menu Texts = " + actNavigationMenuText);
		
		ArrayList <String>expNavigationMenuText =  Utility.dashboardPgNavMenu();
		log.info("expected Navigation Menu Text = " + expNavigationMenuText);
		
		if(actNavigationMenuText.equals(expNavigationMenuText))
		{
			log.info("Actual and Expected Navigation Menu Text matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Navigation Menu Text not matched");
			return false ;
		}
	}
	
	//14
	public boolean rightCornerLogOutLink() 
	{	
		String actTitle = Utility.getTitle(driver);
		log.info("actual Right Corner LogOut Link Title = " + actTitle);
		
		String expTitle = "JavaByKiran | Log in" ;
		log.info("expected Right Corner LogOut Link Title = " + expTitle);
				
		if(actTitle.equals(expTitle))
		{
			log.info("Actual and Expected Right Corner LogOut Link Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Right Corner LogOut Link Title not matched");
			return false ;
		}
	}
	
	//15
	public boolean coursesHeading () 
	{
		ArrayList <String>actCoursesHeadings  = Utility.getListOfElements(courseHeading);
		log.info("actual Courses Headings = " + actCoursesHeadings);
		
		ArrayList <String>expCoursesHeadings = new ArrayList <String>();
		expCoursesHeadings.add("Selenium");
		expCoursesHeadings.add("Java / J2EE");		
		expCoursesHeadings.add("Python");
		expCoursesHeadings.add("Php");
		log.info("actual Courses Headings = " + expCoursesHeadings);
		
		if(actCoursesHeadings.equals(expCoursesHeadings))
		{
			log.info("Actual and Expected Courses Headings matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Courses Headings not matched");
			return false ;
		}
	}
	
	//18
	public boolean moreInfoNewWindow () throws Exception 
	{	
		ArrayList <String> expNewWindowUrls = new ArrayList <String>();
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/examples/dashboard.html#");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/python-syllabus.pdf");		
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/java-j2ee-syllabus-jbk.pdf");
		expNewWindowUrls.add("file:///C:/Offline%20Website/pages/pdf/selenium-testing-syllabus-jbk.pdf");
		log.info("expected New Window Urls = " + expNewWindowUrls);
		
		ArrayList <String> actNewWindowUrls  = WindowHandlingUtility.getWindowsUrls(driver ,moreInfo);
		log.info("actual New Window Urls = " + actNewWindowUrls);
		
		if(actNewWindowUrls.equals(expNewWindowUrls))
		{
			log.info("Actual and Expected New Window Urls matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected New Window Urls not matched");
			return false ;
		}
	}
	
	//19
	public boolean footerStatement () 
	{
		String actfooter = Utility.getText(footer);
		log.info("Actual footer Statement = " + actfooter);
		
		String expfooter = "Design for Selenium Automation Test V 2.3.0\n" +"Copyright © 2005-2019 JavaByKiran. All rights reserved.";
		log.info("expected footer Statement = " + expfooter);
		
		if(actfooter.equals(expfooter))
		{
			log.info("Actual and Expected footer Statement matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected footer Statement not matched");
			return false ;
		}
	}
	
	//20
	public boolean jbk_Link () throws Exception 
	{	
		String actWindowTitle = WindowHandlingUtility.getWindowTitle(driver , jbkLink);
		log.info("actual Window Title = " + actWindowTitle);
		
		String expWindowTitle = "Java Classes in Pune | Selenium Training | Python Courses in pune";
		log.info("expected Window Title = " + expWindowTitle);
		
		if(actWindowTitle.equals(expWindowTitle))
		{
			log.info("Actual and Expected Window Title matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Window Title not matched");
			return false ;
		}
	}
	
	//22
	public boolean courseHeadingExcel () throws Exception
	{
		ArrayList <String>actData = Utility.getListOfElements(courseHeading);
		log.info("Actual course Heading = " + actData);
		
		ArrayList <String>expData = ExcelUtility.getTableColData("Data.xlsx" , "Dashboard" , 0 , 1 );
		log.info("Expected course Heading = " + expData);
		
		if(actData.equals(expData))
		{
			log.info("Actual and Expected course Headings matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected course Headings not matched");
			return false ;
		}
	}
	
	
	public UsersPage navigateToUsersPg() 
	{
		Utility.click(users);
		return new UsersPage(driver);
	}
	
	public OperatorsPage navigateToOperatorsPg() 
	{
		Utility.click(operators);
		return new OperatorsPage(driver);
	}
	
	public UsefulLinksPage navigateToUsefulLinksPg() 
	{
		Utility.click(usefulLinks);
		return new UsefulLinksPage(driver);
	}
	
	public DownloadsPage navigateToDownloadsPg() 
	{
		Utility.click(downloads);
		return new DownloadsPage(driver);
	}
}
