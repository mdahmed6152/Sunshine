package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ParentBase;

public class GamingPCDealsLocator extends ParentBase {
	
public GamingPCDealsLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//h1[text()='Gaming PC Deals']")
	public WebElement GamingPCDeals;

}
