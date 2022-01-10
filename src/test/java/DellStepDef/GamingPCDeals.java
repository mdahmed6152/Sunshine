package DellStepDef;

import com.ActionPage.GamingPCDealsAction;
import com.ActionPage.HomePageAction;
import com.Utility.ParentBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GamingPCDeals extends ParentBase {
	
	HomePageAction homepageAction = new HomePageAction();
	GamingPCDealsAction gamingPCDealsAction = new GamingPCDealsAction();
	
	
	
	@When("^Click on Deals Option$")
	public void click_on_Deals_Option() throws Throwable {
	
		homepageAction.ClickonDealsOption();
	   
	}

	@Then("^Click on Gaming PC Deals$")
	public void click_on_Gaming_PC_Deals() throws Throwable {
		
		homepageAction.ClickonGamingPCDeals();
	   
	}

	@And("^Verify Gaming PC Deals Page$")
	public void verify_Gaming_PC_Deals_Page() throws Throwable {
		
		gamingPCDealsAction.VerifyGamingPCDealsPage();
	    
	}



}
