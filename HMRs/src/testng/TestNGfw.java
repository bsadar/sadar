package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNGfw {
	WebDriver bo;
	public String bpath="http://apps.qaplanet.in/qahrm/login.php";
	
  @Test(enabled=true,priority=1,groups="Login")
  public void tc1() {
	  bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
  }
  @Test(enabled=true,priority=2,groups="Login")
  public void tc2() throws InterruptedException {
	  Thread.sleep(6000);
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
	    bo.findElement(By.name("txtPassword")).sendKeys("");
	    Thread.sleep(6000);
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
	  bo.switchTo().alert().accept();
  } 
  @Test(enabled=true,priority=5,groups="Admin")
  public void tc5() {
	  bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	   bo.findElement(By.name("Submit")).click();
	 bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	 Assert.assertEquals(bo.getTitle(), "OrangeHRM - New Level of HR Management");
  }  
  
  @Test(enabled=true,priority=3,groups="Login")
  public void tc3() throws InterruptedException {
	  Thread.sleep(6000);
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
	    bo.findElement(By.name("txtPassword")).sendKeys("");
	    Thread.sleep(6000);
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
	  bo.switchTo().alert().accept();
  } 
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	  bo=new FirefoxDriver();
	  bo.get( bpath);
  }

  @AfterMethod
  public void afterMethod() {
	  bo.close();
  }

}
