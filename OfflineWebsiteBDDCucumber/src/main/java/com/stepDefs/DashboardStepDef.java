package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.objectRepository.DashboardPgObjRepo;
import com.jbk.pages.DashboardPage;
import com.jbk.pages.LoginPage;
import com.utility.Utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDef extends DashboardPgObjRepo
{
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
	
	@Before
	public void Setup() throws Throwable
	{
		driver = initialization();
		lp = new LoginPage(driver);
		dp = lp.navigateToDashboardPg();
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	@Then("^user will get same expected and actual Url for Dashboard Page$")
	public void user_will_get_same_expected_and_actual_Url_for_Dashboard_Page() throws Throwable 
	{
	    Assert.assertTrue(dp.url());
	}

	@Then("^user will get same expected and actual Title for Dashboard Page$")
	public void user_will_get_same_expected_and_actual_Title_for_Dashboard_Page() throws Throwable 
	{
	    Assert.assertTrue(dp.title());
	}

	@Then("^user will get same expected and actual Main Heading for Dashboard Page$")
	public void user_will_get_same_expected_and_actual_Main_Heading_for_Dashboard_Page() throws Throwable 
	{
	    Assert.assertTrue(dp.mainHeading());
	}

	@Then("^user will be able to see 'User Image' on Dashboard Page$")
	public void user_will_be_able_to_see_User_Image_on_Dashboard_Page() throws Throwable 
	{
	   Assert.assertTrue(dp.userImage());
	}

	@Then("^user will get same expected and actual Navigation Menu Text for Dashboard Page$")
	public void user_will_get_same_expected_and_actual_Navigation_Menu_Text_for_Dashboard_Page() throws Throwable 
	{
	    Assert.assertTrue(dp.navigationMenuText());
	}

	@When("^user click on Right Corner Log Out Button$")
	public void user_click_on_Right_Corner_Log_Out_Button() throws Throwable 
	{
	    Utility.click(dp.rightLgOut);
	}

	@Then("^user will be able to see Login Page$")
	public void user_will_be_able_to_see_Login_Page() throws Throwable {
	    Assert.assertTrue(dp.rightCornerLogOutLink());
	}


	@Then("^user will get same expected and actual Courses Headings for Dashboard Page$")
	public void user_will_get_same_expected_and_actual_Courses_Headings_for_Dashboard_Page() throws Throwable 
	{
	  Assert.assertTrue(dp.coursesHeading());
	}

	@When("^user click on all More info options$")
	public void user_click_on_all_More_info_options() throws Throwable 
	{
	    
	}

	@Then("^user will get same expected and actual More info windows$")
	public void user_will_get_same_expected_and_actual_More_info_windows() throws Throwable 
	{
	    Assert.assertTrue(dp.moreInfoNewWindow());
	}

	@Then("^user will get same expected and actual Footer Statement for Dashboard Page$")
	public void user_will_get_same_expected_and_actual_Footer_Statement_for_Dashboard_Page() throws Throwable 
	{
	    Assert.assertTrue(dp.footerStatement());
	}

	@When("^user click on 'JBK'$")
	public void user_click_on_JBK() throws Throwable 
	{
	   
	}

	@Then("^user will get same expected and actual JBK window$")
	public void user_will_get_same_expected_and_actual_JBK_window() throws Throwable 
	{
	    Assert.assertTrue(dp.jbk_Link());
	}
}
