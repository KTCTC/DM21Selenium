package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpleciteWaitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver chDriver = new ChromeDriver();
		chDriver.manage().window().maximize();
		chDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		chDriver.get("https://www.facebook.com/");		 
		
		chDriver.findElement(By.id("email")).sendKeys("KTCCTCTCTC");	
		
		
		chDriver.findElement(By.name("pass23")).sendKeys("KBDDJHSUYVD");
		
	
		
		chDriver.findElement(By.name("login")).click();
		
chDriver.close();
	}

}
