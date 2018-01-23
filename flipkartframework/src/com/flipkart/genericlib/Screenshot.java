package com.flipkart.genericlib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	
	//take screenshot when this method call every time
	public static void takeScreenshot(WebDriver driver, String screenshotName)
	{		
		try 
		{
			TakesScreenshot tss=((TakesScreenshot)driver);
			File Source = tss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("./Screenshot/"+screenshotName+".png"));
			System.out.println("Screenshot taken");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception while taking screenshot "+e.getMessage());
		} 		
	}
	
}
