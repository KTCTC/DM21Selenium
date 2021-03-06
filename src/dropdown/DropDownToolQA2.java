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
		
		WebElement dd = driver.findElement(By.xpath("//*[@id='withOptGroup']//input"));
		
		dd.sendKeys("group 2, option 1");
		dd.sendKeys(Keys.ENTER);
		
       WebElement dd1 = driver.findElement(By.xpath("//*[@id='selectOne']//input"));
		
		dd1.sendKeys("Mrs.");
		dd1.sendKeys(Keys.ENTER);


	}

}
