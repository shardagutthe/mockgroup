package SELENIUMWEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(2000);	
	driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("dfnjksdkjfbrhr");
		
		
		
		
		
		
		
		
		
		}
}
