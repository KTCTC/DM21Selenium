package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonToolQA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		//driver.findElement(By.id("yesRadio")).click();
		
		driver.findElement(By.xpath("//*[@id='yesRadio']/following-sibling::label")).click();
		
		//driver.findElement(By.id("impressiveRadio")).click();
		
		driver.findElement(By.xpath("//*[@id='impressiveRadio']/following-sibling::label")).click();
		
		
	}

}
