package SELENIUMWEBDRIVER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtab {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.instagram.com/");
	
	
	
	
	
	
	
	
	}
	
	
	

}
