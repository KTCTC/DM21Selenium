package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select sel = new Select(driver.findElement(By.id("fruits")));		
		
		sel.selectByValue("apple");		
		sel.selectByVisibleText("Orange");
		sel.selectByVisibleText("Grape");
		
		WebElement first = sel.getFirstSelectedOption();
		
		System.out.println(first.getText());
		
		
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		
		for (WebElement each: allSelected)
		{
			System.out.println(each.getText());
		}
		
	 List<WebElement> allOptions = sel.getOptions();
	 
	 Iterator<WebElement> itr = allOptions.iterator();
	 while(itr.hasNext())
	 {
		System.out.println(itr.next().getText()); 
	 }
	 
		
		

	}

}
