package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.get("https://www.facebook.com/");		
		Actions act = new Actions(driver);	
		WebElement emailText = driver.findElement(By.id("email"));
		
		act.click(emailText).keyDown(Keys.SHIFT).sendKeys("welcome to ktctc").keyUp(Keys.SHIFT).build().perform();
		
		act.moveToElement(driver.findElement(By.name("login"))).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
	}

}
