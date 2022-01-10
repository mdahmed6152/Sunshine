package DellStepDef;

import com.ActionPage.HomePageAction;
import com.ActionPage.OrderSupportAction;
import com.Utility.ParentBase;

import cucumber.api.java.en.Then;

public class OrderSupport extends ParentBase{
	
	HomePageAction homepageAction = new HomePageAction();
	OrderSupportAction  orderSupportAction = new OrderSupportAction();
	
	@Then("^Click On Order Support$")
	public void click_On_Order_Support() throws Throwable {
		
		 homepageAction.ClickOnOrderSupport();
	    
	}

	@Then("^Verify Order Support Page$")
	public void verify_Order_Support_Page() throws Throwable {
		
		orderSupportAction.VerifyOrderSupportPage();
	    
	}



}
