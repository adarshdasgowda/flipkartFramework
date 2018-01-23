package com.flipkart.pageobjectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.flipkart.genericlib.Browser;

public class PaymentsModule extends Browser
{
	//payments module button
	@FindBy(xpath="//a[text()='Payments']")
	@CacheLookup
	private WebElement payments_Module_Options;
	
	//statements Options button 
	@FindBy(xpath="//a[text()='Statements']")
	@CacheLookup
	private WebElement statementsOptions;
	
	//statements page 
	@FindBy(xpath="//h3[contains(text(),'Statements')]")
	@CacheLookup
	private WebElement statementsPage;
	
	//view Settlements Link
	@FindBy(xpath="//a[contains(text(),'View Settlements')]") //partialLinkText="View Settlements
	@CacheLookup
	private WebElement viewSettlementsLink;
	
	//get 1 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][1]/td[1]")
	@CacheLookup
	private WebElement paymentDateA;
	
	//get 1 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][1]/td[2]")
	@CacheLookup
	private WebElement bankAccountA;
	
	//get 1 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][1]/td[3]")
	@CacheLookup
	private WebElement neftIDA;
	
	//get 1 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][1]/td[5]")
	@CacheLookup
	private WebElement paymentAmountA;
	
	//get 2 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][2]/td[1]")
	@CacheLookup
	private WebElement paymentDateB;
	
	//get 2 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][2]/td[2]")
	@CacheLookup
	private WebElement bankAccountB;
	
	//get 2 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][2]/td[3]")
	@CacheLookup
	private WebElement neftIDB;
	
	//get 2 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][2]/td[5]")
	@CacheLookup
	private WebElement paymentAmountB;
		
	//get 3 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][3]/td[1]")
	@CacheLookup
	private WebElement paymentDateC;
	
	//get 3 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][3]/td[2]")
	@CacheLookup
	private WebElement bankAccountC;
	
	//get 3 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][3]/td[3]")
	@CacheLookup
	private WebElement neftIDC;
	
	//get 3 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][3]/td[5]")
	@CacheLookup
	private WebElement paymentAmountC;
		
	//get 4 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][4]/td[1]")
	@CacheLookup
	private WebElement paymentDateD;
	
	//get 4 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][4]/td[2]")
	@CacheLookup
	private WebElement bankAccountD;
	
	//get 4 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][4]/td[3]")
	@CacheLookup
	private WebElement neftIDD;
	
	//get 4 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][4]/td[5]")
	@CacheLookup
	private WebElement paymentAmountD;
		
	//get 5 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][5]/td[1]")
	@CacheLookup
	private WebElement paymentDateE;
	
	//get 5 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][5]/td[2]")
	@CacheLookup
	private WebElement bankAccountE;
	
	//get 5 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][5]/td[3]")
	@CacheLookup
	private WebElement neftIDE;
	
	//get 5 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][5]/td[5]")
	@CacheLookup
	private WebElement paymentAmountE;
		
	//get 6 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][6]/td[1]")
	@CacheLookup
	private WebElement paymentDateF;
	
	//get 6 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][6]/td[2]")
	@CacheLookup
	private WebElement bankAccountF;
	
	//get 6 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][6]/td[3]")
	@CacheLookup
	private WebElement neftIDF;
	
	//get 6 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][6]/td[5]")
	@CacheLookup
	private WebElement paymentAmountF;
		
	//get 7 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][7]/td[1]")
	@CacheLookup
	private WebElement paymentDateG;
	
	//get 7 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][7]/td[2]")
	@CacheLookup
	private WebElement bankAccountG;
	
	//get 7 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][7]/td[3]")
	@CacheLookup
	private WebElement neftIDG;
	
	//get 7 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][7]/td[5]")
	@CacheLookup
	private WebElement paymentAmountG;
		
	//get 8 Payment date
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][8]/td[1]")
	@CacheLookup
	private WebElement paymentDateH;
	
	//get 8 bank account number
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][8]/td[2]")
	@CacheLookup
	private WebElement bankAccountH;
	
	//get 8 NEFT ID
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][8]/td[3]")
	@CacheLookup
	private WebElement neftIDH;
	
	//get 8 Payment amount
	@FindBy(xpath="//tr[@class='cf-list clickable-link'][8]/td[5]")
	@CacheLookup
	private WebElement paymentAmountH;
	
	
	
	public void paymentsInformation() throws InterruptedException 
	{
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		//move mouse cursor on payments module
		act.moveToElement(payments_Module_Options).perform();
		
		//select statements option from the payment module options list
		statementsOptions.click();
		System.out.println("Statements option is selected from Payment module");
		
		//check statements page is displayed or not
		boolean pageStatus = statementsPage.isDisplayed();
		System.out.println("settelment page is displayed == "+pageStatus);
		
		//open settlement details page
		viewSettlementsLink.click();
		System.out.println("settelment details page is opened");
		
		//get the information about settled amount
		String paymentDateAA = paymentDateA.getText();
		String bankAccountAA = bankAccountA.getText();
		String neftIDAA = neftIDA.getText();
		String paymentAmountAA = paymentAmountA.getText();			
		System.out.println("Rs "+paymentAmountAA+" is credited to "+bankAccountAA+ " with "+neftIDAA+" on "+paymentDateAA);
	
	}

}
