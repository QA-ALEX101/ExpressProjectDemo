Feature: Express Sign In Funtionality

    Background:
		Given Open Express Homepage
		
	Scenario: Expresss Sign In Funtionality
		When Mousehover to My Account
		And Clicks on Sign
		And Enter Email  Address 
		And Enter Password
   		And Click on Sign In after
   		Then User should be directed to welcome page