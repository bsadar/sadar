package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FMwn {
	WebDriver bo;
	public String bpath=" http://192.168.0.133:8000/IMS1/";
	
  @Test
  public void TC1() {
	
	     
  }
  
  
  @Test
  public void TC2() {
	  
  }
  @BeforeMethod
  void beex(){
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	  bo=new FirefoxDriver();
	  bo.get( bpath);
	  
  }
  @AfterMethod
  void bclose(){
	  bo.close();
	  
  }
  
}
