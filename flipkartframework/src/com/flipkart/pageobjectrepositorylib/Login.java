package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.flipkart.genericlib.Constants;

public class Login 
{
	@FindBy(xpath="//h2[text()='Login']")
	@CacheLookup
	private WebElement verifyloginpage;
	
	@FindBy(id="username")
	@CacheLookup
	private WebElement userName;
	
	@FindBy(id="userpass")
	@CacheLookup
	private WebElement passWord;
	
	@FindBy(id="edit-submit")
	@CacheLookup
	private WebElement loginButton;	
	
	@FindBy(xpath="//a[text()='Home']")
	@CacheLookup
	private WebElement verifyhomepage;
	
	public void verifyLoginPage()
	{
		//verify login page is displayed or not
		boolean status = verifyloginpage.isDisplayed();
		System.out.println("Login page is displayed == "+status);
	}

	//login method for valid username and valid password
	public void validLogin()
	{	
		
		//enter valid username
		userName.sendKeys(Constants.username);
		
		//enter valid password
		passWord.sendKeys(Constants.password);
		
		//click on login button
		loginButton.click();
		
		System.out.println("User is logged inn to the application successfully");
	}
	
	public void verifyHomePage()
	{
		//verify login page is displayed or not
		boolean status = verifyhomepage.isDisplayed();
		System.out.println("Home page is displayed == "+status);
	}

}
