package com.ActionPage;

import com.LocatorPage.LoginPageLocator;
import com.Utility.ParentBase;

public class LoginPageAction extends ParentBase{
	
	LoginPageLocator loginpageLocator = new LoginPageLocator();
	
	public void UserLogin(String U, String P) {
		
		loginpageLocator.Username.sendKeys(U);
		loginpageLocator.Password.sendKeys(P);
		loginpageLocator.SigninButton.click();
		
	}

}
