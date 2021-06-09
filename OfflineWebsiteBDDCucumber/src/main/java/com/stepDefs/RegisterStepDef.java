package com.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.jbk.objectRepository.RegisterPgObjRepo;
import com.jbk.pages.LoginPage;
import com.jbk.pages.RegisterPage;
import com.utility.Utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDef extends RegisterPgObjRepo
{
	WebDriver driver;
	LoginPage lp;
	RegisterPage rp;
	
	@Before
	public void Setup() throws Throwable
	{
		driver = initialization();
		lp = new LoginPage(driver);
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	@Given("^user should be on register page$")
	public void user_should_be_on_register_page() throws Throwable {
		rp = lp.navigateToRegisterPg();
	}
	
	@Then("^user will get same expected and actual Url for Register Page$")
	public void user_will_get_same_expected_and_actual_Url_for_Register_Page() throws Throwable 
	{
		Assert.assertTrue(rp.url());
	}
	
	@Then("^user will get same expected and actual Title for Register Page$")
	public void user_will_get_same_expected_and_actual_Title_for_Register_Page() throws Throwable 
	{
	    Assert.assertTrue(rp.title());
	}
	
	@Then("^user will get same expected and actual Heading for Register Page$")
	public void user_will_get_same_expected_and_actual_Heading_for_Register_Page() throws Throwable 
	{
		Assert.assertTrue(rp.heading());
	}
	
	@Then("^user will get same expected and actual Already Member Text for Register Page$")
	public void user_will_get_same_expected_and_actual_Already_Member_Text_for_Register_Page() throws Throwable 
	{
	    Assert.assertTrue(rp.alreadyMemberText());
	}

	@When("^user clicks on Already Member Link$")
	public void user_clicks_on_Already_Member_Link() throws Throwable 
	{
	   Utility.click(rp.alreadyMember);
	}

	@Then("^user should able to see LoginPage$")
	public void user_should_able_to_see_LoginPage() throws Throwable 
	{
	   Assert.assertTrue(rp.alreadyMemberLink());
	}
	
	@Then("^user will get same expected and actual Placeholders List for Register Page$")
	public void user_will_get_same_expected_and_actual_Placeholders_List_for_Register_Page() throws Throwable {
	   Assert.assertTrue(rp.placeholders());
	}

	@When("^user clicks on Sign In Button$")
	public void user_clicks_on_Sign_In_Button() throws Throwable 
	{
		Utility.click(rp.lgnBtn);
	}

	@Then("^user will get same expected and actual Blank Sign In Error Messages List for Register Page$")
	public void user_will_get_same_expected_and_actual_Blank_Sign_In_Error_Messages_List_for_Register_Page() throws Throwable 
	{
		Assert.assertTrue(rp.blankSignIn());
	}

	@When("^user enters all valid data$")
	public void user_enters_all_valid_data() throws Throwable 
	{
		rp.validData();
	}

	@Then("^user should able to see alert message with text 'User registered successfully\\.'$")
	public void user_should_able_to_see_alert_message_with_text_User_registered_successfully() throws Throwable 
	{
		Assert.assertTrue(rp.validSignIn());
	}
}