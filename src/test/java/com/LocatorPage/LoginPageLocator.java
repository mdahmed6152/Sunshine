package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ParentBase;

public class LoginPageLocator extends ParentBase {
	
public LoginPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.ID, using="EmailAddress")
	public WebElement Username;
	
	@FindBy(how=How.ID, using="Password")
	public WebElement Password;
	
	@FindBy(how=How.ID, using="sign-in-button")
	public WebElement SigninButton;

}
