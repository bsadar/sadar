package dependency;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DependMethod {
	WebDriver dd;
	
	 @Test (dependsOnMethods = { "ob" })
	 
	  public void logclick() {
	 
			dd.get("http://apps.qaplanet.in/qahrm/login.php");
			dd.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	      dd.findElement(By.name("txtPassword")).sendKeys("lab1");
	      dd.findElement(By.name("Submit")).click();
	     // assert.assertEquals(dd.getTitle(), "OrangeHRM");
	  }
	 
	  @Test
	 
	  public void ob() {
	 
		  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		  dd=new FirefoxDriver();
	 
	  }
	 
	  @Test (dependsOnMethods = { "logclick" })
	 
	  public void LogOut() {
	 
	 dd.close();
	 
	  }
	
	

}
