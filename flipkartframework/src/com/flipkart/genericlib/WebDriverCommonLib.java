package com.flipkart.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.genericlib.Browser;

public class WebDriverCommonLib 
{
	//implicitly wait statement
	public void waitForPageToLoad()
	{
		Browser.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	//explicitly wait statement
	public void waitForElementPresent(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(Browser.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


}
