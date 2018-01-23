package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProcessOrder 
{
	//orders module button
	@FindBy(xpath="//a[text()='Orders']")
	@CacheLookup
	private WebElement order_Module;
	
	//active orders page
	@FindBy(xpath="//h4[text()='Active Orders']")
	@CacheLookup
	private WebElement activeOrdersPage;
	
	//new orders button
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[2]")
	@CacheLookup
	public static WebElement newOrdersPageButton;
	
		//first new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[1]")
		@CacheLookup
		public static WebElement newOrderCheckbox01;
		
		//second new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[1]")
		@CacheLookup
		public static WebElement newOrderCheckbox02;
		
		//third new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[1]")
		@CacheLookup
		public static WebElement newOrderCheckbox03;
		
		//fourth new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[1]")
		@CacheLookup
		public static WebElement newOrderCheckbox04;
		
		//fifth new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/div/div[1]")
		@CacheLookup
		public static WebElement newOrderCheckbox05;
		
		//sixth new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/div/div[1]")
		@CacheLookup
		public static WebElement newOrderCheckbox06;
	
	//create label button
	@FindBy(xpath="//button[contains(text(),'Bulk processing')]/../../div[2]/button[1]")
	@CacheLookup
	private WebElement createLabelButton;
	
	//download and print label button
	@FindBy(xpath="//span[contains(text(),'Download & Print')]")
	@CacheLookup
	private WebElement downloadAndPrintButton;
	
	//pack orders page button
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[3]")
	@CacheLookup
	public static WebElement packOrdersPageButton;
	
	@FindBy(xpath="//button[contains(text(),'Scan & RTD')]")
	@CacheLookup
	public static WebElement packOrdersPage;
	
	//ready to dispatch button
	@FindBy(xpath="//button[contains(text(),'Ready to Dispatch')]")
	@CacheLookup
	private WebElement readyToDispatchButton;
	
	//yes pop up button
	@FindBy(xpath="//span[contains(text(),'Yes')]/..")
	@CacheLookup
	private WebElement yesButton;
	
	//handover orders page button
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[4]")
	@CacheLookup
	public static WebElement handoverOrderButton;
	
	//download manifest button
	@FindBy(xpath="//button[@class='download-manifest' and contains(text(),'Download Manifest')]")
	@CacheLookup
	public static WebElement downloadManifestButton;
	
		
	public void verifyOrdersPage() throws InterruptedException 
	{
		//open orders module
		order_Module.click();
		
		//verify active orders page is displayed or not
		boolean status1 = activeOrdersPage.isDisplayed();
		System.out.println("Active orders page is displayed == "+status1);
		
		//open new orders page
		newOrdersPageButton.click();

	}
	
	public void processFromNewOrdersPage() throws InterruptedException 
	{
		try
		{
			//select new orders checkbox one by one
			System.out.println("********** selecting orders ono by one in new orders page **********");
			
			newOrderCheckbox01.click();
			
			newOrderCheckbox02.click();
			
			newOrderCheckbox03.click();
			
			newOrderCheckbox04.click();
			
			newOrderCheckbox05.click();
			
			newOrderCheckbox06.click();	
		}
		
		catch (Exception e) 
		{
			//click on create label button
			createLabelButton.click();
			
			//click on download and print button
			downloadAndPrintButton.click();
			
			System.out.println("New orders labels is created and downloaded");
			
			//Wait for 10 seconds
			Thread.sleep(10000);
		}
	}
		
		
	public void processFromPackOrdersPage() throws InterruptedException
	{
		//open pack orders page
		packOrdersPageButton.click();
		
		//Wait for 10 seconds
		Thread.sleep(10000);
		
		//verify pack order page is displayed or not
		boolean status3 = packOrdersPage.isDisplayed();
		System.out.println("Pack orders page is displayed == "+status3);
		
		//verify after label created, order details is moved from new tab to pack tab or not
		
		try
		{
			//select new orders checkbox one by one
			System.out.println("********** selecting orders ono by one in pack orders page **********");
			
			newOrderCheckbox01.click();
			
			newOrderCheckbox02.click();
			
			newOrderCheckbox03.click();
			
			newOrderCheckbox04.click();
			
			newOrderCheckbox05.click();
			
			newOrderCheckbox06.click();	
		}
		catch (Exception e) 
		{
			//click on ready to dispatch button
			readyToDispatchButton.click();
			
			//click on yes button of confirmation popup
			yesButton.click();
			
			System.out.println("Order is packed and ready to dispatch");
			
			//Wait for 10 seconds
			Thread.sleep(10000);
		}		
	}
	
	public void downloadmanifestOfNewOrders() throws InterruptedException
	{
		//open handover order page
		handoverOrderButton.click();
		
		//click on download manifest button 
		downloadManifestButton.click();
	}
}
