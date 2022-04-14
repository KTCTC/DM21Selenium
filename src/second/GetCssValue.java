package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		WebElement txt = chDriver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
		String fontFam = txt.getCssValue("font-family");
		System.out.println(fontFam);
		String fontSize = txt.getCssValue("font-size");
		System.out.println(fontSize);
		
		String col = txt.getCssValue("color");
		
		System.out.println(col);
	}

}
