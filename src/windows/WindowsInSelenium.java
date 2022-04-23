package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://demoqa.com/browser-windows");
		
		String defaultWindow = driver.getWindowHandle();// 45
		System.out.println(defaultWindow);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles(); // 23, 45
		
	
		
		for (String each:allWindowHandles)
		{
			if (!each.equals(defaultWindow))
			{
				driver.switchTo().window(each);
			}
			
		}
		
		String str = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(str);
		
	//	driver.close();
		
		driver.switchTo().window(defaultWindow);
		
	//	driver.close();
		
		driver.quit();
		
		
		
		
	}

}
