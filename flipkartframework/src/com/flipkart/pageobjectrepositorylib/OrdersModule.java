package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OrdersModule
{
	//orders module button
	@FindBy(xpath="//a[text()='Orders']")
	@CacheLookup
	private WebElement orders_Module;
	
	//active orders page
	@FindBy(xpath="//h4[text()='Active Orders']")
	@CacheLookup
	private WebElement active_Orders_Page;
	
	//upcoming orders
	@FindBy(xpath="//span[contains(text(),'New')]/../../li[1]/span/span")
	@CacheLookup
	public static WebElement noOfUpcomingOrders;
	
	//new orders
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[2]/span/span")
	@CacheLookup
	public static WebElement noOfNewOrders;
	
	//pack orders
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[3]/span/span")
	@CacheLookup
	public static WebElement noOfPackingOrders;
	
	//handover orders
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[4]/span/span")
	@CacheLookup
	public static WebElement noOfHandoverOrders;
	
	//intransit orders
	@FindBy(xpath="//span[contains(text(),'New')]/../../li[5]/span/span")
	@CacheLookup
	public static WebElement inTransitOrders;
	
	//complete orders
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[7]/span/span")
	@CacheLookup
	public static WebElement noOfOrdersDelivered;
	
	public void checkOrdersStatus()
	{
		//click on orders module
		orders_Module.click();
		
		//verify active orders page is displayed or not
		boolean status = active_Orders_Page.isDisplayed();
		System.out.println("Active orders page is displayed == "+status);	
	}
}
