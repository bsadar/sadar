package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameworkRegressionTest {
	WebDriver bo;
	
	   @Test(enabled=true,priority=1,groups="Login") 
	 //valid&valid
	  public void TC2_1() {
		     System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	        bo.findElement(By.name("Submit")).click();
	         Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	         bo.close();
	  }
	   @Test(enabled=true,priority=2,groups="Login") 
	   //valid&invalid
	   public void TC2_2() throws InterruptedException {
		     System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
			Thread.sleep(3000);
	         bo.findElement(By.name("txtPassword")).sendKeys("sadar");
	         Thread.sleep(3000);
	         bo.findElement(By.xpath("//input[@name='Submit']")).click();
	         Assert.assertEquals(bo.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/strong/font")).getText(), "Invalid Login");
	         bo.close();
	  }
	   @Test(enabled=true,priority=3,groups="Login") 
	   //invalid&valid
	   public void TC2_3() {
		   System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("sadar");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	         bo.findElement(By.xpath("//input[@name='Submit']")).click();
	         Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
	         bo.close();
	  }
	   @Test(enabled=true,priority=4,groups="Login")  
	   //invalid&valid
	   public void TC2_4() {
		   System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get("http://apps.qaplanet.in/qahrm/login.php");
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
	         bo.findElement(By.name("txtPassword")).sendKeys("");
	         bo.findElement(By.xpath("//input[@name='Submit']")).click();
	         Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
	         bo.switchTo().alert().accept();
	         bo.close();
	  }
	 
	  @Test (enabled=true,priority=5,groups="admin",dependsOnMethods =  "TC2_1" )
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
	  
	  @Test (enabled=true,priority=6,groups="admin",dependsOnMethods =  "TC2_1" )
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
