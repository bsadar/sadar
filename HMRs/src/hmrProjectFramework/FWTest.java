package hmrProjectFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FWTest {
	WebDriver br;
	//build path value
	String bpath="https://bsadar.github.io/hmrbuild1/Loging.html";
	
@BeforeMethod
  public void be() {
	  // opening browser
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\git\\rrr\\sadarclass\\src\\brosers\\geckodriver.exe");
		 br= new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\browserexe\\chromedriver.exe");
		//br=new ChromeDriver();
	  // entering build path
		 br.get(bpath);
		 br.manage().window().maximize();
  }

  @AfterMethod
  public void bclose() {
	  //browser close
	 br.quit();
  }
	
  @Test(enabled=true,priority=1,groups="Login")
  public void TC_00001() {
	  //enter valid value in userid text field
	     br.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys("sadar");
	     Thread.sleep(3000)	;	
	  //enter valid value in password text field
	     br.findElement(By.xpath("//input[@name='pass']")).sendKeys("sadar");
	  //click on login button
	     br.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	     //actual result: getting title of page
		String ar=br.getTitle();
	     //Expected result: giving expected result
		String er="MainHMR";
	  // comparaing expected and actual result
		Assert.assertEquals(er,ar);
  }
  
  
  
 

}
