package MaveanGI.MavenAI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_TC2Test {
  @Test
  public void TC2() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
	  bo.findElement(By.xpath("//td[2]/input")).sendKeys("");
	    bo.findElement(By.name("txtPassword")).sendKeys("");
	    Thread.sleep(6000);
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
	  bo.switchTo().alert().accept();
	  bo.close();
  }
}
