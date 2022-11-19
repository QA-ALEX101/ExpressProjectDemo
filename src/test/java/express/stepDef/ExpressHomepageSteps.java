package express.stepDef;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import express.pageAction.ExpressHomepageActions;
import express.utilities.SetupDrivers;

public class ExpressHomepageSteps {
	
	ExpressHomepageActions ExpressHomepageActionsObj = new ExpressHomepageActions();
	
	
	@Given("^Open Express Homepage$")
	public void open_Express_Homepage() throws Throwable {
		ExpressHomepageActionsObj.loadHomepage();
	}
	@When("^Mousehover to My Account$")
	public void mousehover_to_My_Account() throws Throwable {
		ExpressHomepageActionsObj.mouseHoverMyAccount();
	}

	@When("^Clicks on Sign$")
	public void clicks_on_Sign() throws Throwable {
		ExpressHomepageActionsObj.linkSignIn();
	}

	@When("^Enter Email  Address$")
	public void enter_Email_Address() throws Throwable {
		ExpressHomepageActionsObj.linkUserEmail();
    
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		ExpressHomepageActionsObj.linkPassword();
		
		
	}

	@When("^Click on Sign In after$")
	public void click_on_Sign_In_after() throws Throwable {
		ExpressHomepageActionsObj.clickSubmit();
}
	


}
