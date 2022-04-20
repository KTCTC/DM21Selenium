package navigation.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.navigate().to("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//*[@class='menu-list']//span[contains(text(),'Check Box')]")).click();
		driver.findElement(By.xpath("//*[@class='menu-list']//span[contains(text(),'Radio Button')]")).click();
		
		
		driver.navigate().back();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		driver.navigate().refresh();
		
		Navigation aa = driver.navigate();
		
		aa.back();
	
		

	}

}
