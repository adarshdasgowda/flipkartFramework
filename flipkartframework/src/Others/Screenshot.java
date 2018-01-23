package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class Screenshot
{	
	WebDriver driver;
	@Test
	public void takeScreenshot() 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\\\softwares\\\\selenium webdriver drivers\\\\chromedriver-V2.33.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='emaila']")).sendKeys("Hello");
		
	}
	
	@AfterMethod
	public void failedTCScreenshot(ITestResult result)
	{	
		if (ITestResult.FAILURE==result.getStatus())
		{	
			com.flipkart.genericlib.Screenshot.takeScreenshot(driver, result.getName());
		}
		
		//com.flipkart.genericlib.TimeStamp.getTimeStamp();
		
		driver.quit();
	}
}
