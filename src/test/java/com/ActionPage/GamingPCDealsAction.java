package com.ActionPage;

import org.testng.Assert;

import com.LocatorPage.GamingPCDealsLocator;
import com.Utility.ParentBase;
import com.Utility.Utility;

public class GamingPCDealsAction extends ParentBase {

	GamingPCDealsLocator gamingPCDealsLocator = new GamingPCDealsLocator();
	
	public void VerifyGamingPCDealsPage() {
		
	Boolean verifyGamingPC = gamingPCDealsLocator.GamingPCDeals.isDisplayed();
	Assert.assertTrue( verifyGamingPC);
		
	Utility.takescreenshot(driver, "Gaming PC Deals");
		
	}
	
	
}
