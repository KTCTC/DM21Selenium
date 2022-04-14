package second;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chDriver = new ChromeDriver();
		chDriver.get("https://www.facebook.com/");
		String data = chDriver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]")).getText();
		System.out.println(data);

	}

}
