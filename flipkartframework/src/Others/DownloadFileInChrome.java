package Others;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DownloadFileInChrome 
{
	@Test
	 public void download() 
	 {
			
			System.setProperty("webdriver.chrome.driver","E:\\softwares\\selenium webdriver drivers\\chromedriver-V2.33.exe");
			String downloadFilepath = "c:\\download";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
	       	chromePrefs.put("download.default_directory", downloadFilepath);	
	   		ChromeOptions options = new ChromeOptions();
	   		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
	   		options.setExperimentalOption("prefs", chromePrefs);
	   		options.addArguments("--test-type");
	   		options.addArguments("--disable-extensions"); //to disable browser extension popup
	   		DesiredCapabilities cap = DesiredCapabilities.chrome();
	       	cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
	       	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	   		cap.setCapability(ChromeOptions.CAPABILITY, options);
			WebDriver driver = new ChromeDriver(cap); 
       		driver.manage().window().maximize();
       		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://www.seleniumhq.org/download/");
			driver.findElement(By.linkText("32 bit Windows IE")).click();
	 }

}
