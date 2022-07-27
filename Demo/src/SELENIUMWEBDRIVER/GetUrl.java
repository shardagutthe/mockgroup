package SELENIUMWEBDRIVER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chrome.com/");
		
		//String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
	
	
	
	
	
	
	}
}
