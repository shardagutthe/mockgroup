package SELENIUMWEBDRIVER;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();  //upcasting
		driver.get("https://www.amazon.com/");
		
		Dimension D = new Dimension(300,200);
		driver.manage().window().setSize(D);
		
		Thread.sleep(3000);
		Dimension D1 = new Dimension(700,500);
		driver.manage().window().setSize(D1);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		}
	
}
