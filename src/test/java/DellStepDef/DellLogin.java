package DellStepDef;

import com.ActionPage.HomePageAction;
import com.ActionPage.LoginPageAction;
import com.ActionPage.ProfilePageAction;
import com.Utility.ParentBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DellLogin extends ParentBase{
	
	HomePageAction homepageAction = new HomePageAction();
	LoginPageAction loginpageAction = new LoginPageAction();
	ProfilePageAction profilepageAction = new ProfilePageAction();
	
	@Given("^Launch Dell \"([^\"]*)\"$")
	public void launch_Dell(String URL) throws Throwable {
		
	    launchURL(URL);
	}

	@Then("^Click Signin Option and Click on Signin$")
	public void click_Signin_Option_and_Click_on_Signin() throws Throwable {
		
		homepageAction.ClickSigninOptionandClickonSignin();
	    
	}

	@Then("^Enter Username and Enter Password and Click Signin Button$")
	public void enter_Username_and_Enter_Password_and_Click_Signin_Button() throws Throwable {
		
		loginpageAction.UserLogin(propp.getProperty("usernamefaysal"), propp.getProperty("passwordfaysal"));
      
	  
	}

	@And("^Verify Profile Page$")
	public void verify_Profile_Page() throws Throwable {
		
		profilepageAction.VerifyProfilePage();
	    
	}


}
