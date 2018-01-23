package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert 
{
	@Test
	public void alert() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\selenium webdriver drivers\\chromedriver-V2.33.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(2000);
		
		com.flipkart.genericlib.AlertWindow.handleAlertWindow(driver);
		
		com.flipkart.genericlib.TimeStamp.getTimeStamp();
		
		driver.quit();
			
	}
}
