package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.testBase.TestBase;

public class UsefulLinksPgObjRepo extends TestBase
{
	@FindBy(xpath = "//span[text()='     Useful Links']")
	public WebElement usefulLinks;
	
	@FindBy(xpath = "//span[text()='Go !']")
	public List<WebElement> clickCol;
	
	@FindBy(xpath = "//th")
	public List<WebElement> tableHead;
	
	@FindBy(xpath = "//td")
	public List<WebElement> tableData;
}
