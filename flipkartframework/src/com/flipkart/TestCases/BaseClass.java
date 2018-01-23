package com.flipkart.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import com.flipkart.genericlib.Browser;
import com.flipkart.genericlib.Constants;
import com.flipkart.genericlib.WebDriverCommonLib;
import com.flipkart.pageobjectrepositorylib.Login;
import com.flipkart.pageobjectrepositorylib.Logout;

public class BaseClass 
{
	WebDriverCommonLib wlib= new WebDriverCommonLib();
	WebDriver driver;
	
	@BeforeTest
	public void configureBeforeClass()
	{
		driver = Browser.getBrowser();
		System.out.println("Browser is opened Successfully");
		wlib.waitForPageToLoad();
		driver.get(Constants.url);
	}
	
	@BeforeClass
	public void loginToFlipkartApplication()
	{
		//verify login page is displayed or not
		Login lipv = PageFactory.initElements(driver, Login.class);
		lipv.verifyLoginPage();
		
		//login to seller application
		Login linv = PageFactory.initElements(driver, Login.class);
		linv.validLogin();
		
		//verify home page is displayed or not
		Login lihpv = PageFactory.initElements(driver, Login.class);
		lihpv.verifyHomePage();
	}
	
	@AfterMethod
	public void failedTCScreenshot(ITestResult result)
	{
		//take screenshot if the method gets failed
		if (ITestResult.FAILURE==result.getStatus())
		{	
			com.flipkart.genericlib.Screenshot.takeScreenshot(driver, result.getName());
		}
		
		//print date and time when test case gets executed
		//com.flipkart.genericlib.TimeStamp.getTimeStamp();
		
	}
	
	@AfterClass
	public void logoutFromFlipkartApplication()
	{
		//logout from seller application
		Logout lout = PageFactory.initElements(driver, Logout.class);
		lout.logout();
		
		//verify login page is displayed or not
		Logout lopv = PageFactory.initElements(driver, Logout.class);
		lopv.verifyLogoutPage();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		//close browser
		driver.quit();
		System.out.println("Browser is closed Successfully");
	}
	

}
