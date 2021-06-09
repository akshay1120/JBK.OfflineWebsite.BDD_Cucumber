package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.RegisterPgObjRepo;
import com.utility.Utility;

public class RegisterPage extends RegisterPgObjRepo
{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{
		String expectedUrl = "file:///C:/Offline%20Website/pages/examples/register.html" ; 
		log.info("Expected Url = " + expectedUrl);
		
		String actualUrl = Utility.getCurrentUrl(driver);
		log.info("Actual Url = " + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			log.info("Actual and expected Url matched");
			return true ;
		}
		else
		{
			log.info("Actual and expected Url not matched");
			return false ;
		}
	}
	
	//2
	public boolean title() 
	{ 	
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("Actual Title = " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			log.info("Actual and expected title matched");
			return true ;
		}
		else
		{
			log.info("Actual and expected title not matched");
			return false ;
		}
	}
	
	//3
	public boolean heading() 
	{ 	
		String actualHeading = Utility.getText(head);
		log.info("Actual Heading = " + actualHeading);
		
		String expectedHeading = "Java By Kiran" ;
		log.info("Expected Heading = " + expectedHeading);
		
		if(actualHeading.equals(expectedHeading))
		{
			log.info("Actual and Expected Heading matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Heading not matched");
			return false ;
		}
	}
	
	//4
	public boolean alreadyMemberText() 
	{ 	
		String actualAlreadyMemberLinkText = Utility.getText(alreadyMember);
		log.info("Actual Already Member Link Text = " + actualAlreadyMemberLinkText);
		
		String expectedAlreadyMemberLinkText = "I already have a membership" ;
		log.info("Expected Already Member Link Text = " + expectedAlreadyMemberLinkText);
		
		if(actualAlreadyMemberLinkText.equals(expectedAlreadyMemberLinkText))
		{
			log.info("Actual and Expected Already Member Link Text matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Already Member Link Text not matched");
			return false ;
		}
	}
	

	//5
	public boolean alreadyMemberLink() 
	{ 
		String expectedTitle = "JavaByKiran | Log in" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("Actual Title = " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			log.info("Actual and expected title matched");
			return true ;
		}
		else
		{
			log.info("Actual and expected title not matched");
			return false ;
		}
	}
	
	//6
	public boolean placeholders() 
	{ 	
		ArrayList <String>actPlaceholderText = Utility.getPlaceholdersList(placeholdersList);
		log.info("Actual Placeholder Texts = " + actPlaceholderText);
		
		ArrayList <String>expPlaceholderText = new ArrayList <String>();
		expPlaceholderText.add("Name");
		expPlaceholderText.add("Mobile");
		expPlaceholderText.add("Email");
		expPlaceholderText.add("Password");
		log.info("Expected Placeholder Texts = " + expPlaceholderText);
		
		if(actPlaceholderText.equals(expPlaceholderText))
		{
			log.info("Actual and Expected Placeholder texts matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Placeholder texts not matched");
			return false ;
		}
	}
	
	//7
	public boolean blankSignIn() 
	{	
		ArrayList <String>actErrorMessage = Utility.getListOfElements(ErrorsList);
		log.info("Actual Error Messages = " + actErrorMessage);
		
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter Name.");
		expErrorMessage.add("Please enter Mobile.");		
		expErrorMessage.add("Please enter Email.");
		expErrorMessage.add("Please enter Password.");
		log.info("Expected error Messages = " + expErrorMessage);
		
		if(actErrorMessage.equals(expErrorMessage))
		{
			log.info("Expected and Actual error messages matched");
			return true ;
		}
		else
		{
			log.info("Expected and Actual error messages not matched");
			return false ;
		}
	}
	
	//8
	public void validData() 
	{
		Utility.sendkeys(name, "Akshay");
		Utility.sendkeys(mobile, "9876543210");
		Utility.sendkeys(email, "akshay@gmail.com");
		Utility.sendkeys(pass, "123456");	
	}
		
	//9
	public boolean validSignIn()
	{
		String expAlMeassage = "User registered successfully." ;
		log.info("Expected Alert Message = " + expAlMeassage);
		
		String alMessage = Utility.getAlertMsg_accept(driver);
		log.info("Actual Alert Message = " + alMessage);

		if(alMessage.equals(expAlMeassage))
		{
			log.info("Expected and Actual alert message matched");
			return true ;
		}
		else
		{
			log.info("Expected and Actual alert message not matched");
			return false ;
		}
	}
}
