package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport 
{

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	

	@Test
	public void alert()
	{
		report = new ExtentReports(".\\Reports\\extentReport.html");
		
		logger = report.startTest("Test");
		
		System.setProperty("webdriver.chrome.driver","E:\\\\softwares\\\\selenium webdriver drivers\\\\chromedriver-V2.33.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		logger.log(LogStatus.INFO, "Browser started");
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		
		com.flipkart.genericlib.AlertWindow.handleAlertWindow(driver);
			
	}
	
	@AfterMethod
	public void failedTCScreenshot(ITestResult result)
	{	
		com.flipkart.genericlib.TimeStamp.getTimeStamp();
		driver.close();
		
		report.endTest(logger);
		report.flush();
		
		driver.get(".\\Reports\\extentReport.html");
	}

}
