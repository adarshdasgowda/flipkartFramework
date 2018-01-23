package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.PackOrdersToHandoverOrders;

public class I_T_PackOrdersToHandoverOrders extends BaseClass
{
	@Test
	public void IT() throws InterruptedException
	{
		PackOrdersToHandoverOrders ntop = PageFactory.initElements(driver, PackOrdersToHandoverOrders.class);
		ntop.verifyOrdersPage();
		ntop.getDataFromPackOrderPage2();
		ntop.processFromPackOrdersPage();
		ntop.openHandoverOrdersPage();
		ntop.getDataFromHandoverOrderPage2();
		ntop.verifyData2();
	}

}
