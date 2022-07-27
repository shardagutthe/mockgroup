package SELENIUMWEBDRIVER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getnavigate {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();  //perticular tab close
		
		Thread.sleep(2000);
		driver.quit();      //browser close 
				
		WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("https://www.paytm.com/");
	
		
		
		
		
	}
	


		
		


}

