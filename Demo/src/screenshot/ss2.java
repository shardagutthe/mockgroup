package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ss2 {
	

		public static void Demo() throws IOException {
			int i=0;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharda\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://vctcpune.com/");
			
			for(i=1;i<=5;i++) {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sharda\\Desktop\\Screenshot\\ss"+i+".jpg");
	
		FileHandler.copy(source, dest);

			
		}

		}
}



