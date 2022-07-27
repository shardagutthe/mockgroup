package SELENIUMWEBELEMENT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement list = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select s = new Select(list);
		List<WebElement> a = s.getOptions();
		int b = a.size();
		System.out.println(b);
		//OR
		//System.out.println(a.size());
		
		for(int i=0;i<=a.size()-1;i++) {
			System.out.println(a.get(i).getText());
		}
		
		
	

}
}
