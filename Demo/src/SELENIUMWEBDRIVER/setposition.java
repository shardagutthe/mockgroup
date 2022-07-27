package SELENIUMWEBDRIVER;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver  driver = new ChromeDriver();  //upcasting
			driver.get("https://www.amazon.com/");
			
			//Dimension D = new Dimension(300,200); //set size
			//driver.manage().window().setSize(D);
			
			Thread.sleep(3000);
			Point x = new Point(200, 400);   //set position
			driver.manage().window().setPosition(x);
			
			
	}
}
