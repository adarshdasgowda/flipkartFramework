package com.flipkart.pageobjectrepositorylib;



import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ArrayListDemo
{
	//get first new order data
	@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/div/div[2]/div/div[2]/div[1]")
	@CacheLookup
	public static WebElement newOrderData01;
	
	//get second new order data
	@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/div/div[2]/div/div[2]/div[1]")
	@CacheLookup
	public static WebElement newOrderData02;
	
	//get third new order data
	@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[3]/div/div[2]/div/div[2]/div[1]")
	@CacheLookup
	public static WebElement newOrderData03;
	
	//get fourth new order data
	@FindBy(xpath="//div[@class='col-md-10 remove-padding card-gutter-left']/div/div/div/div/div/div/div[2]/div/div/ul/li[4]/div/div[2]/div/div[2]/div[1]")
	@CacheLookup
	public static WebElement newOrderData04;
		
		public void arraylt()
		{
			ArrayList<WebElement> list = new ArrayList<WebElement>();
			list.add(newOrderData01);
		    
		}
		

}
