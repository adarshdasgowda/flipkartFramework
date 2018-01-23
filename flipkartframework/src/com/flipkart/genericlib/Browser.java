package com.flipkart.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.flipkart.genericlib.Constants;

public class Browser 
{
	public static WebDriver driver;
	public static WebDriver getBrowser()
	{	
		//chose the browser
		if(Constants.browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\softwares\\selenium webdriver drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (Constants.browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\softwares\\selenium webdriver drivers\\chromedriver-V2.33.exe");
			driver = new ChromeDriver();
		}
		else if (Constants.browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\softwares\\selenium webdriver drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		//Maximize browser window
		driver.manage().window().maximize();
				
		return driver;		
	}

}
