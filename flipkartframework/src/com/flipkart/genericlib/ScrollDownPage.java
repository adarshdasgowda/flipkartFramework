package com.flipkart.genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollDownPage 
{
	
	public static void scrollDownOfPage(WebDriver driver)
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//scroll down page by 2500 pixels
		jse.executeScript("scrollBy(0,2500)"); 
	}
	
	
	public static void scrollUpOfPage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll up page by 2500 pixels
		js.executeScript("scrollBy(0,-300)");
	}
	
	public static void scrollRightOfPage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll right page by 700 pixels
		js.executeScript("scrollBy(-700,0)");
	}
	
	public static void scrollLeftOfPage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll left page by 700 pixels
		js.executeScript("scrollBy(700,0)");
	}
	
	public static void scrollToElementOfPage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//identify the web element until where it scroll page
		WebElement element = driver.findElement(By.partialLinkText("Creative Commons Attribution-ShareAlike License"));
		
		//scroll to element of page 
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//click on element
		element.click();
	}

}

//Note
//1. In the scroll page method it takes two arguments ("scrollBy(0,0)"); 1st argument for horizontal scroll and the 2nd argument for vertical scroll.
//2. If the argument is +ve it'll scroll down of the page or right side of the page.
//3. If the argument is -ve it'll scroll up of the page or left side of the page. 
//4. If the argument is 300 it'll scroll by 300 pixels and if it is 500 it'll scroll by 500 pixels.
