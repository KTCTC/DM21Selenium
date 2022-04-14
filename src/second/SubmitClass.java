package second;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		chDriver.findElement(By.id("email")).sendKeys("KTCCTCTCTC");
		chDriver.findElement(By.name("pass")).sendKeys("KBDDJHSUYVD");
		
		chDriver.findElement(By.name("login")).submit();
	}

}
