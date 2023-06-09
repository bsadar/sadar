package testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example {
  @Test
  public void Tc1() {
	  System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	  //open firefox browser
	    WebDriver  bo=new FirefoxDriver();
	  //enter URL in borwser address
		bo.get("http://apps.qaplanet.in/qahrm/login.php");
	  //enter valid value in userid text field
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	  //enter valid value in password text field
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	  //click on login button
	   bo.findElement(By.name("Submit")).click();
	  //Getting Actual Result
	  String ActualResult=bo.getTitle();
	  //mentioning Expected Result
	  String ExpectedResult="OrangeHRM";
	  //matching Actaul &expected results
	   Assert.assertEquals(ActualResult,ExpectedResult);
	  //browser close
	   bo.close();
  }
  
  
  
  
}
