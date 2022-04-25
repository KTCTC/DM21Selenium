package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+"\\DM21Prop.properties");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		String txt = driver.findElement(By.xpath("//h3[@id='res']/center")).getAttribute("innerHTML"); // getAttribute("innerText")
		System.out.println(txt);
		
		
	}

}
