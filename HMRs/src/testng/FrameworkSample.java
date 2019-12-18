package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameworkSample {
	WebDriver bo;
	String buildpath="http://apps.qaplanet.in/qahrm/login.php";
	   @Test(enabled=true,priority=1,groups="Login") 
	 //valid&valid
	  public void TC2_1() {
		     
			bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	        bo.findElement(By.name("Submit")).click();
	         Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	       
	  }
	  
	  
	  @BeforeMethod
	  void buildExecution(){
		  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     bo=new FirefoxDriver();
			bo.get(buildpath);
	  }
	  @AfterMethod
	  void buildClose(){
		  bo.close(); 
	  }
}
