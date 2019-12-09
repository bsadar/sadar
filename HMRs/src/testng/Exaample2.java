package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exaample2 {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	   WebDriver bo=new FirefoxDriver();
	   bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
        bo.findElement(By.name("txtPassword")).sendKeys("");
   bo.findElement(By.name("Submit")).click();
   Assert.assertEquals(bo.switchTo().alert().getText(),"User Name not given!");
   bo.switchTo().alert().accept();
   bo.close();
  }
}
