package express.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import express.pageElements.ExpressHomepageLocators;
import express.utilities.SetupDrivers;

public class ExpressHomepageActions {
	
	ExpressHomepageLocators ExpressHomepageLocatorsObj;
	
	public ExpressHomepageActions(){
		ExpressHomepageLocatorsObj = new ExpressHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, ExpressHomepageLocatorsObj);
		
	}
		
	//}
	//public void mouseHoverWomen(){
		//Actions actions = new Actions(SetupDrivers.driver);
		//actions.moveToElement(ExpressHomepageLocatorsObj.Women).build().perform();
		
	
	public void  linkTop(){
		ExpressHomepageLocatorsObj.Tops.isEnabled();
		ExpressHomepageLocatorsObj.Tops.click();
		
		
	}
	public void loadHomepage(){
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	public void mouseHoverMyAccount() throws Exception {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(ExpressHomepageLocatorsObj.linkMyAccount);
		actions.perform();
		Thread.sleep(2000);
	}
		
	public void linkSignIn() throws Exception{

		ExpressHomepageLocatorsObj.linkSignIn.click();
		Thread.sleep(2000);
	
	}
	public void linkUserEmail()throws Exception{
		ExpressHomepageLocatorsObj.linkUserEmail.sendKeys("alax1986@gmail.com");
		Thread.sleep(2000);
		
	}
	public void linkPassword(){
		ExpressHomepageLocatorsObj.linkPassword.sendKeys(".6eHHC4d3N6");
		
		
	}
	public void clickSubmit() throws Exception {
		ExpressHomepageLocatorsObj.clickSubmit.click();
		Thread.sleep(10000);
		
	}
		
}
