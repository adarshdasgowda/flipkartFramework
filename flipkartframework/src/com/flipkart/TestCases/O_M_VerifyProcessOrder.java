package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.ProcessOrder;

public class O_M_VerifyProcessOrder extends BaseClass
{	
	@Test 
	public void verifyProcessOrder() throws InterruptedException 
	{
		ProcessOrder po = PageFactory.initElements(driver, ProcessOrder.class);
		
		//verify orders page
		po.verifyOrdersPage();
		
		//process all orders from new orders page
		po.processFromNewOrdersPage();
		
		//process all orders from pack orders page
		po.processFromPackOrdersPage();
		
		//download manifest of the processed orders
		po.downloadmanifestOfNewOrders();	
		
	}
}

/*
 * test script work flow
 * 1. Login to the application
 * 2. open orders module
 * 3. open new orders page
 * 4. select orders which is present in new orders page
 * 5. click on create label button
 * 6. click on download and print button
 * 7. label will be download and all orders will move to pack orders page
 * 8. open pack orders page
 * 9. select orders which is present in pack orders page
 * 10. click on ready to dispatch button
 * 11. pop up will come and click on yes button
 * 12. now all orders will move to hand over orders page
 * 13. open hand over orders page
 * 14. click on download manifest form button
 * 15. manifest will download
 * 16. logout from the application
 */
