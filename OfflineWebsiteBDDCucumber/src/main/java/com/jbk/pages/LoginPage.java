package com.jbk.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.LoginPgObjRepo;
import com.utility.Utility;

public class LoginPage extends LoginPgObjRepo
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean url()
	{	
		String expectedUrl = "file:///C:/Offline%20Website/index.html" ; 
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
		String expectedTitle = "JavaByKiran | Log in" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("Actual and expected Url not matched");
		
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
	public boolean logo() 
	{ 	
		if(Utility.displayed(logo)==true)
		{
			log.info("Logo is displayed");
			return true ;
		}
		else
		{
			log.info("Logo is not displayed");
			return false ;
		}
	}
	
	//4
	public boolean mainHeading() 
	{ 	
		String actualHeading = Utility.getText(mainHeading);
		log.info("Actual Heading = " + actualHeading);
		
		String expectedHeading = "Java By Kiran" ;
		log.info("Expected Heading = " + expectedHeading);
		
		if (actualHeading.equals(expectedHeading))
		{
			log.info("Actual and Expected Headings are matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Headings are matched");
			return false ;
		}
	}
	
	//5
	public boolean subHeading()
	{
		String actualSubHeading = Utility.getText(subHeading);
		log.info("Actual Subheading = " + actualSubHeading);
		
		String expectedSubHeading = "JAVA | SELENIUM | PYTHON" ;
		log.info("Expected Subheading = " + expectedSubHeading);
		
		if (actualSubHeading.equals(expectedSubHeading))
		{
			log.info("Actual and expected Subheadings are matched");
			return true ;
		}
		else
		{
			log.info("Actual and expected Subheadings are not matched");
			return false ;
		}
	}
	
	//6
	public boolean signInBoxHeading()
	{
		String actualSignInBoxHeading = Utility.getText(signInBoxHeading);
		log.info("Actual Sign-in box heading = " + actualSignInBoxHeading);
		
		String expectedSignInBoxHeading = "Sign in to start your session" ;
		log.info("Expected Sign-in box heading = " + expectedSignInBoxHeading);
		
		if (actualSignInBoxHeading.equals(expectedSignInBoxHeading))
		{
			log.info("Actual and Expected Sign-in box headings are matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Sign-in box headings are not matched");
			return false ;
		}
	}
	
	//7
	public boolean placeholders()
	{	
		ArrayList <String>expPlaceholderText = new ArrayList <String>();
		expPlaceholderText.add("Email");
		expPlaceholderText.add("Password");
		log.info("List of Expected Placeholders = " + expPlaceholderText);
		
		ArrayList <String>actPlaceholderText = Utility.getPlaceholdersList(placeholdersList);
		log.info("List of Actual Placeholders = " + actPlaceholderText);
		
		if (actPlaceholderText.equals(expPlaceholderText))
		{
			log.info("List of Actual and Expected Placeholders are matched");
			return true ;
		}
		else
		{
			log.info("List of Actual and Expected Placeholders are not matched");
			return false ;
		}
	}
	
	//8
	public void validData()
	{
		Utility.sendkeys(uname, prop.getProperty("uname"));
		Utility.sendkeys(pass, prop.getProperty("password"));
		Utility.click(lgnBtn);
	}
	
	//9
	public boolean validLogIn() 
	{	
		String expectedTitle = "JavaByKiran | Dashboard" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("Actual Title = " + actualTitle);
		
		if (actualTitle.equals(expectedTitle))
		{
			log.info("Actual and Expected titles are matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected titles are not matched");
			return false ;
		}
	}
	
	//10
	public boolean logoutSuccessfullyMessage()
	{	
		String actMessage = Utility.getText(successfullyLgOutMsg);
		log.info("Actual Message = " + actMessage);
		
		String expMessage = "Logout successfully" ;
		log.info("Expected Message = " + expMessage);
		
		if (actMessage.equals(expMessage))
		{
			log.info("Actual and Expected Message matched" );	
			return true ;
		}
		else
		{
			log.info("Actual and Expected Message not matched" );
			return false ;
		}
	}
	
	//11
	public void invalidData()
	{
		Utility.sendkeys(uname, "akshay@gmail.com");
		Utility.sendkeys(pass, "123456789");
		Utility.click(lgnBtn);
	}
	
	//12
	public boolean invalidLogInErrorMessage()
	{
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter email as kiran@gmail.com");
		expErrorMessage.add("Please enter password 123456");
		log.info("List of Expected Error Messages = " + expErrorMessage);
		
		ArrayList <String>actErrorMessage = Utility.getListOfElements(ErrorsList);
		log.info("List of Actual Error Messages = " + actErrorMessage);
		
		if (actErrorMessage.equals(expErrorMessage))
		{
			log.info("List of Expected and Actual Error Messages matched ");
			return true ;
		}
		else
		{
			log.info("List of Expected and Actual Error Messages not matched ");
			return false ;
		}
	}
	
	//13
	public boolean blankLogInErrorMessage() 
	{	
		ArrayList <String>expErrorMessage = new ArrayList <String>();
		expErrorMessage.add("Please enter email.");
		expErrorMessage.add("Please enter password.");
		log.info("List of Expected Error Messages = " + expErrorMessage);
		
		ArrayList <String>actErrorMessage = Utility.getListOfElements(ErrorsList);
		log.info("List of Actual Error Messages = " + actErrorMessage);
		
		if (actErrorMessage.equals(expErrorMessage))
		{
			log.info("List of Expected and Actual Error Messages matched ");
			return true ;
		}
		else
		{
			log.info("List of Expected and Actual Error Messages not matched ");
			return false ;
		}
	}
	
	//14
	public boolean registerLinkText() 
	{ 
		String actualRegisterLinkText = Utility.getText(registerLink);
		log.info("Actual Register LinkText = " + actualRegisterLinkText);
		
		String expectedRegisterLinkText = "Register a new membership" ;
		log.info("expected Register LinkText = " + expectedRegisterLinkText);
		
		if (actualRegisterLinkText.equals(expectedRegisterLinkText))
		{
			log.info("Actual and Expected Register LinkText matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected Register LinkText not matched");
			return false ;
		}
	}
	
	//15
	public boolean registerLink() 
	{ 
		String expectedTitle = "JavaByKiran | Registration Page" ; 
		log.info("Expected Title = " + expectedTitle);
		
		String actualTitle = Utility.getTitle(driver);
		log.info("Actual Title = " + actualTitle);
		
		if (actualTitle.equals(expectedTitle))
		{
			log.info("Actual and Expected titles are matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected titles are not matched");
			return false ;
		}
	}
	
	//16
	public void loginWithAllData(HashMap<String,String> hm)
	{	
		Set<String> keys = hm.keySet();
		for(String key :keys)
		{
			Utility.sendkeys(uname, key);
			Utility.sendkeys(pass,hm.get(key));
			Utility.click(lgnBtn);
			
			if(Utility.getTitle(driver).contains("Dashboard"))
			{
				log.info("Valid Data = Username : "+ key + "    Password :" + hm.get(key));
				Utility.click(LgOut);
			}
			else
			{
				log.info("invalid Data = Username : "+ key + "    Password :" + hm.get(key));
				Utility.clear(uname);
				Utility.clear(pass);
			}
		}
	}
	
	public DashboardPage navigateToDashboardPg() 
	{
		Utility.sendkeys(uname, prop.getProperty("uname"));
		Utility.sendkeys(pass, prop.getProperty("password"));
		Utility.click(lgnBtn);
		
		return new DashboardPage(driver);
	}
	
	public RegisterPage navigateToRegisterPg() 
	{
		Utility.click(registerLink);
		return new RegisterPage(driver);
	}
}
