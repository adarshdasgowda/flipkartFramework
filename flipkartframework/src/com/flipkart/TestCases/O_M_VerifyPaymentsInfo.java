package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.PaymentsModule;

public class O_M_VerifyPaymentsInfo extends BaseClass
{
	@Test
	public void getPaymentInfo() throws InterruptedException
	{
		PaymentsModule pi = PageFactory.initElements(driver, PaymentsModule.class);

		pi.paymentsInformation();
	}

}
