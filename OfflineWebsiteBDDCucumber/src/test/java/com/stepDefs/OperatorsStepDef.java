package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.objectRepository.OperatorsPgObjRepo;
import com.jbk.pages.LoginPage;
import com.jbk.pages.OperatorsPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OperatorsStepDef extends OperatorsPgObjRepo
{
	WebDriver driver;
	LoginPage lp;
	OperatorsPage op;
	
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
	
	
	@Given("^User should be on Operators Page$")
	public void user_should_be_on_Operators_Page() throws Throwable 
	{
	    op = lp.navigateToDashboardPg().navigateToOperatorsPg();
	}

	@Then("^Actual and expected list of faculties having (\\d+) digit contact number length should match$")
	public void actual_and_expected_list_of_faculties_having_digit_contact_number_length_should_match(int arg1) throws Throwable 
	{
		Assert.assertTrue(op.contactNoLength());
	}
	
	@Then("^Acual and expected list of faculties having phone call as preffered way to contact should match$")
	public void acual_and_expected_list_of_faculties_having_phone_call_as_preffered_way_to_contact_should_match() throws Throwable 
	{
	    Assert.assertTrue(op.prefferedWayToConnect_PhoneCall());
	}
	
	@Then("^Actual and expected users table should match$")
	public void actual_and_expected_users_table_should_match() throws Throwable {
	    Assert.assertTrue(op.CompleteOperatorsTable());
	}
}
