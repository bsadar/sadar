package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameworkRegressionTest {
	WebDriver bo;
	
	   @Test(enabled=true,priority=1,groups="Login") 
	 
	  public void TC2_1() {
		     System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	        bo.findElement(By.name("Submit")).click();
	         Assert.assertEquals(bo.getTitle(), "tOrangeHRM");
	         bo.close();
	  }
	   @Test(enabled=true,priority=2,groups="Login")  
	   public void TC2_2() {
		     System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	       bo.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[2]/input[1]")).click();
	         Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	         bo.close();
	  }
	   @Test(enabled=true,priority=3,groups="Login")  
	   public void TC2_3() {
		     System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	       bo.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[2]/input[1]")).click();
	         Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	         bo.close();
	  }
	 
	 
	  @Test (enabled=true,priority=2,groups="admin",dependsOnMethods =  "TC21" )
	   public void TC3() throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		       bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	        bo.findElement(By.name("Submit")).click();
		  bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		  Thread.sleep(4000);
		  Assert.assertEquals(bo.getTitle(), "OrangeHRM - New Level of HR Management");
		  bo.close();
	                     }
	  
	  @Test (enabled=true,priority=2,groups="admin",dependsOnMethods =  "TC21" )
	   public void TC4() {
		  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	        bo.findElement(By.name("Submit")).click();
		  bo.findElement(By.xpath("/html[1]/body[1]/div[3]/ul[1]/li[2]/a[1]")).click();
		  Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		  bo.close();
	                     }
}
