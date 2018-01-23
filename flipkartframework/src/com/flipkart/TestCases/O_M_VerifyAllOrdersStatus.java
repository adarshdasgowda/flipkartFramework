//this test case gives the information about number of orders present in each stage.

package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.OrdersModule;

public class O_M_VerifyAllOrdersStatus extends BaseClass
{
	@Test 
	public void ordersStatus() throws InterruptedException
	{
	
		OrdersModule op = PageFactory.initElements(driver, OrdersModule.class);
		op.checkOrdersStatus();
		
		Thread.sleep(3000);
		
		//get number of upcoming orders information
		String upcomingOrders = OrdersModule.noOfUpcomingOrders.getText();
		if (upcomingOrders.length()==0)
		{
			upcomingOrders="(0)";
		}	
		System.out.println("Number of upcoming orders is :" +upcomingOrders);
		
		//get number of new orders information
		String newOrders = OrdersModule.noOfNewOrders.getText();
		if (newOrders.length()==0)
		{
			newOrders="(0)";
		}
		System.out.println("Number of new orders is :" +newOrders);
		
		//get number of orders to be packed information
		String packorders = OrdersModule.noOfPackingOrders.getText();
		if (packorders.length()==0)
		{
			packorders="(0)";
		}
		System.out.println("Number of orders need to be packed is :" +packorders);
		
		//get number of orders to be handover information
		String handOverOrders = OrdersModule.noOfHandoverOrders.getText();
		if (handOverOrders.length()==0)
		{
			handOverOrders="(0)";
		}	
		System.out.println("Number of orders need to be handover is :" +handOverOrders);
		
		//get number of orders intransit information
		String inTransitOrders = OrdersModule.inTransitOrders.getText();
		if (inTransitOrders.length()==0)
		{
			inTransitOrders="(0)";
		}	
		System.out.println("Number of orders in transit is :" +inTransitOrders);
		
		//get number of orders delivered information
		String deliveryOrders = OrdersModule.noOfOrdersDelivered.getText();
		if (deliveryOrders.length()==0)
		{
			deliveryOrders="(0)";
		}
		System.out.println("Number of orders delivered :" +deliveryOrders);
	}
}

/*
 * test script work flow
 * 1. Login to the application
 * 2. open orders module
 * 3. open active new orders page
 * 4. get information of number of upcoming orders
 * 5. get information of number of new orders
 * 6. get information of number of orders need to be packed
 * 7. get information of number of orders need to be hand over
 * 8. get information of number of orders in transit
 * 9. get information of number of orders delivered
 * 10. logout from the application
 */

/*
Output:
Login page is displayed == true
Home page is displayed == true
Active orders page is displayed == true
Number of upcoming orders is :(0)
Number of new orders is :(0)
Number of orders need to be packed is :(0)
Number of orders need to be handover is :(1)
Number of orders in transit is :(7)
Number of orders delivered :(98)
Application is logged out Successfully
Login page is displayed == true
PASSED: ordersStatus
 */
