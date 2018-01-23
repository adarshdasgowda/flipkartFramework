package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown 
{
	@Test
	public void alert() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\selenium webdriver drivers\\chromedriver-V2.33.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://en.wikipedia.org/wiki/English");
		
		com.flipkart.genericlib.ScrollDownPage.scrollDownOfPage(driver);
		
		Thread.sleep(2000);
		
		com.flipkart.genericlib.ScrollDownPage.scrollUpOfPage(driver);
		
		Thread.sleep(2000);
		
		com.flipkart.genericlib.ScrollDownPage.scrollToElementOfPage(driver);
		
		Thread.sleep(2000);
		
		driver.quit();
		
	
	
	}

}
