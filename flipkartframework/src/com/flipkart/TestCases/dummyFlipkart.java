package com.flipkart.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dummyFlipkart 
{
	@Test
	public void verifyFlipkartPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://seller.flipkart.com/");
		
		driver.findElement(By.id("username")).sendKeys("foureyestechnologies@gmail.com");
		
		driver.findElement(By.id("userpass")).sendKeys("dasuraksha4eye");
		
		driver.findElement(By.id("edit-submit")).click();
		
		
		
		//get the google page title
		String actualTitle = driver.findElement(By.xpath("//div[contains(text(),'password do not match')]")).getText();
		
		System.out.println(actualTitle);
		
		//expected page title
		String expectedTitle = "Username and password do not match";
		
		//verify both actual title and expected title using assertion
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//if the above condition becomes true (actual title = expected title) then only below condition will execute
		System.out.println("Google page title is verified");
	}


}
