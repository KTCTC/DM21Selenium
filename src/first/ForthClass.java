package first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForthClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		
		chDriver.findElement(By.linkText("Facebook Lite")).click();
		
		chDriver.findElement(By.partialLinkText("Voting Information")).click();
		
		
		
		

	}

}
