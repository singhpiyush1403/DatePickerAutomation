import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	String expectedDay = "2";
	String expectedMonth = "May";
	String expectedYear = "2022";
	
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	WebElement datepicker = driver.findElement(By.id("datepicker"));
	datepicker.click();
	
	
	System.out.println("Finished");
	driver.close();

	}

}
