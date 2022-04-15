package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("//input[@value='checkbox2' and @type = 'checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='checkbox1' and @type = 'checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='checkbox3' and @type = 'checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='checkbox1' and @type = 'checkbox']")).click();
		
		checkProvidedCheckBox(driver.findElement(By.xpath("//input[@value='checkbox3' and @type = 'checkbox']")), false);

	}
	
	public static void checkProvidedCheckBox(WebElement checkB, boolean checkFlag)
	{
		
		
		
	}

}
