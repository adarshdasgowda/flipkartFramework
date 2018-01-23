package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload 
{
	@Test
	public void fileUpload() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\selenium webdriver drivers\\chromedriver-V2.33.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("C:\\Users\\DAS\\Desktop\\Fileupload.html");
		
		driver.findElement(By.name("resumeupload")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\DAS\\Desktop\\FileUpload.exe");
		
		System.out.println("File uploaded");
	}
	
}
