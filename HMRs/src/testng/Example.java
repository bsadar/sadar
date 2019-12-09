package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example {
  @Test
  public void Tc1() {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	    WebDriver  bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	   bo.close();
  }
  
  
  
  
}
