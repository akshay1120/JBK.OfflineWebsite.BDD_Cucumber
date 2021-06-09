package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.testBase.TestBase;

public class OperatorsPgObjRepo extends TestBase
{
	@FindBy(xpath = "//th")
	public List<WebElement> headings;
	
	@FindBy(xpath = "//td[1]")
	public List<WebElement> idCol;
	
	@FindBy(xpath = "//td[2]")
	public List<WebElement> personCol;
	
	@FindBy(xpath = "//td[3]")
	public List<WebElement> forCol;
	
	@FindBy(xpath = "//td[4]")
	public List<WebElement> prefferedWayToConnectCol;
	
	@FindBy(xpath = "//td[5]")
	public List<WebElement> contactCol;
	
	@FindBy(xpath = "//td[6]")
	public List<WebElement> timingsCol;
	
	@FindBy(xpath = "//td")
	public List<WebElement> tableData;
}
