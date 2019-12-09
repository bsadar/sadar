package hmrProjectFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FWTest {
	String hmr_Bildpath="http://apps.qaplanet.in/qahrm/login.php";
	WebDriver bo;
	
  @Test(enabled=true,priority=2,groups="Login")
 
  public void TC_0002_1() {
	  bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.getTitle(), "saOrangeHRM");
  }
  
  @Test(enabled=true,priority=2,groups="admin")
  
  public void TC_0002_2() {
	  bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("invalid");
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
	 }
  
  @Test(enabled=true,priority=2,groups="admin",dependsOnMethods =  "TC_0002_1")
  //,dependsOnMethods =  ""
  public void TC_0004() {
	  bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	   bo.findElement(By.name("Submit")).click();
	   bo.findElement(By.linkText("Logout")).click();
	  Assert.assertEquals(bo.getTitle(),"OrangeHRM - New Level of HR Management");
	 }
  
  
  @BeforeMethod
  public void be() {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	     bo=new FirefoxDriver();
		bo.get(hmr_Bildpath);
  }

  @AfterMethod
  public void bclose() {
	  bo.close();
  }

}
