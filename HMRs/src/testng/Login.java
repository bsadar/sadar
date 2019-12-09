package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver bo;
  @Test
  public void TC2_1() {
	        be();
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	    bo.findElement(By.name("Submit")).click();
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");

	bo.close();
	   
  }
  @Test
    void tc2_2(){
	 be();
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
      bo.findElement(By.name("txtPassword")).sendKeys("");
      bo.findElement(By.name("Submit")).click();
      
    Assert.assertEquals(bo.switchTo().alert().getText(),"User Name not given!");
    
      bo.switchTo().alert().accept();
      bo.close();
  }
  void be(){
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	  bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
  }

}
