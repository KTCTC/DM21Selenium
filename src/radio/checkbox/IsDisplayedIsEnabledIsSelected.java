package radio.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsEnabledIsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='Option 2' and @type = 'radio']"));
		
		System.out.println(radio.isDisplayed());
		System.out.println(radio.isEnabled());
		System.out.println(radio.isSelected());
		radio.click();
		System.out.println(radio.isDisplayed());
		System.out.println(radio.isEnabled());
		System.out.println(radio.isSelected());
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='checkbox3' and @type = 'checkbox']"));
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		checkBox.click();
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
	}

}
