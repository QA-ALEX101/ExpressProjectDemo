package express.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeAction {
	
	@Before
	public void beforeActions(Scenario scen){
		System.out.println("--->>>>> Initializing Driver....");
		SetupDrivers.setupDriver();
		System.out.print("Test Scenario Name: "+ scen.getName());
		
	}
}
