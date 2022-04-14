package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		WebElement emailTextbox = chDriver.findElement(By.id("email"));
		
		emailTextbox.sendKeys("KTCTC email id");
		
		emailTextbox.clear();
		
		

	}

}
