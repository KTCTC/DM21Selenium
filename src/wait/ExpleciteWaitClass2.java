package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpleciteWaitClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver chDriver = new ChromeDriver();
		chDriver.manage().window().maximize();
		chDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		chDriver.get("https://www.facebook.com/");		 
		
		chDriver.findElement(By.id("email")).sendKeys("KTCCTCTCTC");	
		
		
		chDriver.findElement(By.name("pass")).sendKeys("KBDDJHSUYVD");
		
		
		
		chDriver.findElement(By.name("login")).click();
		System.out.println("Wait is started");
		WebDriverWait wt = new WebDriverWait(chDriver, 10);	
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("egegegr")));
			
		
System.out.println("Wait is finished");
		
//chDriver.close();

	}

}
