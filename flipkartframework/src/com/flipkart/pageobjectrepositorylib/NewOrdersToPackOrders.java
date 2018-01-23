package com.flipkart.pageobjectrepositorylib;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewOrdersToPackOrders 
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
	private static WebElement newOrdersPageButton;
	
		//first new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[1]")
		@CacheLookup
		private static WebElement newOrderCheckbox01;	
		
		//second new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[1]")
		@CacheLookup
		private static WebElement newOrderCheckbox02;
		
		//third new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[1]")
		@CacheLookup
		private static WebElement newOrderCheckbox03;
		
		//fourth new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[1]")
		@CacheLookup
		private static WebElement newOrderCheckbox04;
		
		//fifth new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/div/div[1]")
		@CacheLookup
		private static WebElement newOrderCheckbox05;
		
		//sixth new order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/div/div[1]")
		@CacheLookup
		private static WebElement newOrderCheckbox06;
		
		//get first new order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement newOrderData01;
		
		//get second new order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement newOrderData02;
		
		//get third new order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement newOrderData03;
		
		//get fourth new order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement newOrderData04;
		
		//get fifth new order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement newOrderData05;
		
		//get sixth new order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement newOrderData06;
		
		//get first pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement packOrderData01;
		
		//get second pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement packOrderData02;
		
		//get third pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement packOrderData03;
		
		//get fourth pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement packOrderData04;
		
		//get fifth pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement packOrderData05;
		
		//get sixth pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		private static WebElement packOrderData06;
		
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
	private static WebElement packOrdersPageButton;
	
	@FindBy(xpath="//button[contains(text(),'Scan & RTD')]")
	@CacheLookup
	private static WebElement packOrdersPage;
	
	static String no1, no2, no3, no4, no5, no6;
	static String po1, po2, po3, po4, po5, po6;
	
	ArrayList<String> newOrderArray = new ArrayList<String>();
	
	ArrayList<String> packOrderArray = new ArrayList<String>();
		
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
	
	
	public void getDataFromNewOrderPage() throws InterruptedException
	{
		try
		{
			//copy new orders name to the array list
			System.out.println("********** copying orders name ono by one in new orders page **********");	
			
			newOrderArray.add(newOrderData01.getText());
			
			newOrderArray.add(newOrderData02.getText());
			
			newOrderArray.add(newOrderData03.getText());
			
			newOrderArray.add(newOrderData04.getText());
			
			newOrderArray.add(newOrderData05.getText());
			
			newOrderArray.add(newOrderData06.getText());
			
		}
		catch (Exception e) 
		{
			//print new orders names one by one
			int i=0, k=01;
			for (i=0; i<newOrderArray.size(); i++)
			{
				System.out.println("New order "+k+" => "+newOrderArray.get(i));
				k++;
			}
		}
	}
	
	public void processFromNewOrdersPage() throws InterruptedException 
	{
		try
		{
			//select new orders check box one by one
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
			//Wait for 2 seconds
			Thread.sleep(2000);
			
			//click on create label button
			createLabelButton.click();
			
			//click on download and print button
			downloadAndPrintButton.click();
			
			System.out.println("New orders labels is created and downloaded");
			
			//Wait for 5 seconds
			Thread.sleep(5000);
		}
	}
	
	public void openPackOrdersPage() throws InterruptedException
	{
		//open pack orders page
		packOrdersPageButton.click();
		
		//Wait for 10 seconds
		Thread.sleep(5000);
		
		//verify pack order page is displayed or not
		boolean status3 = packOrdersPage.isDisplayed();
		System.out.println("Pack orders page is displayed == "+status3);
	}
	
	public void getDataFromPackOrderPage() throws InterruptedException
	{
		try
		{
			//copy pack orders name to the array list
			System.out.println("********** copying orders name ono by one in pack orders page **********");	
			
			packOrderArray.add(packOrderData01.getText());
			
			packOrderArray.add(packOrderData02.getText());
			
			packOrderArray.add(packOrderData03.getText());
			
			packOrderArray.add(packOrderData04.getText());
			
			packOrderArray.add(packOrderData05.getText());
			
			packOrderArray.add(packOrderData06.getText());
		}
		catch (Exception e) 
		{
			//print pack orders names one by one
			int i=0, k=01;
			for (i=0; i<packOrderArray.size(); i++)
			{
				System.out.println("Pack order "+k+" => "+packOrderArray.get(i));
				k++;
			}
		}
	}
	
	public void verifyData() throws InterruptedException
	{
		//here i'm using while loop to make packOrderArray array list size and handoverOrderArray array list size equal. 
		//Otherwise if packOrderArray array list size and handoverOrderArray array list size is not equal it will through java.lang.IndexOutOfBoundsException.
		
		while(newOrderArray.size()>packOrderArray.size()) 
		{
			packOrderArray.add("null");
		}
		
		while(newOrderArray.size()<packOrderArray.size())
		{
			newOrderArray.add("null");
		}
		
		for (int i=0; i<packOrderArray.size(); i++)
		{
			if (packOrderArray.contains(newOrderArray.get(i)))
			{
				System.out.println("order => "+newOrderArray.get(i)+"is verified successfully");
			}
			else 
			{
				System.out.println("order => "+newOrderArray.get(i)+"is not verified successfully");
			}
		}
	}
}
