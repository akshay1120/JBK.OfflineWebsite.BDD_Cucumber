package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.objectRepository.AddUserPgObjRepo;
import com.jbk.pages.AddUserPage;
import com.jbk.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddUserStepDef extends AddUserPgObjRepo
{
	WebDriver driver;
	LoginPage lp;
	AddUserPage aup;
	
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
	
	@Given("^user should be on add user page$")
	public void user_should_be_on_add_user_page() throws Throwable 
	{
		aup = lp.navigateToDashboardPg().navigateToUsersPg().navigateToAddUserPage();
	}

	@When("^user enters all details$")
	public void user_enters_all_details() throws Throwable 
	{
		aup.validAddUserData();
	}

	@Then("^actual and expected alert message should match$")
	public void actual_and_expected_alert_message_should_match() throws Throwable 
	{
	    Assert.assertTrue(aup.verifyValidAddUser());
	}

	@When("^user select the State Menu$")
	public void user_select_the_State_Menu() throws Throwable 
	{
	    aup.printingDragDownOptions();
	}

	@Then("^actual and expected Drag Down options should match$")
	public void actual_and_expected_Drag_Down_options_should_match() throws Throwable 
	{
	    Assert.assertTrue(aup.verifyPrintingDragDownOptions());
	}
}