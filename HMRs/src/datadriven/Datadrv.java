package datadriven;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class Datadrv {
  @Test(dataProvider = "LoginCredentials")
  public void TC1(String uid, String pd) {
	 
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	    WebDriver  bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys(uid);
	    bo.findElement(By.name("txtPassword")).sendKeys(pd);
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	   bo.close();  
  }

  @DataProvider
  public Object[][] LoginCredentials() { 
	  Object[][] Cred = new Object[4][2];                  
  Cred[0][0] = "qaplanet1";
  Cred[0][1] = "lab1";

  Cred[1][0] = "qaplanet1";
  Cred[1][1] = "lab1";

  Cred[2][0] = "qaplanet1";
  Cred[2][1] = "lab1";

  Cred[3][0] = "qaplanet1";
  Cred[3][1] = "lab1";
  return Cred;

  }

  }

