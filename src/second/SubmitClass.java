package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class SubmitClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver chDriver = new ChromeDriver();
		chDriver.manage().window().maximize();		
		chDriver.get("https://www.facebook.com/");
		chDriver.findElement(By.id("email")).sendKeys("KTCCTCTCTC");
		chDriver.findElement(By.name("pass")).sendKeys("KBDDJHSUYVD");
		
		chDriver.findElement(By.name("login")).submit();
	}

}
