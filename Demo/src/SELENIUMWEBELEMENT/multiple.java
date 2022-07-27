package SELENIUMWEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class multiple {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/r.php?");
				Thread.sleep(2000);

			WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
			Select c = new Select(year);
			boolean result = c.isMultiple();
			System.out.println(result);
		
	
	
	
	}
	}


