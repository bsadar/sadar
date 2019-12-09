package practNG;

import org.testng.annotations.Test;

public class SS {
  @BeforeClass
  public void beforeClass() {
	  System.out.println("method1");
	
  }
  @AfterClass
  public void afterClass(){
	  System.out.println("Method2");
  }
}
