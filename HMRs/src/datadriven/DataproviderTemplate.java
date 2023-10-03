package datadriventeting;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderTemplate {
  @Test(dataProvider = "inputdata")
  public void testcase(String uid, String pd) {
	  System.out.println( uid);
	  System.out.println( pd);
	  
	  
  }

  @DataProvider
  public Object[][] inputdata() {
	  
  Object[][]    data=new   Object[4][2];
	  
	  data[0][0]="sadar";
	  data[0][1]="sadar";
	  
	  data[1][0]="sadar";
	  data[1][1]="sadar";
	  
	  data[2][0]="sadar";
	  data[2][1]="sadar";
	  
	  data[3][0]="sadar";
	  data[3][1]="sadar";
	  
	  
	  return data;
  }
}
