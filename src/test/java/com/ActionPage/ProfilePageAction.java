package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.ProfilePageLocator;
import com.Utility.ParentBase;
import com.Utility.Utility;

public class ProfilePageAction extends ParentBase {
	
	ProfilePageLocator profilepageLocator = new ProfilePageLocator();
	
	public void VerifyProfilePage() {
		
	Boolean verifyProfile = profilepageLocator.ProfilePage.isDisplayed();
	Assert.assertTrue(verifyProfile);
	
	Utility.takescreenshot(driver, "Profile Page");

	}
	

}
