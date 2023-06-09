package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameworkSample {
	//Declaring browser object
	WebDriver bo;
	//intitializing build url
	String buildpath="http://apps.qaplanet.in/hrm/login.php";
	  //browser opening
	  @BeforeMethod
	  void buildExecution(){
		     System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
		     //opening chrome browser
		     bo=new FirefoxDriver();
		     bo.get(buildpath);
	  }
	//browser close
	  @AfterMethod
	  void buildClose(){
		  bo.close(); 
	  }
	
	 //valid test case
	  @Test(enabled=true,priority=1,groups="Login") 
	  public void Testcase1() {
		  //Enter valid value in userid text field
		bo.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
		  //enter valid value in password text field
	         bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		 // click on login button
	        bo.findElement(By.name("Submit")).click();
		  //actual result
		 String ActualResult= bo.getTitle();
		  //mentioning expected result
		String  ExpectedResult= "OrangeHRM";
		  //matching actual result and expected result
	         Assert.assertEquals(ActualResult,ExpectedResult);     
	  }
	  
}
