package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement selectEle = driver.findElement(By.name("country"));
		Select sel = new Select(selectEle);
		
		sel.selectByIndex(2);
		
		sel.selectByValue("ASHMORE AND CARTIER ISLANDS");
		
		
		sel.selectByVisibleText("BRITISH INDIAN OCEAN TERRITORY");
		
		
		sel.deselectByVisibleText("BRITISH INDIAN OCEAN TERRITORY");
		
		

	}

}
