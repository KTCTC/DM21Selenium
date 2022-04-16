package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownToolQA2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dd = driver.findElement(By.id("withOptGroup"));
		
		
		//dd.click();
		//dd.sendKeys("Group 1, option 2");
		driver.findElement(By.xpath("//*[@id='withOptGroup']//*[contains(text(),'Select Option')]")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Select Option')]")).sendKeys("Group 1, option 2");
		dd.sendKeys(Keys.ENTER);
		
		


	}

}
