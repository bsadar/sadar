package datadriven;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Datadrv {
 @Test(dataProvider = "inputdata")
  public void testcase(String ud, String pd) {
	  
	   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chorme107\\chromedriver.exe");
		// open firefox browser 
	    ChromeDriver  bo=new ChromeDriver();
		 //enter url in browser address
		 bo.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		 // Maximize screen
		 bo.manage().window().maximize();
		 //enter user id            
		bo.findElement(By.xpath("//body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys(ud);
	  //enter password
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys(pd);
	  //click on login button
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/center[1]/input[1]")).click();
	    //expected result
		String er= "MainHMR";
		//actual result
	    String ar=bo.getTitle();
	   //compare expected result and actual resul
	   Assert.assertEquals(ar,er);
	   // close the browser
	   bo.quit();
	  
	}
	   
	
  @DataProvider
  public Object[][] inputdata() {
	//create double array
	  Object[][] Cred = new Object[4][2]; 
	  //entering 1st user id and password values 
	  Cred[0][0] = "sadar";
	  Cred[0][1] = "sadar";
	//entering 2nd user id and password values
	  Cred[1][0] = "sadar1";
	  Cred[1][1] = "sadar";
	//entering 3rd user id and password values
	  Cred[2][0] = "sadar";
	  Cred[2][1] = "sadar";
	//entering 4th user id and password values
	  Cred[3][0] = "sadar";
	  Cred[3][1] = "sadar";
	  
	  return Cred; 
	
    }
  
  }

