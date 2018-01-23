package com.flipkart.pageobjectrepositorylib;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PackOrdersToHandoverOrders 
{
	//orders module button
	@FindBy(xpath="//a[text()='Orders']")
	@CacheLookup
	private WebElement order_Module;
	
	//active orders page
	@FindBy(xpath="//h4[text()='Active Orders']")
	@CacheLookup
	private WebElement activeOrdersPage;
	
	//pack orders button
	@FindBy(xpath="//span[contains(text(),'Upcoming')]/../../li[3]")
	@CacheLookup
	public static WebElement packOrdersPageButton;
	
		//first pack order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[1]")
		@CacheLookup
		public static WebElement packOrderCheckbox01;	
		
		//second pack order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[1]")
		@CacheLookup
		public static WebElement packOrderCheckbox02;
		
		//third pack order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[1]")
		@CacheLookup
		public static WebElement packOrderCheckbox03;
		
		//fourth pack order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[1]")
		@CacheLookup
		public static WebElement packOrderCheckbox04;
		
		//fifth pack order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/div/div[1]")
		@CacheLookup
		public static WebElement packOrderCheckbox05;
		
		//sixth pack order checkbox
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/div/div[1]")
		@CacheLookup
		public static WebElement packOrderCheckbox06;
		
		//get first pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement packOrderData01;
		
		//get second pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement packOrderData02;
		
		//get third pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement packOrderData03;
		
		//get fourth pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement packOrderData04;
		
		//get fifth pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement packOrderData05;
		
		//get sixth pack order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement packOrderData06;
		
		//get first handover order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement handoverOrderData01;
		
		//get second handover order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement handoverOrderData02;
		
		//get third handover order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement handoverOrderData03;
		
		//get fourth handover order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement handoverOrderData04;
		
		//get fifth handover order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[5]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement handoverOrderData05;
		
		//get sixth handover order data
		@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[6]/div/div[2]/div/div[2]/div[1]")
		@CacheLookup
		public static WebElement handoverOrderData06;
		
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
	public static WebElement handovreOrdersPageButton;
	
	//show orders button
	@FindBy(xpath="//div[@id='orders_accordion0']/div[2]/div[2]")
	@CacheLookup
	public static WebElement showOrdersButton;
	
	//download manifest button
	@FindBy(xpath="//button[@class='download-manifest' and contains(text(),'Download Manifest')]")
	@CacheLookup
	public static WebElement downloadManifestButton;
	
	static String po1, po2, po3, po4, po5, po6;
	static String ho1, ho2, ho3, ho4, ho5, ho6;
	
	ArrayList<String> packOrderArray = new ArrayList<String>();
	
	ArrayList<String> handoverOrderArray = new ArrayList<String>();
		
	public void verifyOrdersPage() throws InterruptedException 
	{
		//open orders module
		order_Module.click();
		
		//verify active orders page is displayed or not
		boolean status1 = activeOrdersPage.isDisplayed();
		System.out.println("Active orders page is displayed == "+status1);
		
		//open pack orders page
		packOrdersPageButton.click();
	}
	
	public void getDataFromPackOrderPage1() throws InterruptedException
	{
		try
		{
			//copy pack orders name to the variables
			System.out.println("********** copying orders name ono by one in pack orders page **********");	
			
			po1 = packOrderData01.getText();
			System.out.println("po1 = "+po1);
			packOrderArray.add(po1);
			
			po2 = packOrderData02.getText();
			System.out.println("po2 = "+po2);
			packOrderArray.add(po2);
			
			po3 = packOrderData03.getText();
			System.out.println("po3 = "+po3);
			packOrderArray.add(po3);
			
			po4 = packOrderData04.getText();
			System.out.println("po4 = "+po4);
			packOrderArray.add(po4);
			
			po5 = packOrderData05.getText();
			System.out.println("po5 = "+po5);
			packOrderArray.add(po5);
			
			po6 = packOrderData06.getText();
			System.out.println("po6 = "+po6);
			packOrderArray.add(po6);
		}
		catch (Exception e) 
		{
			return;
		}
	}
	
	public void getDataFromPackOrderPage2() throws InterruptedException
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
	
	public void processFromPackOrdersPage() throws InterruptedException 
	{
		try
		{
			//select pack orders check box one by one
			System.out.println("********** selecting orders ono by one in pack orders page **********");
		
			
			packOrderCheckbox01.click();		
			
			packOrderCheckbox02.click();
			
			packOrderCheckbox03.click();
			
			packOrderCheckbox04.click();
			
			packOrderCheckbox05.click();
			
			packOrderCheckbox06.click();	
			
		}
		
		catch (Exception e) 
		{
			//Wait for 2 seconds
			Thread.sleep(2000);
			
			//click on create label button
			readyToDispatchButton.click();
			
			//click on download and print button
			yesButton.click();
			
			System.out.println("Order is packed and ready to dispatch");
			
			//Wait for 10 seconds
			Thread.sleep(5000);
		}
	}
	
	public void openHandoverOrdersPage() throws InterruptedException
	{
		//open hand over orders page
		handovreOrdersPageButton.click();
		
		//click on show orders button
		showOrdersButton.click();
		
		//Wait for 5 seconds
		Thread.sleep(5000);
		
		//click on download manifest button 
		downloadManifestButton.click();
		
		//verify hand over order page is displayed or not
		//boolean status3 = packOrdersPage.isDisplayed();
		//System.out.println("Pack orders page is displayed == "+status3);
	}
	
	public void getDataFromHandoverOrderPage1() throws InterruptedException
	{
		try
		{
			//copy hand over orders name to the variables
			System.out.println("********** copying orders name ono by one in hand over orders page **********");	
			
			//Wait for 2 seconds
			Thread.sleep(2000);
			
			ho1 = handoverOrderData01.getText();
			System.out.println("ho1 = "+ho1);
			
			ho2 = handoverOrderData02.getText();
			System.out.println("ho2 = "+ho2);
			
			ho3 = handoverOrderData03.getText();
			System.out.println("ho3 = "+ho3);
			
			ho4 = handoverOrderData04.getText();
			System.out.println("ho4 = "+ho4);
			
			ho5 = handoverOrderData05.getText();
			System.out.println("ho5 = "+ho5);
			
			ho6 = handoverOrderData06.getText();
			System.out.println("ho6 = "+ho6);
		}
		catch (Exception e) 
		{
			return;
		}
	}
	public void getDataFromHandoverOrderPage2() throws InterruptedException
	{
		try
		{
			//copy hand over orders name to the array list
			System.out.println("********** copying orders name ono by one in hand over orders page **********");
			
			handoverOrderArray.add(handoverOrderData01.getText());
			
			handoverOrderArray.add(handoverOrderData02.getText());
			
			handoverOrderArray.add(handoverOrderData03.getText());
			
			handoverOrderArray.add(handoverOrderData04.getText());
			
			handoverOrderArray.add(handoverOrderData05.getText());
			
			handoverOrderArray.add(handoverOrderData06.getText());
		}
		catch (Exception e) 
		{
			//print hand over orders names one by one
			int i=0, k=01;
			for (i=0; i<handoverOrderArray.size(); i++)
			{
				System.out.println("Handover order "+k+" => "+handoverOrderArray.get(i));
				k++;
			}
		}
	}
	
	public void verifyData1() throws InterruptedException
	{
		try
		{
			System.out.println("Webdriver entered into Try block");
			
			boolean vo1=po1.equals(ho1);
			System.out.println(po1+" = "+ho1+" == "+vo1);
			
			boolean vo2=po2.equals(ho2);
			System.out.println(po2+" = "+ho2+" == "+vo2);
			
			boolean vo3=po3.equals(ho3);
			System.out.println(po3+" = "+ho3+" == "+vo3);
			
			boolean vo4=po4.equals(ho4);
			System.out.println(po4+" = "+ho4+" == "+vo4);
			
			boolean vo5=po5.equals(ho5);
			System.out.println(po5+" = "+ho5+" == "+vo5);
			
			boolean vo6=po6.equals(ho6);
			System.out.println(po6+" = "+ho6+" == "+vo6);
			
			
			
		}
		catch (Exception e) 
		{
			System.out.println("Webdriver came out of Try block");
		}
	}
	
	public void verifyData2() throws InterruptedException
	{
		//here i'm using while loop to make packOrderArray array list size and handoverOrderArray array list size equal. 
		//Otherwise if packOrderArray array list size and handoverOrderArray array list size is not equal it will through java.lang.IndexOutOfBoundsException.
		
		while(packOrderArray.size()>handoverOrderArray.size()) 
		{
			handoverOrderArray.add("null");
		}
		
		while(packOrderArray.size()<handoverOrderArray.size())
		{
			packOrderArray.add("null");
		}
		
		for (int i=0; i<handoverOrderArray.size(); i++)
		{
			if (handoverOrderArray.contains(packOrderArray.get(i)))
			{
				System.out.println("order => "+packOrderArray.get(i)+"is verified successfully");
			}
			else 
			{
				System.out.println("order => "+packOrderArray.get(i)+"is not verified successfully");
			}
		}	
	}
	
	public void verifyData3() throws InterruptedException
	{
		
		try
		{
			System.out.println("Webdriver entered into Try block");
			
			for (int i=0; i<handoverOrderArray.size(); i++)
			{
				if (handoverOrderArray.contains(packOrderArray.get(i)))
				{
					System.out.println("order => "+packOrderArray.get(i)+"is verified successfully");
				}
				else 
				{
					System.out.println("order => "+packOrderArray.get(i)+"is not verified successfully");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Webdriver came out of Try block");
		}
		
		
			
	}
}
