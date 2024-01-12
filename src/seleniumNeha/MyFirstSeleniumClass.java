package seleniumNeha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumClass {

	public static void main(String[] args) 
	{  WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
		
	

	}

}
