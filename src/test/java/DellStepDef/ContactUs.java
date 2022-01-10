package DellStepDef;

import com.ActionPage.ContactUsAction;
import com.ActionPage.HomePageAction;
import com.Utility.ParentBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs extends ParentBase {
	
	HomePageAction homepageAction = new HomePageAction();
	ContactUsAction contactUsAction = new ContactUsAction();
	
	@When("^Click On Support Option$")
	public void click_On_Support_Option() throws Throwable {
		
		homepageAction.ClickOnSupportOption();	
	}
	
	@Then("^Click on Contact Us$")
	public void click_on_Contact_Us() throws Throwable {
		
		homepageAction.ClickonContactUs();
	    
	}

	@And("^Verify Contact Us Page$")
	public void verify_Contact_Us_Page() throws Throwable {
		
		contactUsAction.VerifyContactUsPage();
		
	}



}
