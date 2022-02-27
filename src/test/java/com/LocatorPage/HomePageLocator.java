package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ParentBase;

public class HomePageLocator extends ParentBase {

	public HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.CSS, using="span[data-header-label='Sign In']")
	public WebElement SigninOption;
	
	@FindBy(how=How.CSS, using="a[class='mh-btn mh-btn-primary navigate']")
	public WebElement Signin;
	
	@FindBy(how=How.XPATH, using="//span[text()='Deals']")
	public WebElement DealsOption;
	
	@FindBy(how=How.XPATH, using="//a[text()='Gaming PC Deals']")
	public WebElement GamingPCDeals;
	
	@FindBy(how=How.XPATH, using="//span[text()='Support']")
	public WebElement SupportOption;
	
	@FindBy(how=How.LINK_TEXT, using="Contact Us")
	public WebElement ContactUs;
	
	@FindBy(how=How.XPATH, using="//a[text()='Order Support']")
	public WebElement OrderSupport;
	
	@FindBy(how=How.LINK_TEXT, using="Support Home")
	public WebElement SupportHome;

	
	
}
