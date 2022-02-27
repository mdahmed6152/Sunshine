package com.ActionPage;

import com.LocatorPage.HomePageLocator;
import com.Utility.ParentBase;

public class HomePageAction extends ParentBase {
	
	HomePageLocator homepageLocator = new HomePageLocator();
	
	public void ClickSigninOptionandClickonSignin(){
		
		homepageLocator.SigninOption.click();
		homepageLocator.Signin.click();
		
	}
	
	public void ClickonDealsOption() {
		
		homepageLocator.DealsOption.click();		
	}
	
	public void ClickonGamingPCDeals() {
		
		homepageLocator.GamingPCDeals.click();		
	}
	
	public void ClickOnSupportOption() {
		
		homepageLocator.SupportOption.click();
			
	}
	
	public void ClickonContactUs() {
		
		homepageLocator.ContactUs.click();
			
	}
	
	public void ClickOnOrderSupport() {
		
		homepageLocator.OrderSupport.click();
		
		
	}
	
   public void ClickOnSupportHome () {
		
		homepageLocator.SupportHome.click();
		
		
	}
	
	
	
	

}
