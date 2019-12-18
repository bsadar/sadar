package xml;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Login {
	@Parameters({ "username", "password" })
	@Test
	public void testCaseTwo(String username, String password) {
		System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	    WebDriver  bo=new FirefoxDriver();
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
		bo.findElement(By.xpath("//td[2]/input")).sendKeys(uid);
	    bo.findElement(By.name("txtPassword")).sendKeys(pd);
	   bo.findElement(By.name("Submit")).click();
	   Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	   bo.close();  
	}
}
