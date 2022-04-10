package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		
		By em = By.id("email");
		
		WebElement emailId = chDriver.findElement(em);
	
		emailId.sendKeys("KTCTC");
		
		
		By ps = By.name("pass");
		
		WebElement passWord = chDriver.findElement(ps);
		passWord.sendKeys("KT123456789");	
		
		By lg = By.name("login");
		
		WebElement loginButton = chDriver.findElement(lg);
		
		loginButton.click();
		
		
	}

}
