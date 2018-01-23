package com.flipkart.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.genericlib.Browser;
import com.flipkart.genericlib.Constants;
import com.flipkart.genericlib.WebDriverCommonLib;
import com.flipkart.pageobjectrepositorylib.InvalidLogin;

public class VerifyInvalidLogin 
{
	WebDriverCommonLib wlib= new WebDriverCommonLib();
	WebDriver driver;
	
	@BeforeMethod
	public void configureBeforeClass()
	{
		driver = Browser.getBrowser();
		wlib.waitForPageToLoad();
		driver.get(Constants.url);
		//verify login page is displayed or not
		InvalidLogin lipv = PageFactory.initElements(driver, InvalidLogin.class);
		lipv.verifyLoginPage();
	}
	
	@Test (priority=1)
	public void invalidUNlogin()
	{
		//login to gmail application
		InvalidLogin linv = PageFactory.initElements(driver, InvalidLogin.class);
		linv.invalidUNLogin();
		
		String actualMsg = InvalidLogin.loginErrorMsg.getText();
		System.out.println("actual error message :" +actualMsg);
		String expectedMsg = "Username and password do not match.";
		System.out.println("expected error message :" +expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	@Test (priority=2)
	public void invalidPWlogin()
	{
		//login to gmail application
		InvalidLogin linv = PageFactory.initElements(driver, InvalidLogin.class);
		linv.invalidPWLogin();
		
		String actualMsg = InvalidLogin.loginErrorMsg.getText();
		System.out.println("actual error message :" +actualMsg);
		String expectedMsg = "Username and password do not match.";
		System.out.println("expected error message :" +expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	@Test (priority=3)
	public void blankUNPWlogin()
	{
		//login to gmail application
		InvalidLogin linv = PageFactory.initElements(driver, InvalidLogin.class);
		linv.blankUNPWLogin();
		
		String actualMsg = InvalidLogin.loginErrorMsg.getText();
		System.out.println("actual error message :" +actualMsg);
		String expectedMsg = "Username and password do not match.";
		System.out.println("expected error message :" +expectedMsg);
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//close browser
		driver.close();
	}

}
