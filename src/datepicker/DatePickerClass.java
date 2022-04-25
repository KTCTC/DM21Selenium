package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerClass {
	public enum Months {January,February,March,April,May,June,July,August,September,October,November,December}
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://demoqa.com/date-picker");
		
		
	selectDateFromDatePicker(driver, "2016", Months.December, "14");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();	
		
		Select sel = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		sel.selectByVisibleText("2015");
		
		Select selmonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		selmonth.selectByVisibleText("April");
		
		driver.findElement(By.xpath("//*[@class='react-datepicker__month']//*[contains(@class,'react-datepicker__day react-datepicker__day--007') and contains(@aria-label,'April')]")).click();

	}
	
	public static void selectDateFromDatePicker(WebDriver driver, String yyyy, Months month, String dd)
	{
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Select sel = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		sel.selectByVisibleText(yyyy);
		
		Select selmonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		String mn = month.toString();
		selmonth.selectByVisibleText(mn);
		driver.findElement(By.xpath("//*[@class='react-datepicker__month']//*[contains(@class,'react-datepicker__day react-datepicker__day--0"+dd+"') and contains(@aria-label,'"+mn+"')]")).click();
		
	}

}
