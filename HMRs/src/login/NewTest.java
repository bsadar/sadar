package login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver dd;
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
  @Test
  public void TC2_1() {
	  dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
      dd.findElement(By.name("txtPassword")).sendKeys("lab1");
      dd.findElement(By.name("Submit")).click();
      Assert.assertEquals(dd.getTitle(), "OrangeHRM");
  }
  
  @Test
  public void TC2_2() {
	  dd.get("http://apps.qaplanet.in/qahrm/login.php");
		dd.findElement(By.xpath("//td[2]/input")).sendKeys("");
      dd.findElement(By.name("txtPassword")).sendKeys("");
      dd.findElement(By.name("Submit")).click();
      Assert.assertEquals(dd.switchTo().alert().getText(), "User Name not given!");
      dd.switchTo().alert().accept();
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		 dd=new FirefoxDriver();
		dd.get(bpath);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  dd.close();
  }

}
