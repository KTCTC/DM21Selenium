package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.get("https://demoqa.com/buttons");
		
		Actions act = new Actions(driver);
		
		WebElement clickButton = driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		
		//act.click(clickButton).build().perform();
		
		act.moveToElement(clickButton).click().build().perform();
		
		//act.moveToElement(driver.findElement(By.id("doubleClickBtn"))).doubleClick().build().perform();
		
		act.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		
		act.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().build().perform();
		
		//act.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
		
	}

}
