package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpleciteWaitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver chDriver = new ChromeDriver();
		chDriver.manage().window().maximize();
		chDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		chDriver.get("https://www.facebook.com/");		 
		
		chDriver.findElement(By.id("email")).sendKeys("KTCCTCTCTC");	
		
		
		chDriver.findElement(By.name("pass")).sendKeys("KBDDJHSUYVD");
		
		WebElement btn = chDriver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
		
		chDriver.findElement(By.name("login")).click();
		System.out.println("Wait is started");
		WebDriverWait wt = new WebDriverWait(chDriver, 15);
		
		wt.until(ExpectedConditions.invisibilityOf(chDriver.findElement(By.name("login"))));
System.out.println("Wait is finished");
		
//chDriver.close();

	}

}
