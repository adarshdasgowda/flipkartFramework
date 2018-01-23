package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.CheckLiveListings;

public class VerifyLiveListings extends BaseClass
{
	
	@Test 
	public void liveListings() throws InterruptedException
	{
		//check number of products listed in live tab
		CheckLiveListings cno = PageFactory.initElements(driver, CheckLiveListings.class);
		cno.checkLiveListings();
		
		Thread.sleep(3000);
		
		String livelistings = CheckLiveListings.liveListingsTab.getText();
		System.out.println("Number of products listed in live tab is :" +livelistings);
	}
	
}
