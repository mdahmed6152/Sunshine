package com.ActionPage;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.LocatorPage.OrderSupporLocator;
import com.Utility.ParentBase;
import com.Utility.TestData;
import com.Utility.Utility;


public class OrderSupportAction extends ParentBase {
	
	OrderSupporLocator orderSupporLocator = new OrderSupporLocator();

	
	public void VerifyOrderSupportPage() {
		
	Boolean verifyOrderSupport = orderSupporLocator.OrderSupport.isDisplayed();
	 Assert.assertTrue(verifyOrderSupport);
	 
	 WebDriverWait wait = new WebDriverWait(driver, TestData.explicitWait);
		wait.until(ExpectedConditions.visibilityOf(orderSupporLocator.OrderSupport));
		
		
		Utility.takescreenshot(driver, "Order Support");
	}
}
