package com.flipkart.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dummyGmail
{
	@Test
	public void verifyGooglePage1()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("adarshakashrdfgh");
		
		driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
		
		
		//driver.findElement(By.id("passWord")).sendKeys("dasuraksha4eye");
		
		//driver.findElement(By.id("//div[@id='passwordNext']/content/span/..")).click();
		
		
		
		//get the google page title
		String actualTitle = driver.findElement(By.xpath("//div[contains(text(),'find your Google Account')]")).getText();
		
		System.out.println(actualTitle);
		
		//expected page title
		String expectedTitle = "Couldn't find your Google Accoun";
		
		//verify both actual title and expected title using assertion
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//if the above condition becomes true (actual title = expected title) then only below condition will execute
		System.out.println("Google page title is verified");
	}


}
