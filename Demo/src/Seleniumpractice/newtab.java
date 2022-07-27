package Seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //upcasting //launch the browser
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//String s = driver.getCurrentUrl();
	//	System.out.println(s);
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		String exptitle = "Instagram";
		if(title.equalsIgnoreCase(exptitle)) {
			System.out.println("kahitri");
		}
		else {
			System.out.println("kahichnahi");
			
		}
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
		driver.manage().window().maximize();
	
	
	}
}
