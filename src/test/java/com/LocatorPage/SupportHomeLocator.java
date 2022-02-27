package com.LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utility.ParentBase;

public class SupportHomeLocator extends ParentBase {
	
public SupportHomeLocator() {
	
		
 PageFactory.initElements(driver, this);
		
	}

  @FindBy(how=How.XPATH, using="//h1[text()='Welcome to Support']")
  public WebElement SupportHomePage;

	
		
}



