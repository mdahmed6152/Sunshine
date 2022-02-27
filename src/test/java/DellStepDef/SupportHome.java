package DellStepDef;

import com.ActionPage.HomePageAction;
import com.ActionPage.SupportHomeAction;
import com.Utility.ParentBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupportHome extends ParentBase {
	
	HomePageAction homePageAction = new HomePageAction();
	
	SupportHomeAction supportHomeAction = new SupportHomeAction();
	
	@When("^Click On Support Home$")
	public void click_On_Support_Home() throws Throwable {
	    
		homePageAction.ClickOnSupportHome();
	}

	@Then("^Verify Support Home Page$")
	public void verify_Support_Home_Page() throws Throwable {
	    
		supportHomeAction.VerifySupportHomePage();
	}


}
