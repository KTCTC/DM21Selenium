package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.get("https://demoqa.com/text-box");
		
		Actions act = new Actions(driver);	
		
		//driver.findElement(By.xpath("//*[contains(text(),'Interactions')]")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Book Store Application')]"))).build().perform();
		
		act.click(driver.findElement(By.xpath("//*[contains(text(),'Interactions')]"))).build().perform();
		
		
	}

}
