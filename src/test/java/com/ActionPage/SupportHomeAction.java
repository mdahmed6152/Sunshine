package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.SupportHomeLocator;
import com.Utility.ParentBase;
import com.Utility.Utility;

public class SupportHomeAction extends ParentBase {
	
	SupportHomeLocator supportHomeLocator = new SupportHomeLocator();
	
	
	public void VerifySupportHomePage() {
		
	boolean verifySupportHome = supportHomeLocator.SupportHomePage.isDisplayed();
		
		Assert.assertTrue(verifySupportHome);
		
		Utility.takescreenshot(driver, "Suppot Home");
		
		
		}

	}


