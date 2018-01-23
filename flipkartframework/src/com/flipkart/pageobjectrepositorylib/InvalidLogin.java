package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.flipkart.genericlib.Constants;

public class InvalidLogin 
{
	@FindBy(xpath="//h2[text()='Login']")
	@CacheLookup
	private WebElement verifyPage;
	
	@FindBy(id="username")
	@CacheLookup
	private WebElement userName;
	
	@FindBy(id="userpass")
	@CacheLookup
	private WebElement passWord;
	
	@FindBy(id="edit-submit")
	@CacheLookup
	private WebElement loginButton;	
	
	@FindBy(xpath="//div[contains(text(),'password do not match')]")
	@CacheLookup
	public static WebElement loginErrorMsg;
	
	public void verifyLoginPage()
	{
		//verify login page is displayed or not
		boolean status = verifyPage.isDisplayed();
		System.out.println("Login page is displayed == "+status);
	}

	//login method for invalid username and valid password
	public void invalidUNLogin()
	{	
		
		//enter invalid username
		userName.sendKeys(Constants.invalidUsername);
		
		//enter valid password
		passWord.sendKeys(Constants.password);
		
		//click on login button
		loginButton.click();
			
	}
	
	//login method for valid username and invalid password
	public void invalidPWLogin()
	{	
		
		//enter invalid username
		userName.sendKeys(Constants.username);
		
		//enter valid password
		passWord.sendKeys(Constants.invalidPassword);
		
		//click on login button
		loginButton.click();
		
	}
	
	//login method for valid username and blank password
	public void blankUNLogin()
	{	
		
		//enter invalid username
		userName.sendKeys(Constants.username);
		
		//enter valid password
		passWord.sendKeys(Constants.blankPassword);
		
		//click on login button
		loginButton.click();
		
	}
	
	//login method for blank username and valid password
	public void blanPWLogin()
	{	
		
		//enter invalid username
		userName.sendKeys(Constants.username);
		
		//enter valid password
		passWord.sendKeys(Constants.blankPassword);
		
		//click on login button
		loginButton.click();
		
	}
	
	//login method for blank username and blank password
	public void blankUNPWLogin()
	{	
		
		//enter invalid username
		userName.sendKeys(Constants.blankUsername);
		
		//enter valid password
		passWord.sendKeys(Constants.blankPassword);
		
		//click on login button
		loginButton.click();
		
	}

}
