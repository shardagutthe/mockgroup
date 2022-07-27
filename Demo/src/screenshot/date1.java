package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class date1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	Date date1 = new Date(10); 
	String date= date1.toString().replace(" ","_").replace(":","_");

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	   driver.get("https://en-gb.facebook.com/r.php");
	  Thread.sleep(2000);

	  for (int i=0; i<=5; i++ ) {
	  File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	File dest =new File("D:\\Screenshot"+date1+".jpg");

	FileHandler.copy(source, dest);
	  }
	}

	}



