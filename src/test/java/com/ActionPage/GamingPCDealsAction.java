package com.ActionPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorPage.GamingPCDealsLocator;
import com.Utility.ParentBase;
import com.Utility.TestData;
import com.Utility.Utility;

public class GamingPCDealsAction extends ParentBase {

	GamingPCDealsLocator gamingPCDealsLocator = new GamingPCDealsLocator();
	
	public void VerifyGamingPCDealsPage() {
		
	Boolean verifyGamingPC = gamingPCDealsLocator.GamingPCDeals.isDisplayed();
	Assert.assertTrue(verifyGamingPC);
	
	WebDriverWait wait = new WebDriverWait(driver, TestData.explicitWait);
	wait.until(ExpectedConditions.visibilityOf(gamingPCDealsLocator.GamingPCDeals));
		
	Utility.takescreenshot(driver, "Gaming PC Deals");
		
	}
	
	
}
