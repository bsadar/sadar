package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FW1 {
	WebDriver bo;
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	
	@Test(enabled=true,priority=1,groups="main")
	void TC2_1(){
		
	
	bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
   bo.findElement(By.name("Submit")).click();
   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
  
	}

	@Test(enabled=true,priority=2,groups="main")
	void TC2_4(){
		
	
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
        bo.findElement(By.name("txtPassword")).sendKeys("");
   bo.findElement(By.name("Submit")).click();
   Assert.assertEquals(bo.switchTo().alert().getText(),"User Name not given!");
   bo.switchTo().alert().accept();

   
   
  
	}

  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	    bo=new FirefoxDriver();
	    bo.get(bpath);
  }

  @AfterClass
  public void afterClass() {
		bo.close();
  }

}
