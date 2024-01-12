package testNGstudy;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGClass3 {
  @Test
  public void fbLaunch()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("fb launching" ,true);
  }
  
  @Test
  public void instaLaunch()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  Reporter.log("insta launching" ,true);
  }
	@Test
	public void twitterLaunch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/");
		 Reporter.log("twitter launching" ,true);
	  
  }
}
