package express.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import express.utilities.SetupDrivers;

public class ExpressHomepageLocators {
	
	//MouseHover Women
	@FindBy(xpath="//div[@id='root']//nav/ol/li[1]/a")
	public WebElement Women;
	
	//Link Tops
	@FindBy(xpath="//div[@id='root-Women']/ol[1]/li[1]//li[1]/a")
	public WebElement Tops;

	//MouseHover My Account
	@FindBy(xpath="//button[@aria-label='my account']")
	public WebElement linkMyAccount;
	
	//Click on Sign In
	@FindBy (xpath="//button[@aria-label='sign in']")
	public WebElement linkSignIn;
	
	//Enter Email
	@FindBy (xpath="//input[@aria-label='Email']")
	public WebElement linkUserEmail;

	
	//Enter Password
	@FindBy (xpath="//input[@aria-label='Password']")
	public WebElement linkPassword;
	
	//Submit Button
	@FindBy (xpath="//button[@type='submit']")
	public WebElement clickSubmit;
	

	

}