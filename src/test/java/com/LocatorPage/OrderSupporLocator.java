package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ParentBase;

public class OrderSupporLocator extends ParentBase {
	
public OrderSupporLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//h1[text()='Order Support']")
	public WebElement OrderSupport;
	

}
