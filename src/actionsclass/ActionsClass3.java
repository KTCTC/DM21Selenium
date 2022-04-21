package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act = new Actions(driver);	
		
		WebElement sourceEle = driver.findElement(By.xpath("//a[starts-with(text(),' 5000')]"));
		WebElement destinationEle = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		
		act.dragAndDrop(sourceEle, destinationEle).build().perform();
		
		WebElement sourceEle1 = driver.findElement(By.xpath("//a[starts-with(text(),' SALES ')]"));
		WebElement destinationEle1 = driver.findElement(By.xpath("//*[@id='loan']/li"));
		
		act.clickAndHold(sourceEle1).moveToElement(destinationEle1).release().build().perform();
		
		
		
		
	}

}
