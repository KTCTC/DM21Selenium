package second;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		
		WebElement input = chDriver.findElement(By.xpath("//form//div//input"));
		input.sendKeys("KTCTC");
		
		List<WebElement> inp = chDriver.findElements(By.xpath("//form//div//input/div"));
		int i=1;
		for(WebElement each:inp)
		{
			each.sendKeys("KTCTC "+i);
			i++;
		}
		
		

	}

}
