package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ParentBase;

public class ProfilePageLocator extends ParentBase {
	
public ProfilePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='Md']")
	public WebElement ProfilePage;
	
	

}
