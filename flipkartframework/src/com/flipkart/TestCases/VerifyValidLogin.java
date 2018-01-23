package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.Login;
import com.flipkart.pageobjectrepositorylib.Logout;

public class VerifyValidLogin extends BaseClass
{
	
	@Test
	public void login()
	{
		//verify login page is displayed or not
		Login lipv = PageFactory.initElements(driver, Login.class);
		lipv.verifyLoginPage();
		
		//login to gmail application
		Login linv = PageFactory.initElements(driver, Login.class);
		linv.validLogin();
		
		//verify home page is displayed or not
		Login lihpv = PageFactory.initElements(driver, Login.class);
		lihpv.verifyHomePage();
	}
	
	
	@Test
	public void logout()
	{
		//login from gmail application
		Logout lout = PageFactory.initElements(driver, Logout.class);
		lout.logout();
		
		//verify login page is displayed or not
		Logout lopv = PageFactory.initElements(driver, Logout.class);
		lopv.verifyLogoutPage();
	}

}
