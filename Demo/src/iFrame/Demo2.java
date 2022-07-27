package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(6000);
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));//My First JavaScript page inspect
		
		Thread.sleep(6000);
		driver.switchTo().frame(iframe1);
		
		driver.findElement(By.xpath("//button[@type='button']")).click(); //time and date button inspect
		Thread.sleep(6000);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();//home page inspect
		

	
	
	}

}
