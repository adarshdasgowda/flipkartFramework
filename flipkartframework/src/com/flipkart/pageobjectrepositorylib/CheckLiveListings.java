package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckLiveListings 
{
	
	@FindBy(xpath="//a[contains(text(),'Listings')]")
	private WebElement listingsModule;
	
	//@FindBy (xpath="//div[@id='listings']/div/div/div/div[1]/div/h3[contains(text(),'My Listings')]")
	//private WebElement myListingsPage;
	
	@FindBy (xpath="//li[@id='live_listings_tab']/a")
	public static WebElement liveListingsTab;
	
	public void checkLiveListings()
	{
		//click on listings module
		listingsModule.click();
		
		//check weather my listings page is displayed or not
		//boolean status = myListingsPage.isDisplayed();
		//System.out.println(status);
		
	}

}
