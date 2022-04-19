package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesInSelenium3 {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		getCurrentSharePriceOfMentionedCompany2(driver, "Bank");
		
	String cntShare = getCurrentSharePriceOfMentionedCompany(driver, "Ltd");
	System.out.println(cntShare);
	   
	}

	public static String getCurrentSharePriceOfMentionedCompany(WebDriver driv, String name)
	{		
		   WebElement element = driv.findElement(By.xpath("//table[@class='dataTable']/tbody//td/a[contains(text(),'"+name+"')]/parent::td/following-sibling::td[3]"));

		  return element.getText();
	}
	
	public static void getCurrentSharePriceOfMentionedCompany2(WebDriver driv, String name)
	{		
		 List<WebElement> rows = driv.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		 
		 for (WebElement each:rows)
		 {
			String cname = each.findElement(By.xpath("td/a")).getText();

            if (cname.contains(name))
            {
            	System.out.println("Conmany Name = "+ cname);
            	String cntPrice = each.findElement(By.xpath("td[4]")).getText();
            	System.out.println("Current price ="+cntPrice);
            }
			 
		 }
	}
	
}
