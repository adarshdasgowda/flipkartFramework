package com.flipkart.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.flipkart.pageobjectrepositorylib.ReturnsModule;

public class O_M_VerifyReturnOrdersStatus extends BaseClass
{
	//verify return orders page
	@Test (priority=1)
	public void VerifyReturnOrderPage() throws InterruptedException
	{
		ReturnsModule rm = PageFactory.initElements(driver, ReturnsModule.class);
		rm.checkReturnOrdersPage();
	}
	
	//get information about approved return orders
	@Test (priority=2)
	public void verifyApprovedReturnOrders() throws InterruptedException
	{
		ReturnsModule rm = PageFactory.initElements(driver, ReturnsModule.class);
		rm.approvedReturnOrdersInfo();
	}
	
	//get information about intransit return orders
	@Test (priority=3)
	public void verifyIntransitReturnOrders() throws InterruptedException
	{
		ReturnsModule rm = PageFactory.initElements(driver, ReturnsModule.class);
		rm.intransitReturnOrdersInfo();
	}
	
	//get information about return orders delivered
	@Test (priority=4)
	public void verifyReturnOrdersCompleted() throws InterruptedException
	{
		ReturnsModule rm = PageFactory.initElements(driver, ReturnsModule.class);
		rm.returnOrdersCompletedInfo();
	}
}

/*
 * test script work flow
 * 1. Login to the application
 * 2. open return orders module
 * 3. open approved return orders page
 * 4. get information about approved return orders one by one
 * 5. open intransit return orders page
 * 6. get information about intransit return orders one by one
 * 7. open return orders completed page
 * 8. get information about return orders completed one by one
 * 9. logout from the application
 */


/*
Output:
Login page is displayed == true
Home page is displayed == true
Returns page is displayed == true
********** approved return order status is as bellow **********
approved return order 01 is :Secro 2 RCA Female to 3.5mm Aux Stereo Male Jack Connecto AV Video Splitter Cable Adaptor (Pack Of 2) RCA Audio Video Cable
 
********** intransit return order status is as bellow **********
Intransit return order 01 is :Hi Focus Hi-Focus 004 Worldwide Adaptor
Intransit return order 02 is :Secro 2 RCA Female to 3.5mm Aux Stereo Male Jack Connecto AV Video Splitter Cable Adaptor (Pack Of 2) RCA Audio Video Cable
Intransit return order 03 is :FOX FX-151 Audio Microphone

********** return order completed status is as bellow **********
return order completed 01 is :C&E 6Inch 3.5mm Stereo Female to 2 RCA Male Cable, Gold-Plated (Red & White) CNE63102
return order completed 02 is :Secro 2 RCA Female to 3.5mm Aux Stereo Male Jack Connecto AV Video Splitter Cable Adaptor (Pack Of 2) RCA Audio Video Cable
return order completed 03 is :C&E 6Inch 3.5mm Stereo Male to 2 RCA Female Cable, Gold-Plated (Red & White) CNE63119
return order completed 04 is :C&E 6Inch 3.5mm Stereo Female to 2 RCA Male Cable, Gold-Plated (Red & White) CNE63102
return order completed 05 is :Secro 2 RCA Female to 3.5mm Aux Stereo Male Jack Connecto AV Video Splitter Cable Adaptor (Pack Of 2) RCA Audio Video Cable
return order completed 06 is :HOC Power Cable Computer / Printer / Desktop / PC / SMPS Power Cable 1.5 Meter Power Cord
return order completed 07 is :Secro 2 RCA Female to 3.5mm Aux Stereo Male Jack Connecto AV Video Splitter Cable Adaptor (Pack Of 2) RCA Audio Video Cable
return order completed 08 is :Rapter BNC Male to RCA Female connector for Audio and Video Wire Connector
return order completed 09 is :C&E 6Inch 3.5mm Stereo Female to 2 RCA Male Cable, Gold-Plated (Red & White) CNE63102
return order completed 10 is :C&E 6Inch 3.5mm Stereo Male to 2 RCA Female Cable, Gold-Plated (Red & White) CNE63119
 
Application is logged out Successfully
Login page is displayed == true
PASSED: VerifyReturnOrderPage
PASSED: verifyApprovedReturnOrders
PASSED: verifyIntransitReturnOrders
PASSED: verifyReturnOrdersCompleted
*/
