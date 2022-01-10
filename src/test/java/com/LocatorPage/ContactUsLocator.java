package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ParentBase;

public class ContactUsLocator extends ParentBase {
	
public ContactUsLocator () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Technical Support']")
	public WebElement ContactUsPage;

}
