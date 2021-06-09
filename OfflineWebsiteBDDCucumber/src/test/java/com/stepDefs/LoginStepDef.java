package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.pages.DashboardPage;
import com.jbk.pages.LoginPage;
import com.jbk.testBase.TestBase;
import com.utility.ExcelUtility;
import com.utility.Utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends TestBase
{
	WebDriver driver ;
	LoginPage lp = null ;
	
	@Before 
	public void setup() throws Throwable 
	{
		driver = initialization();
		lp = new LoginPage(driver);
	}	
	
	@After 
	public void tearDown() 
	{
		driver.close();
	}
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable 
	{
		driver.get("file:///C:/Offline%20Website/index.html");
	}

	@Then("^user will get same expected and actual Url$")
	public void user_will_get_same_expected_and_actual_Url() throws Throwable 
	{
	    Assert.assertTrue(lp.url());;
	}
	
	@Then("^user will get same expected and actual Title$")
	public void user_will_get_same_expected_and_actual_Title() throws Throwable
	{
	    Assert.assertTrue(lp.title());
	}
	
	@Then("^user will be able to see the Logo$")
	public void user_will_be_able_to_see_the_Logo() throws Throwable 
	{
		Assert.assertTrue(lp.logo());
	}

	
	@Then("^user will get same expected and actual Heading$")
	public void user_will_get_same_expected_and_actual_Heading() throws Throwable 
	{   
	    Assert.assertTrue(lp.mainHeading());
	}
	
	@Then("^user will get same expected and actual subHeading$")
	public void user_will_get_same_expected_and_actual_subHeading() throws Throwable 
	{
	    Assert.assertTrue(lp.subHeading());
	}
	
	@Then("^user will get same expected and actual signIn Box Heading$")
	public void user_will_get_same_expected_and_actual_signIn_Box_Heading() throws Throwable 
	{
		Assert.assertTrue(lp.signInBoxHeading());
	}
	
	@Then("^user will get same expected and actual Placeholders$")
	public void user_will_get_same_expected_and_actual_Placeholders() throws Throwable 
	{
	    Assert.assertTrue(lp.placeholders());
	}
	
	@When("^user enters valid data$")
	public void user_enters_valid_data() throws Throwable 
	{
		lp.validData();
	}

	@Then("^user will be on Dashboard page$")
	public void user_will_be_on_Dashboard_page() throws Throwable 
	{
		Assert.assertTrue(lp.validLogIn());
	}
	
	@Then("^user should be on Dashboard page$")
	public void user_should_be_on_Dashboard_page() throws Throwable 
	{
	   
	}
	
	@When("^clicks logout button$")
	public void clicks_logout_button() throws Throwable 
	{
	    DashboardPage dp = new DashboardPage(driver);
	    log.info("Clicking on Log Out Button");
	    Utility.click(dp.leftLgOut);
	}

	@Then("^user should be able to see logout Successfully Message on Login page$")
	public void user_should_be_able_to_see_logout_Successfully_Message_on_Login_page() throws Throwable 
	{	
		Assert.assertTrue(lp.logoutSuccessfullyMessage());
	}
	
	@When("^user enters invalid data$")
	public void user_enters_invalid_data() throws Throwable 
	{
		Utility.sendkeys(lp.uname, "akshay@gmail.com");
		Utility.sendkeys(lp.pass, "1234");
		Utility.click(lp.lgnBtn);
	}

	@Then("^user will get same expected and actual Invalid LogIn Error Messages$")
	public void user_will_get_same_expected_and_actual_Invalid_LogIn_Error_Messages() throws Throwable 
	{
		Assert.assertTrue(lp.invalidLogInErrorMessage());
	}
	
	@When("^user enters no data$")
	public void user_enters_no_data() throws Throwable 
	{
		Utility.click(lp.lgnBtn);
	}

	@Then("^user will get same expected and actual Blank Log In Error Messages$")
	public void user_will_get_same_expected_and_actual_Blank_Log_In_Error_Messages() throws Throwable 
	{
		Assert.assertTrue(lp.blankLogInErrorMessage());
	}
	
	@Then("^user will get same expected and actual Register Link Text$")
	public void user_will_get_same_expected_and_actual_Register_Link_Text() throws Throwable 
	{
	    Assert.assertTrue(lp.registerLinkText());
	}
	
	@When("^user clicks on Register Link$")
	public void user_clicks_on_Register_Link() throws Throwable 
	{
	    Utility.click(lp.registerLink);
	    log.info("Clicked the Register Link");
	}
	
	@Then("^user will get same expected and actual Title of Register Page$")
	public void user_will_get_same_expected_and_actual_Title_of_Register_Page() throws Throwable 
	{
	    Assert.assertTrue(lp.registerLink());
	}
	
	@When("^user enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_invalid_and(String username, String password) throws Throwable 
	{
		Utility.sendkeys(lp.uname, username);
		Utility.sendkeys(lp.pass, password);
		Utility.click(lp.lgnBtn);
	}

	@Then("^user will be on Login page$")
	public void user_will_be_on_Login_page() throws Throwable 
	{
	   Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	
	@When("^user enters email, password and clicks on Login Button$")
	public void user_enters_email_password_and_clicks_on_Login_Button() throws Throwable 
	{
	   lp.loginWithAllData(ExcelUtility.readUnameAndPass("Data.xlsx", "LoginWithoutHeading", 0, 1 , 0));
	}

	@Then("^user will get to know weather data is valid or not$")
	public void user_will_get_to_know_weather_data_is_valid_or_not() throws Throwable 
	{
		
	}
}