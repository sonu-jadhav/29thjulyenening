package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mytestclass {
  @Test
  public void mytest() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
		
  }
}
