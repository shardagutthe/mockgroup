package SELENIUMWEBDRIVER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
	//	String title = driver.getTitle();
		System.out.println(driver.getTitle());
		//String exptitle = "Amazon.com. Spend less. Smile more.";
		
	//	if(title.equalsIgnoreCase(exptitle)){
	//		System.out.println("navigate to right page");
	//	}
	//	else {
			//System.out.println("navigate to wrong page");
	//	}
	
	
	
	
	}

}
