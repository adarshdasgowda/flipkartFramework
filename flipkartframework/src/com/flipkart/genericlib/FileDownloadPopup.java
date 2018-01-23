package com.flipkart.genericlib;

import java.util.HashMap;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownloadPopup 
{
	public static void handleFileDownloadPopupInFirfox()
	{
		FirefoxProfile profile = new FirefoxProfile();
		
		//set preference to download and save on Desktop
		profile.setPreference("browser.download.folderList", 0);
		
		//set preference to download and save on Downloads folder
		//profile.setPreference("browser.download.folderList", 1);
		
		//set preference to download and save on Specified local disk
		//profile.setPreference("browser.download.folderList", 2);
		//profile.setPreference("browser.download.dir", "./Downloads");
		
	}
	
	public static void handleFileDownloadPopupInChromeBrowser()
	{
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
   		
		
	}

}
