package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmalert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();//confirmalertbox insepct
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		

}
}



















