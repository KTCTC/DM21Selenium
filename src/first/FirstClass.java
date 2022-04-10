package first;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
				
		ChromeDriver chDriver = new ChromeDriver();
		ChromeDriver chDriver2 = new ChromeDriver();		
		EdgeDriver edDriver = new EdgeDriver();
		
		
		
		edDriver.get("http://demo.automationtesting.in/Register.html");
		chDriver.get("https://www.javatpoint.com/");
		chDriver2.get("http://demo.automationtesting.in/Register.html");
		
		chDriver.close();
		edDriver.close();
		chDriver2.close();
		
	}

}
