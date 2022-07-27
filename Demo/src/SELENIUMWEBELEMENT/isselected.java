package SELENIUMWEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?");
		
		WebElement select = driver.findElement(By.xpath("//input[@value='1']"));
		
		boolean result = select.isSelected();
		System.out.println(result);

		//OR
		
		//System.out.println(select.isSelected());
}
}
