package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.NewOrdersToPackOrders;


public class I_T_NewOrdersToPackOrders extends BaseClass
{
	@Test
	public void IT() throws InterruptedException
	{
		NewOrdersToPackOrders ntop = PageFactory.initElements(driver, NewOrdersToPackOrders.class);
		ntop.verifyOrdersPage();
		ntop.getDataFromNewOrderPage();
		ntop.processFromNewOrdersPage();
		ntop.openPackOrdersPage();
		ntop.getDataFromPackOrderPage();
		ntop.verifyData();
	}

}
