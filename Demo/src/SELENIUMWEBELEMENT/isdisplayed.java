package SELENIUMWEBELEMENT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?");
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
			Thread.sleep(3000);
		WebElement display = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
	//	System.out.println(display.isDisplayed());
	 
		//OR
		
	boolean result = display.isDisplayed();
	System.out.println(result);
	
	}
}


