package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsEnabledIsSelected2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		WebElement noRadioButton = driver.findElement(By.id("noRadio"));
		System.out.println(noRadioButton.isDisplayed());// isDisplayed method has returned false for disabled radio button
		System.out.println(noRadioButton.isEnabled());
		System.out.println(noRadioButton.isSelected());
		
		
		
		// if element is not displayed on UI then findelement method will throw NoSuchElementException
	      boolean flag = driver.findElement(By.xpath("//input[@value='Option 2' and @type = 'radio']")).isDisplayed();
		System.out.println(flag);
		
		
	}

}
