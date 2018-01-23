package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckNonLiveListings 
{

	@FindBy(xpath="//a[contains(text(),'Listings')]")
	private WebElement listingsModule;
	
	@FindBy (xpath="//h3[contains(text(),'My Listings')]")
	private WebElement myListingsPage;
	
	@FindBy (xpath="//li[@id='non_live_listings_tab']/a")
	public static WebElement nonLiveListingsTab;
	
	public void checkLiveListings()
	{
		//click on listings module
		listingsModule.click();
		
		//check weather my listings page is disolayed or not
		boolean status = myListingsPage.isDisplayed();
		System.out.println(status);
		
	}

}
