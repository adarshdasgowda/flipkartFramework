package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Logout 
{
	@FindBy(xpath="//a[@id='notificationDD']/../../../ul/li[3]/span/a/span")
	@CacheLookup
	private WebElement logoutLink;
	
	@FindBy(xpath="//a[@class='logout_from_session']")
	@CacheLookup
	private WebElement logoutButton;
	
	@FindBy(xpath="//h2[text()='Login']")
	@CacheLookup
	private WebElement verifyPage;
	
	public void logout()
	{
		//click on gmail account icon
		logoutLink.click();
		
		//click on signout button
		logoutButton.click();	
		
		System.out.println("User is logged out from the application successfully");
	}
	
	public void verifyLogoutPage() 
	{	
		//verify login page is displayed or not after logout
		boolean status = verifyPage.isDisplayed();
		System.out.println("Login page is displayed == "+status);	
	}

}
