package Others;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void handleDownloadPopup() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\selenium webdriver drivers\\chromedriver-V2.33.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://seller.flipkart.com/");
		
		driver.findElement(By.id("username")).sendKeys("foureyestechnologies@gmail.com");
		
		driver.findElement(By.id("userpass")).sendKeys("dasuraksha4eyes");
		
		driver.findElement(By.id("edit-submit")).click();
		
		driver.findElement(By.xpath("//a[text()='Listings']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		
		System.out.println("frame sixe = "+iframeElements.size());
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='iframe-loader']"));
		
		driver.switchTo().frame(frame);
		
		boolean b  = driver.findElement(By.xpath(".//*[@id='listings']/div/div/div/div[1]/div[1]/h3")).isDisplayed();
		System.out.println(b);
	}

}
