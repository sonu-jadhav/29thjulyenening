package screenshot_1;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//---------->temporary location
		 
		 RandomString s=new RandomString();
		 
		 String rs = s.make(4);
		 
		File dest = new File("C:\\Users\\admin\\OneDrive\\Desktop\\New folder maven\\myScreenshot"+rs+" .png");	
		
		FileHandler.copy(source, dest);
		
	}
	

}
