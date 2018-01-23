package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadFileInFirefox 
{
	@Test
	public void handleDownloadPopup()
	{
		com.flipkart.genericlib.FileDownloadPopup.handleFileDownloadPopupInFirfox();
		
		System.setProperty("webdriver.gecko.driver", "E:\\softwares\\selenium webdriver drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumhq.org/download/");
		
		driver.findElement(By.linkText("32 bit Windows IE")).click();
	}

}
