package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReturnsModule 
{
	//returns module button
	@FindBy(xpath="//a[text()='Returns']")
	@CacheLookup
	private WebElement returns_Module;
	
	//returns page
	@FindBy(xpath="//h3[text()='Returns']")
	@CacheLookup
	private WebElement returns_Page;
	
	//approved returns button
	@FindBy(xpath="//div[@id='blinx-wrapper-34']/ul/li[1]/span")
	@CacheLookup
	private WebElement approved_Button;
	
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[1]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder1;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[2]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder2;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[3]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder3;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[4]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder4;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[5]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder5;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[6]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder6;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[7]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder7;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[8]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder8;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[9]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder9;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[10]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement approvedReturnOrder10;
	
	//intransit returns button
	@FindBy(xpath="//div[@id='blinx-wrapper-34']/ul/li[2]/span")
	@CacheLookup
	private WebElement intransit_Button;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[1]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder1;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[2]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder2;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[3]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder3;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[4]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder4;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[5]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder5;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[6]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder6;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[7]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder7;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[8]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder8;
	
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[9]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder9;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[10]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement intransitReturnOrder10;
	
	//returns completed button
	@FindBy(xpath="//div[@id='blinx-wrapper-34']/ul/li[3]/span")
	@CacheLookup
	private WebElement complete_Button;
	
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[1]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted1;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[2]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted2;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[3]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted3;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[4]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted4;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[5]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted5;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[6]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted6;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[7]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted7;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[8]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted8;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[9]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted9;
		
		@FindBy(xpath="//div[@class='col-md-10 return-list']/div/div/div[2]/div/div/ul/li[10]/div/article/header/div/h4/div/a")
		@CacheLookup
		private WebElement returnOrderCompleted10;
		
		
	
	
	public void checkReturnOrdersPage()
	{
		//go to returns module
		returns_Module.click();
		
		//verify active orders page is displayed or not
		boolean status = returns_Page.isDisplayed();
		System.out.println("Returns page is displayed == "+status);	
	}
	
	public void approvedReturnOrdersInfo()
	{
		//go to approved return orders page
		approved_Button.click();
		
		try
		{
			System.out.println("********** approved return order status is as bellow **********");
			
			//get information of approved return orders
			String aro1 = approvedReturnOrder1.getText();
			System.out.println("approved return order 01 is :"+aro1);
			
			String aro2 = approvedReturnOrder2.getText();
			System.out.println("approved return order 02 is :"+aro2);
			
			String aro3 = approvedReturnOrder3.getText();
			System.out.println("approved return order 03 is :"+aro3);
			
			String aro4 = approvedReturnOrder4.getText();
			System.out.println("approved return order 04 is :"+aro4);
			
			String aro5 = approvedReturnOrder5.getText();
			System.out.println("approved return order 05 is :"+aro5);
			
			String aro6 = approvedReturnOrder6.getText();
			System.out.println("approved return order 06 is :"+aro6);
			
			String aro7 = approvedReturnOrder7.getText();
			System.out.println("approved return order 07 is :"+aro7);
			
			String aro8 = approvedReturnOrder8.getText();
			System.out.println("approved return order 08 is :"+aro8);
			
			String aro9 = approvedReturnOrder9.getText();
			System.out.println("approved return order 09 is :"+aro9);
			
			String aro10 = approvedReturnOrder10.getText();
			System.out.println("approved return order 10 is :"+aro10);
		}
		
		catch (Exception e) 
		{
			System.out.println(" ");
			return;
		}
	}
	
	public void intransitReturnOrdersInfo()
	{
		//go to intransit return order page
		intransit_Button.click();
		
		try
		{
			System.out.println("********** intransit return order status is as bellow **********");
			
			//get information of intransit return orders
			String ito1 = intransitReturnOrder1.getText();
			System.out.println("Intransit return order 01 is :"+ito1);
			
			String ito2 = intransitReturnOrder2.getText();
			System.out.println("Intransit return order 02 is :"+ito2);
			
			String ito3 = intransitReturnOrder3.getText();
			System.out.println("Intransit return order 03 is :"+ito3);
			
			String ito4 = intransitReturnOrder4.getText();
			System.out.println("Intransit return order 04 is :"+ito4);	
			
			String ito5 = intransitReturnOrder5.getText();
			System.out.println("Intransit return order 05 is :"+ito5);
			
			String ito6 = intransitReturnOrder6.getText();
			System.out.println("Intransit return order 06 is :"+ito6);
			
			String ito7 = intransitReturnOrder7.getText();
			System.out.println("Intransit return order 07 is :"+ito7);
			
			String ito8 = intransitReturnOrder8.getText();
			System.out.println("Intransit return order 08 is :"+ito8);
			
			String ito9 = intransitReturnOrder9.getText();
			System.out.println("Intransit return order 09 is :"+ito9);
			
			String ito10 = intransitReturnOrder10.getText();
			System.out.println("Intransit return order 10 is :"+ito10);
		}
		
		catch (Exception e) 
		{
			System.out.println(" ");
			return;
		}
	}
	
	public void returnOrdersCompletedInfo()
	{
		//go to return orders completed page
		complete_Button.click();
		
		try
		{
			System.out.println("********** return order completed status is as bellow **********");
		
			//get information of return orders completed
			String roc1 = returnOrderCompleted1.getText();
			System.out.println("return order completed 01 is :"+roc1);
			
			String roc2 = returnOrderCompleted2.getText();
			System.out.println("return order completed 02 is :"+roc2);
			
			String roc3 = returnOrderCompleted3.getText();
			System.out.println("return order completed 03 is :"+roc3);
			
			String roc4 = returnOrderCompleted4.getText();
			System.out.println("return order completed 04 is :"+roc4);
			
			String roc5 = returnOrderCompleted5.getText();
			System.out.println("return order completed 05 is :"+roc5);
			
			String roc6 = returnOrderCompleted6.getText();
			System.out.println("return order completed 06 is :"+roc6);
			
			String roc7 = returnOrderCompleted7.getText();
			System.out.println("return order completed 07 is :"+roc7);
			
			String roc8 = returnOrderCompleted8.getText();
			System.out.println("return order completed 08 is :"+roc8);
			
			String roc9 = returnOrderCompleted9.getText();
			System.out.println("return order completed 09 is :"+roc9);
			
			String roc10 = returnOrderCompleted10.getText();
			System.out.println("return order completed 10 is :"+roc10);
			
			System.out.println(" ");
		}
		
		catch (Exception e) 
		{
			System.out.println(" ");
			return;
		}
	}

}
