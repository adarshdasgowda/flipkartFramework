package com.flipkart.pageobjectrepositorylib;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ListingsModule 
{
	//listings module button
	@FindBy(xpath="//a[text()='Listings']")
	@CacheLookup
	private WebElement listings_Module;
	
	//frame handling
	@FindBy(xpath="//iframe[@class='iframe-loader']")
	@CacheLookup
	private WebElement frame;
	
	
	//my listings page
	@FindBy(xpath=".//*[@id='listings']/div/div/div/div[1]/div[1]/h3")
	@CacheLookup
	private WebElement my_Listings_Page;
	
	//active listings check box
	@FindBy(xpath="//div[@id='refiners']/div[2]/div/label[1]")
	@CacheLookup
	private WebElement activeListingsCB;
	
	//inactive listings check box
	@FindBy(xpath="//div[@id='refiners']/div[2]/div/label[2]")
	@CacheLookup
	private WebElement inactiveListingsCB;
	
	//blocked listings check box
	@FindBy(xpath="//div[@id='refiners']/div[2]/div/label[3]")
	@CacheLookup
	private WebElement blockedListingsCB;
	
	//ready to activate listings check box
	@FindBy(xpath="//div[@id='refiners']/div[2]/div/label[4]")
	@CacheLookup
	private WebElement readyListingsCB;
	
	//less than 5 stock level listings check box
	@FindBy(xpath="//label[contains(text(),'Less than 5')]")
	@CacheLookup
	private WebElement lessThan5CB;
	
	//out of stock level listings check box
	@FindBy(xpath="//div[@id='refiners']/div[3]/div/label[2]")
	@CacheLookup
	private WebElement outOfStockCB;
	
	//more than 5 stock level listings check box
	@FindBy(xpath="//div[@id='refiners']/div[3]/div/label[3]")
	@CacheLookup
	private WebElement moreThan5CB;
	
	//rows Per Page drop down
	@FindBy(xpath="//button[@class='dropdown-toggle btn']")
	@CacheLookup
	private WebElement rowsPerPageDropDown;
	
	//select 100 rows per page
	@FindBy(xpath="//ul[@class='dropdown-menu']/li[4]/a")
	@CacheLookup
	private WebElement rowsPerPage100;
	
	//next page button
	@FindBy(xpath="//div[@id='live']/div[6]/div[2]/button[2]")
	@CacheLookup
	private WebElement nextPageButton;
	
	//previous page button
	@FindBy(xpath="//div[@id='live']/div[6]/div[2]/button[1]")
	@CacheLookup
	private WebElement previousPageButton;
	
	//1st SKU in the listing page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[2]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU1;
	
	//2nd SKU in the list page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[3]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU2;
	
	//3rd SKU in the listing page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[4]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU3;
	
	//4th SKU in the list page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[5]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU4;
	
	//5th SKU in the listing page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[6]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU5;
	
	//6th SKU in the list page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[7]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU6;
	
	//7th SKU in the listing page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[8]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU7;
	
	//8th SKU in the list page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[9]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU8;
	
	//9th SKU in the listing page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[10]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU9;
	
	//10th SKU in the list page
	@FindBy(xpath="//div[@id='listOfListings']/table/tbody/tr[11]/td[2]/product-details/div/div/div[2]/div/span/span")
	@CacheLookup
	private WebElement listSKU10;
	
	static String SKU1, SKU2, SKU3, SKU4, SKU5, SKU6, SKU7, SKU8, SKU9, SKU10;
	
	ArrayList<String> actualListingsArray = new ArrayList<String>();
	ArrayList<String> expectedListingsArray = new ArrayList<String>();
	
	public void myListingsPage(WebDriver driver) throws InterruptedException 
	{
		//open listings module
		listings_Module.click();
		Thread.sleep(10000);
		
		
		driver.switchTo().frame(frame);
		System.out.println("Driver control is passed to the frame window");
		
		//verify my listings page is displayed or not
		boolean status = my_Listings_Page.isDisplayed();
		System.out.println("Active orders page is displayed == "+status);
		
		Thread.sleep(2000);
		
		//open active listings page
		lessThan5CB.click();
		
		Thread.sleep(5000);
	}
	
	public void getActualSKUData() throws InterruptedException 
	{
		try
		{
			System.out.println("Webdriver entered into Try block");
			
			actualListingsArray.add(listSKU1.getText());
			
			actualListingsArray.add(listSKU2.getText());
			
			actualListingsArray.add(listSKU3.getText());
			
			actualListingsArray.add(listSKU4.getText());
			
			actualListingsArray.add(listSKU5.getText());
			
			actualListingsArray.add(listSKU6.getText());
			
			actualListingsArray.add(listSKU7.getText());
			
			actualListingsArray.add(listSKU8.getText());
			
			actualListingsArray.add(listSKU9.getText());
			
			actualListingsArray.add(listSKU10.getText());
			
		}
		
		catch (Exception e)
		{
			return;
		}
		
		finally 
		{
			int k=1;
			for (int i=0; i<actualListingsArray.size(); i++)
			{
				System.out.println("Actual listing SKU "+k+" is => "+actualListingsArray.get(i));
				k++;
			}
			
			System.out.println("Webdriver came out of finally block");
		}			
	}
	
	public void repeatGetActualSKUData(WebDriver driver) throws InterruptedException
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			WebElement element = nextPageButton;
			
			js.executeScript("nextPageButton", element);
			
			Thread.sleep(2000);
			
			boolean nextPageButtonStatus = nextPageButton.isEnabled();
			
			System.out.println("Listings next page button is enable");
			
			nextPageButton.click();
			
			System.out.println("Listings next page is opened");
			
			if (nextPageButtonStatus==true)
			{
				getActualSKUData();
			}
		}
		
		catch (Exception e) 
		{
			System.out.println("Listings next page button is not enable");
		}
		finally
		{
			System.out.println("Listings next page button is not enable2");
		}
		
	}
	
	public void getExpectedSKUData() throws InterruptedException 
	{
		expectedListingsArray.add("cpu power cable");
		
		expectedListingsArray.add("SanDisk 8gb class 4 memory card micro");
		
		expectedListingsArray.add("SanDisk 8gb memory");
		
		expectedListingsArray.add(" Monitor wall mount 4");
		
		for (int i=0; i<expectedListingsArray.size(); i++)
		{
			System.out.println("Expected listing SKU is => "+expectedListingsArray.get(i));
		}
	}
	
	public void verifyListings() throws InterruptedException 
	{
		try
		{
			for(int i=0; i<=actualListingsArray.size()-1; i++)
			{
				if(actualListingsArray.contains(expectedListingsArray.get(i)))
				{
					System.out.println("Expected listing is present in the listings page => "+expectedListingsArray.get(i));
				}
				else
				{
					System.out.println("Expected listing is not present in the listings page => "+expectedListingsArray.get(i));
				}
			}
		}
		
		catch (Exception e)
		{
			return;
		}
		finally 
		{
			System.out.println("Verification of listings is done");
		}
	}

	public void mainFrame(WebDriver driver) throws InterruptedException 
	{
		//pass driver control back to main window
		driver.switchTo().defaultContent();
		System.out.println("Driver control is passed back to main window");
	}

	
	

	

}
