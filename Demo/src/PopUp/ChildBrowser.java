package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();  //click on new tab button
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> a1 = new ArrayList<String>(ids);
		String CWID = a1.get(1); //child browser address
		
		driver.switchTo().window(CWID);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		String CWID1 = a1.get(0);
		driver.switchTo().window(CWID1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		

}
}
