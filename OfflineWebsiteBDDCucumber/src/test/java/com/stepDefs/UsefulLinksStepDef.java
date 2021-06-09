package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.objectRepository.UsefulLinksPgObjRepo;
import com.jbk.pages.LoginPage;
import com.jbk.pages.UsefulLinksPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsefulLinksStepDef extends UsefulLinksPgObjRepo
{
	WebDriver driver;
	LoginPage lp;
	UsefulLinksPage up;
	
	@Before
	public void setup() throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	@Given("^User should be on Useful Links Page$")
	public void user_should_be_on_Useful_Links_Page() throws Throwable 
	{
	    up = lp.navigateToDashboardPg().navigateToUsefulLinksPg();
	}

	@When("^User clicks on all Go buttons one by one$")
	public void user_clicks_on_all_Go_buttons_one_by_one() throws Throwable 
	{
	    up.clickGoExcel();
	}

	@Then("^Actual and expected title of new windows should match$")
	public void actual_and_expected_title_of_new_windows_should_match() throws Throwable 
	{
		Assert.assertTrue(up.verifyClickGoExcel());
	}
	
	@Then("^Actual and expected Useful Links table should match$")
	public void actual_and_expected_Useful_Links_table_should_match() throws Throwable 
	{
		Assert.assertTrue(up.complete_UsefulLinksTable());
	}
}
