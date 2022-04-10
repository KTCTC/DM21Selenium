package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		
		
		/*
		 * By em = By.id("email");
		 * 
		 * WebElement emailId = chDriver.findElement(em);
		 * 
		 * emailId.sendKeys("KTCTC");
		 */
		 
		
		chDriver.findElement(By.id("email")).sendKeys("KTCCTCTCTC");
		
		
		/*
		 * By ps = By.name("pass");
		 * 
		 * WebElement passWord = chDriver.findElement(ps);
		 * passWord.sendKeys("KT123456789");
		 */	
		
		chDriver.findElement(By.name("pass")).sendKeys("KBDDJHSUYVD");
		
		/*
		 * By lg = By.name("login");
		 * 
		 * WebElement loginButton = chDriver.findElement(lg);
		 * 
		 * loginButton.click();
		 */
		
		chDriver.findElement(By.name("login")).click();
		
		
	}

}
