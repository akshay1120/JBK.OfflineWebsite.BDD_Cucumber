package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.objectRepository.UsersPgObjRepo;
import com.jbk.pages.LoginPage;
import com.jbk.pages.UsersPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UsersStepDef extends UsersPgObjRepo
{
	WebDriver driver;
	LoginPage lp;
	UsersPage up;
	
	@Before 
	public void setup() throws Exception 
	{
		driver = initialization();
		lp = new LoginPage(driver);
		//up = lp.navigateToDashboardPg().navigateToUsersPg();
	}
	
	@After 
	public void tearDown() 
	{
		driver.close();
	}
	
	@Given("^user should be on user page$")
	public void user_should_be_on_user_page() throws Throwable 
	{
		up = lp.navigateToDashboardPg().navigateToUsersPg();
	}

	@Then("^actual and expected table headings of users page should match$")
	public void actual_and_expected_table_headings_of_users_page_should_match() throws Throwable 
	{
		Assert.assertTrue(up.alTableHeadings());
	}

	@When("^user sort the user names according to alphabetical order$")
	public void user_sort_the_user_names_according_to_alphabetical_order() throws Throwable 
	{
	    up.unameInOrder();
	}

	@Then("^actual and expected list of user names should match$")
	public void actual_and_expected_list_of_user_names_should_match() throws Throwable 
	{
		Assert.assertTrue(up.verifyUnameInOrder());
	}
	
	@When("^User clicks on all delete button one by one$")
	public void user_clicks_on_all_delete_button_one_by_one() throws Throwable 
	{
	    up.clickDeleteAlertMsg();
	}

	@Then("^actual and expected list of Alert messages should match$")
	public void actual_and_expected_list_of_Alert_messages_should_match() throws Throwable 
	{
	    Assert.assertTrue(up.verifyClickDeleteAlertMsg());
	}
	
	@Then("^actual and expected table headings of users page using excel should match$")
	public void actual_and_expected_table_headings_of_users_page_using_excel_should_match() throws Throwable {
	    Assert.assertTrue(up.excelTableHeadings());
	}
}
