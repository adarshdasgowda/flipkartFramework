package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.ListingsModule;

public class O_M_VerifyListings extends BaseClass
{
	@Test
	public void verifyListings() throws InterruptedException
	{
		ListingsModule lm = PageFactory.initElements(driver, ListingsModule.class);
		
		lm.myListingsPage(driver);
		
		lm.getActualSKUData();
		
		lm.repeatGetActualSKUData(driver);
		
		lm.getExpectedSKUData();
		
		lm.verifyListings();
		
		lm.mainFrame(driver);
	}

}
