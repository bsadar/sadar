package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class FW {
	WebDriver bo;
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	//1000000
	@Test(enabled=true,priority=1,groups="Logn")
	void TC2_1(){
		  
	
	bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
   bo.findElement(By.name("Submit")).click();
   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
  
	}
	//1000000
		@Test(enabled=true,priority=10001,groups="main")
		void TC2_1001(){
			  
		
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
	    bo.findElement(By.name("txtPassword")).sendKeys("");
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
	   bo.switchTo().alert().accept();
		}
	
  @BeforeMethod

  public void be() {
	  
	 System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	 bo=new FirefoxDriver();
	 bo.get(bpath);
	 
	 
  }

  @AfterMethod
  public void bclose() {
		bo.close();
  }

}
