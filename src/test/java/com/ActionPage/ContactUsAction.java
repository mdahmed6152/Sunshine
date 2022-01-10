package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.ContactUsLocator;
import com.Utility.ParentBase;
import com.Utility.Utility;

public class ContactUsAction extends ParentBase {
	
	ContactUsLocator contactUsLocator = new ContactUsLocator();
	
	public void VerifyContactUsPage() {
		
	Boolean verifyContactUs = contactUsLocator.ContactUsPage.isDisplayed();
	
	Assert.assertTrue(verifyContactUs);
	
	
	Utility.takescreenshot(driver, "Contact Us");
	}

}
