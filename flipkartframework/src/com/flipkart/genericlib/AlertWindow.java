package com.flipkart.genericlib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertWindow 
{
	public static void handleAlertWindow(WebDriver driver)
	{
		//pass driver control to alert window
		Alert alt = driver.switchTo().alert();
		
		//capturing alert message from alert window
		String actual_msg = alt.getText();
		
		//click on "OK" button in alert window
		alt.accept();
		
		//click on "cancel" button in alert window
		//alt.dismiss();
		
		//store expected alert message in the variable
		String expected_msg = "Please select start place.";
		
		//verifying actual alert message with expected alert message
		Assert.assertEquals(actual_msg, expected_msg);
		
		//print alert message is verified successfully
		System.out.println("Alert message is verified successfully");
			
	}
}
