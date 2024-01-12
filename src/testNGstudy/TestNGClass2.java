package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass2 {
  @Test
  public void mymethod() 
  {
	  Reporter.log("Hi this is Reporter ,without boolean parameter", true);
  }
}
