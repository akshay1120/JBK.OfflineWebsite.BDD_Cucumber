package com.stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.objectRepository.DownloadsPgObjRepo;
import com.jbk.pages.DownloadsPage;
import com.jbk.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DownloadsStepDef extends DownloadsPgObjRepo
{
	WebDriver driver;
	LoginPage lp;
	DownloadsPage dlp;
	
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
	
	@Given("^User should be on Downloads Page$")
	public void user_should_be_on_Downloads_Page() throws Throwable 
	{
	   dlp = lp.navigateToDashboardPg().navigateToDownloadsPg();
	}

	@Then("^Actual and expected names of vendors having (\\d+) bit operating system should match$")
	public void actual_and_expected_names_of_vendors_having_bit_operating_system_should_match(int arg1) throws Throwable 
	{
	    Assert.assertTrue(dlp.operatingSystem_32bit());
	}
	
	@Then("^Actual and expected Downloads table should match$")
	public void actual_and_expected_Downloads_table_should_match() throws Throwable 
	{
		Assert.assertTrue(dlp.completeDownloadsTable());
	}
}
